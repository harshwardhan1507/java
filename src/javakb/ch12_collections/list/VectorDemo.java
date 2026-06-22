package javakb.ch12_collections.list;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Demonstrates the Vector class.
 * Key Concepts:
 * 1. Backed by a dynamic array (legacy class re-engineered to implement List).
 * 2. Synchronized methods: thread-safe, but incurs performance overhead.
 * 3. Capacity growth: Doubles in size when full (by default, unless capacityIncrement is specified).
 * 4. Supports legacy Enumeration in addition to Iterator.
 */
public class VectorDemo {
    public static void main(String[] args) {
        // 1. Instantiating a Vector with initial capacity and capacity increment
        // When capacity is exceeded, it will grow by 3 elements instead of doubling
        Vector<String> vector = new Vector<>(3, 3);

        System.out.println("Initial Capacity: " + vector.capacity()); // Should be 3

        vector.add("Element1");
        vector.add("Element2");
        vector.add("Element3");
        
        System.out.println("Size: " + vector.size() + ", Capacity: " + vector.capacity());

        // Adding 4th element (exceeds capacity of 3)
        vector.add("Element4");
        System.out.println("After exceeding capacity -> Size: " + vector.size() + ", Capacity: " + vector.capacity()); // Capacity should be 6

        // 2. Legacy Enumeration traversal
        System.out.print("Legacy Enumeration iteration: ");
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // 3. Thread safety notes
        // Note: Standard Vector methods like add(), get(), and remove() are marked synchronized.
        // E.g., public synchronized boolean add(E e) { ... }
        // While safe for multi-threaded access, for single-threaded usage ArrayList is preferred.
    }
}
