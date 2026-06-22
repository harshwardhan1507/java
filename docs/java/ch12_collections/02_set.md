# Chapter 12.2: The Set Interface

## Simple Intuition

A **Set** models the mathematical set abstraction. Unlike a `List`, which preserves the order of items and welcomes duplicates, a `Set` ensures that **every element inside it is completely unique**. If you try to add an item that is already present in the set, the set will simply reject the addition. 

---

## 1. [SetInterfaceDemo.java](../../../src/javakb/ch12_collections/set/SetInterfaceDemo.java) — Core Interface

**Concept:** `Set` is an interface (`java.util.Set`). It defines common set operations. By leveraging bulk methods, you can perform standard mathematical operations like Union, Intersection, and Difference on collections:

```java
Set<Integer> setA = new HashSet<>(List.of(1, 2, 3));
Set<Integer> setB = new HashSet<>(List.of(2, 3, 4));

// Union
Set<Integer> union = new HashSet<>(setA);
union.addAll(setB); // union contains [1, 2, 3, 4]

// Intersection
Set<Integer> intersection = new HashSet<>(setA);
intersection.retainAll(setB); // intersection contains [2, 3]

// Difference
Set<Integer> difference = new HashSet<>(setA);
difference.removeAll(setB); // difference contains [1]
```

---

## 2. [HashSetDemo.java](../../../src/javakb/ch12_collections/set/HashSetDemo.java) — Hashed Unique Storage

**Concept:** `HashSet` is backed by a `HashMap` (where elements are stored as the keys of the map, and a dummy object is used as the value). It provides constant-time operations but does not guarantee the order of elements.

### The `hashCode()` and `equals()` Contract:
To determine whether an element is a duplicate, `HashSet` uses hashing. When you add an object:
1. Java computes the object's hash code using `hashCode()`.
2. It looks up the corresponding "bucket" in the hash table.
3. If the bucket has existing objects, it uses `equals()` to check if the new object matches any of them.

> [!IMPORTANT]
> If you add custom objects (like `Student` or `Employee`) to a `HashSet`, you **must** override both `hashCode()` and `equals()`. If you fail to do this, Java will use the default `Object` implementations (which compare memory addresses), resulting in duplicate objects stored inside your Set.

---

## 3. [LinkedHashSetDemo.java](../../../src/javakb/ch12_collections/set/LinkedHashSetDemo.java) — Insertion-Ordered Set

**Concept:** `LinkedHashSet` extends `HashSet`. It maintains a doubly-linked list running through all its entries. This linked list defines the iteration order, which is the order in which elements were inserted into the set (insertion-order).

### Pros and Cons:
* **Pros:** Preserves insertion order during iteration.
* **Cons:** Marginally higher memory consumption and insertion overhead compared to `HashSet` due to keeping track of the linked list node pointers.

---

## 4. [TreeSetDemo.java](../../../src/javakb/ch12_collections/set/TreeSetDemo.java) — Sorted Red-Black Tree Set

**Concept:** `TreeSet` is backed by a Red-Black tree (`TreeMap`). It ensures elements are stored in sorted, ascending order. 

### Range and Navigation Queries:
Because elements are sorted, `TreeSet` implements `NavigableSet`, allowing you to fetch boundary values or perform range matching:
* `first()` / `last()`: Get absolute lowest/highest values.
* `lower(E e)` / `higher(E e)`: Finds the closest strictly smaller/larger element.
* `floor(E e)` / `ceiling(E e)`: Finds the closest smaller-or-equal/larger-or-equal element.
* `subSet(fromElement, toElement)`: Returns a view of the portion of this set within the range.

> [!WARNING]
> Since `TreeSet` relies on object comparison to sort and maintain its tree structure, elements inserted must either implement the `Comparable` interface (natural ordering) or you must supply a custom `Comparator` during instantiation. Furthermore, `TreeSet` does **not** allow `null` elements (throws `NullPointerException` on comparison).

---

## HashSet vs. LinkedHashSet vs. TreeSet

| Feature | HashSet | LinkedHashSet | TreeSet |
|---|---|---|---|
| **Underlying Data Structure** | Hash Table | Hash Table + Linked List | Red-Black Tree (Self-balancing tree) |
| **Ordering** | Unordered (random) | Insertion-ordered | Sorted (Natural / Custom Comparator) |
| **Add / Remove / Contains** | $O(1)$ constant time | $O(1)$ constant time | $O(\log N)$ logarithmic time |
| **Null Elements** | Allowed (one null) | Allowed (one null) | Not Allowed (throws `NullPointerException`) |
| **Memory Consumption** | Low | Medium | High |

---

## Common Developer Mistakes

1. **Forgetting to override `hashCode()` and `equals()` in custom objects:** This is the #1 bug with sets. If your class does not override these methods, two objects containing identical fields will be treated as different objects by a `HashSet`, bypassing the uniqueness guarantee.
2. **Mutating elements after inserting them into a Set:** If you insert a mutable object into a `HashSet` and subsequently change one of the fields used in `hashCode()`, the object's hash code changes. The set will no longer be able to find the object in its bucket, causing `contains()` to return `false` and preventing it from being removed, leading to memory leaks.
3. **Using `TreeSet` without a Comparator for non-Comparable objects:** Trying to add an object that does not implement `Comparable` to a default `TreeSet` will compile fine but will crash at runtime with a `ClassCastException` as soon as the first element comparison is attempted.
