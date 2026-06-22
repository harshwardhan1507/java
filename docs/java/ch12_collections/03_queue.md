# Chapter 12.3: The Queue and Deque Interfaces

## Simple Intuition

A **Queue** is designed to hold elements prior to processing. Typically, a queue orders elements in a **FIFO (First-In-First-Out)** manner, resembling a line at a supermarket: the customer who arrives first is served first, and new arrivals join the back of the line.

A **Deque** (Double Ended Queue, pronounced "deck") is a linear collection that supports element insertion and removal at both ends (both front and back). It can be used as a FIFO Queue or a LIFO Stack.

---

## 1. [QueueInterfaceDemo.java](../../../src/javakb/ch12_collections/queue/QueueInterfaceDemo.java) — Core Interface

**Concept:** `Queue` is an interface (`java.util.Queue`). It organizes its operations into two distinct behavior groups when a operation cannot be completed immediately (such as polling an empty queue, or adding to a full capacity-restricted queue):

### Queue Methods Comparison:
| Operation Type | Throws Exception | Returns Special Value (null or false) |
|---|---|---|
| **Insert** | `add(e)` | `offer(e)` |
| **Remove** | `remove()` | `poll()` |
| **Examine** | `element()` | `peek()` |

---

## 2. [PriorityQueueDemo.java](../../../src/javakb/ch12_collections/queue/PriorityQueueDemo.java) — Priority-Based Heap

**Concept:** Unlike standard FIFO queues, a `PriorityQueue` retrieves elements based on their **priority** (either natural ordering or a custom `Comparator` provided at construction time). 

### Heap Mechanics:
* **Underlying Structure:** Backed by a priority heap (binary heap represented as an array).
* **Ordering:** The head of the queue is always the *least* element with respect to the specified ordering (min-heap by default).
* **Iteration Warning:** Iterating through a `PriorityQueue` using an iterator/for-each loop does **not** guarantee any order. You must repeatedly call `poll()` to retrieve elements in sorted priority order.

---

## 3. [ArrayDequeDemo.java](../../../src/javakb/ch12_collections/queue/ArrayDequeDemo.java) & [DequeDemo.java](../../../src/javakb/ch12_collections/queue/DequeDemo.java) — Double-Ended Queue

**Concept:** `Deque` extends `Queue` and supports insertion/removal at both ends. `ArrayDeque` is the resizable array-backed implementation of Deque.

```
            [Head / Front] <=======================> [Tail / Back]
      addFirst() / removeFirst()               addLast() / removeLast()
```

### Stack & Queue Methods in Deque:
Because `Deque` supports both ends, it provides modern equivalents for both Stack and Queue operations:

* **As a FIFO Queue:**
  * Enqueue: `offer(e)` / `offerLast(e)`
  * Dequeue: `poll()` / `pollFirst()`
* **As a LIFO Stack:**
  * Push: `push(e)` / `addFirst(e)`
  * Pop: `pop()` / `removeFirst()`

---

## Performance and Time Complexity

| Collection | Add / Offer | Remove / Poll | Peek / Element | Underlying Structure |
|---|---|---|---|---|
| **LinkedList** (as Queue) | $O(1)$ | $O(1)$ | $O(1)$ | Doubly-Linked List |
| **ArrayDeque** | $O(1)$ (amortized) | $O(1)$ | $O(1)$ | Resizable Circular Array |
| **PriorityQueue** | $O(\log N)$ | $O(\log N)$ | $O(1)$ | Binary Heap |

---

## Stack vs. ArrayDeque vs. LinkedList

| Feature | Legacy Stack | ArrayDeque | LinkedList |
|---|---|---|---|
| **Role** | LIFO Stack only | LIFO Stack & FIFO Queue | LIFO Stack & FIFO Queue & List |
| **Thread Safety** | Synchronized (slow) | Not Synchronized (fast) | Not Synchronized (fast) |
| **Null Elements** | Allowed | Rejected (throws NPE) | Allowed |
| **Memory Efficiency** | Low | High (contiguous array) | Low (node pointer overhead) |
| **Cache Locality** | Medium | Excellent | Poor |

---

## Common Developer Mistakes

1. **Iterating through a PriorityQueue expecting order:** Printing a `PriorityQueue` directly or using a loop to copy it prints the binary heap's internal array, which is unsorted. To get elements in order, you must poll them one by one:
   ```java
   // WRONG for sorted printing:
   for(int n : priorityQueue) { System.out.println(n); }
   
   // CORRECT:
   while(!priorityQueue.isEmpty()) { System.out.println(priorityQueue.poll()); }
   ```
2. **Using LinkedList for Stack/Queue when performance matters:** `ArrayDeque` is consistently faster than `LinkedList` because it operates on a contiguous circular array in memory, taking advantage of CPU cache locality. LinkedList allocates a new Node object on the heap for every single insertion, creating garbage and causing pointer-chasing delays.
3. **Inserting null into an ArrayDeque or PriorityQueue:** Unlike LinkedList, `ArrayDeque` and `PriorityQueue` do not support `null` elements. Attempting to insert `null` will throw a `NullPointerException`.
