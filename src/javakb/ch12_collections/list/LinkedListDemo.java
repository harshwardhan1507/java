package javakb.ch12_collections.list;

import java.util.LinkedList;

/**
 * Demonstrates the LinkedList class.
 * Key Concepts:
 * 1. Backed by a doubly-linked list.
 * 2. Implements both List and Deque (Double Ended Queue) interfaces.
 * 3. Search (index-based) is O(N) because it requires traversal from head or tail.
 * 4. Add/remove elements at head/tail or at iterator position is O(1) pointer updates.
 * 5. Consumes more memory than ArrayList because each element (Node) stores data + next and prev pointers.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        // 1. Instantiating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // 2. Standard List operations
        linkedList.add("Node2");
        linkedList.add("Node3");
        System.out.println("Base List: " + linkedList);

        // 3. Deque operations (First & Last insertion/removal)
        linkedList.addFirst("Node1"); // O(1) insertion at head
        linkedList.addLast("Node4");  // O(1) insertion at tail
        System.out.println("After addFirst and addLast: " + linkedList);

        // 4. Retrieving boundary elements without removal
        System.out.println("First element (peekFirst): " + linkedList.peekFirst());
        System.out.println("Last element (peekLast): " + linkedList.peekLast());

        // 5. Index-based operations: O(N) traversal
        // The JVM optimizes by starting search from head or tail, whichever is closer
        String midElement = linkedList.get(2); 
        System.out.println("Element at index 2 (O(N) traversal): " + midElement);

        // 6. Deque retrieval/removal operations
        String first = linkedList.removeFirst(); // O(1) removal of head
        String last = linkedList.removeLast();   // O(1) removal of tail
        System.out.println("Removed: " + first + " and " + last);
        System.out.println("Final list: " + linkedList);
    }
}
