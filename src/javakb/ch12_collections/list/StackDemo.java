package javakb.ch12_collections.list;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Demonstrates the Stack class.
 * Key Concepts:
 * 1. Represents a Last-In-First-Out (LIFO) stack of objects.
 * 2. Extends Vector, meaning it inherits vector's array-backed structure and synchronization.
 * 3. Core stack operations: push, pop, peek, empty, search.
 * 4. Note: In modern Java, Deque (implemented by ArrayDeque) is preferred over Stack for LIFO operations.
 */
public class StackDemo {
    public static void main(String[] args) {
        // 1. Instantiating a Stack
        Stack<String> bookStack = new Stack<>();

        // 2. Push elements onto the stack (LIFO)
        bookStack.push("Java Basics Book");
        bookStack.push("Design Patterns Book");
        bookStack.push("Algorithms Book");
        System.out.println("Stack status: " + bookStack);

        // 3. Peek the top element (returns top without removing it)
        System.out.println("Top element (peek): " + bookStack.peek()); // Algorithms Book

        // 4. Search for an element
        // Returns 1-based distance from top of stack. Returns -1 if not found.
        int position = bookStack.search("Design Patterns Book");
        System.out.println("Position of 'Design Patterns Book' from top: " + position); // Should be 2

        // 5. Pop elements from the stack (retrieves and removes top)
        System.out.println("Popped: " + bookStack.pop()); // Algorithms Book
        System.out.println("Popped: " + bookStack.pop()); // Design Patterns Book
        System.out.println("Stack status after two pops: " + bookStack);

        // 6. Handling EmptyStackException
        bookStack.pop(); // Remove last element
        System.out.println("Is stack empty? " + bookStack.empty());

        try {
            bookStack.pop(); // This will throw exception
        } catch (EmptyStackException e) {
            System.out.println("Exception caught: Cannot pop from an empty stack!");
        }
    }
}
