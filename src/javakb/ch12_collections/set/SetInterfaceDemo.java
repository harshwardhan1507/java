package javakb.ch12_collections.set;

import java.util.HashSet;
import java.util.Set;

/**
 * Demonstrates the core capabilities of the java.util.Set interface.
 * Key Concepts:
 * 1. Collection that contains no duplicate elements.
 * 2. Models the mathematical set abstraction.
 * 3. Does not guarantee order (behavior depends on implementation).
 * 4. Demonstrates set operations: Union, Intersection, and Difference.
 */
public class SetInterfaceDemo {
    public static void main(String[] args) {
        // 1. Defining two sets for mathematical set operations
        Set<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        Set<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);

        // 2. UNION (All elements from both sets)
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB); // Performs Union operation
        System.out.println("Union (A U B): " + union); // [1, 2, 3, 4, 5, 6]

        // 3. INTERSECTION (Common elements in both sets)
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB); // Performs Intersection operation
        System.out.println("Intersection (A n B): " + intersection); // [3, 4]

        // 4. DIFFERENCE (Elements in A but not in B)
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB); // Performs Difference operation
        System.out.println("Difference (A - B): " + difference); // [1, 2]
    }
}
