package javakb.ch12_collections.queue;

import java.util.ArrayDeque;

/**
 * Demonstrates the ArrayDeque class.
 * Key Concepts:
 * 1. Resizable-array implementation of the Deque (Double Ended Queue) interface.
 * 2. No capacity restrictions; grows as necessary.
 * 3. Faster than Stack when used as a stack (LIFO) because it's not synchronized.
 * 4. Faster than LinkedList when used as a queue (FIFO) because of cache locality (contiguous memory array).
 * 5. Does NOT allow null elements.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        // 1. ArrayDeque as a Stack (LIFO)
        System.out.println("--- ArrayDeque as a Stack ---");
        ArrayDeque<String> stack = new ArrayDeque<>();
        
        stack.push("Frame 1");
        stack.push("Frame 2");
        stack.push("Frame 3");
        
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek()); // Frame 3
        System.out.println("Pop: " + stack.pop());   // Frame 3
        System.out.println("Stack after pop: " + stack);

        // 2. ArrayDeque as a Queue (FIFO)
        System.out.println("\n--- ArrayDeque as a Queue ---");
        ArrayDeque<String> queue = new ArrayDeque<>();
        
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");
        
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek()); // Task 1
        System.out.println("Poll: " + queue.poll()); // Task 1
        System.out.println("Queue after poll: " + queue);
    }
}
