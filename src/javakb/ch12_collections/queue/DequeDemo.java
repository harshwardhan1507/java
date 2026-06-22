package javakb.ch12_collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Demonstrates the java.util.Deque (Double Ended Queue) interface.
 * Key Concepts:
 * 1. Linear collection that supports element insertion and removal at both ends.
 * 2. Short for "double ended queue", pronounced "deck".
 * 3. Can be used as both FIFO Queue and LIFO Stack.
 * 4. Extends the Queue interface.
 */
public class DequeDemo {
    public static void main(String[] args) {
        // 1. Instantiating a Deque (using ArrayDeque implementation)
        Deque<String> deque = new ArrayDeque<>();

        // 2. Inserting elements at both ends
        deque.addFirst("Middle");      // [Middle]
        deque.addFirst("Front-Item");  // [Front-Item, Middle]
        deque.addLast("Back-Item");    // [Front-Item, Middle, Back-Item]

        System.out.println("Deque status: " + deque);

        // 3. Examining boundary elements
        System.out.println("First element (peekFirst): " + deque.peekFirst()); // Front-Item
        System.out.println("Last element (peekLast): " + deque.peekLast());   // Back-Item

        // 4. Removing from both ends
        System.out.println("Removed First: " + deque.removeFirst()); // Front-Item
        System.out.println("Removed Last: " + deque.removeLast());   // Back-Item

        System.out.println("Deque after removals: " + deque); // [Middle]
    }
}
