package javakb.ch12_collections.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Demonstrates the core capabilities of the java.util.Queue interface.
 * Key Concepts:
 * 1. Represents a First-In-First-Out (FIFO) collection.
 * 2. Compares two sets of operations:
 *    - Operations that throw an exception on failure (add, remove, element)
 *    - Operations that return a special value (false/null) on failure (offer, poll, peek)
 */
public class QueueInterfaceDemo {
    public static void main(String[] args) {
        // 1. Instantiating a Queue (Using LinkedList implementation)
        Queue<String> line = new LinkedList<>();

        // 2. Inserting elements
        // offer() is preferred for capacity-restricted queues because add() throws an exception if full
        line.offer("Customer 1");
        line.offer("Customer 2");
        line.offer("Customer 3");
        System.out.println("Queue: " + line);

        // 3. Examining the head of the queue
        // peek() returns null if queue is empty; element() throws NoSuchElementException
        System.out.println("Head of queue (peek): " + line.peek()); 

        // 4. Removing elements (FIFO)
        // poll() returns null if queue is empty; remove() throws NoSuchElementException
        System.out.println("Served (poll): " + line.poll()); // Customer 1
        System.out.println("Served (poll): " + line.poll()); // Customer 2
        System.out.println("Queue after serving: " + line);

        // 5. Demonstrating empty queue behavior
        line.poll(); // Removes Customer 3. Queue is now empty.
        
        System.out.println("Polling empty queue (poll): " + line.poll()); // null
        try {
            line.remove(); // Will throw exception
        } catch (Exception e) {
            System.out.println("Exception caught: Cannot call remove() on empty queue!");
        }
    }
}
