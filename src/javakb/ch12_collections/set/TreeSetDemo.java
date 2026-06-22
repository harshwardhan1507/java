package javakb.ch12_collections.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Demonstrates the TreeSet class.
 * Key Concepts:
 * 1. Backed by a Red-Black Tree (TreeMap instance).
 * 2. Sorted: Elements are sorted in their natural ascending order or custom Comparator order.
 * 3. Search, insert, and delete are O(log N) logarithmic time operations.
 * 4. Implements NavigableSet, offering rich range-query and closest-match operations.
 * 5. Does NOT allow null elements (throws NullPointerException because elements must be compared).
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        // 1. Natural ordering TreeSet (Integer compares numerically, String alphabetically)
        TreeSet<Integer> sortedNumbers = new TreeSet<>();
        sortedNumbers.add(50);
        sortedNumbers.add(10);
        sortedNumbers.add(40);
        sortedNumbers.add(20);
        sortedNumbers.add(30);

        System.out.println("TreeSet natural sorted order: " + sortedNumbers); // [10, 20, 30, 40, 50]

        // 2. NavigableSet features
        System.out.println("First element (lowest): " + sortedNumbers.first()); // 10
        System.out.println("Last element (highest): " + sortedNumbers.last());   // 50
        
        // Closest match operations
        System.out.println("Lower than 30 (< 30): " + sortedNumbers.lower(30));   // 20
        System.out.println("Floor of 25 (<= 25): " + sortedNumbers.floor(25));    // 20
        System.out.println("Ceiling of 25 (>= 25): " + sortedNumbers.ceiling(25)); // 30
        System.out.println("Higher than 30 (> 30): " + sortedNumbers.higher(30)); // 40

        // Sub-set range operations
        System.out.println("HeadSet (elements < 30): " + sortedNumbers.headSet(30)); // [10, 20]
        System.out.println("TailSet (elements >= 30): " + sortedNumbers.tailSet(30)); // [30, 40, 50]

        // 3. Custom ordering using a custom Comparator (Descending order)
        TreeSet<String> customSortedSet = new TreeSet<>(Comparator.reverseOrder());
        customSortedSet.add("Banana");
        customSortedSet.add("Apple");
        customSortedSet.add("Mango");
        customSortedSet.add("Orange");

        System.out.println("Custom comparator TreeSet (Descending): " + customSortedSet);
    }
}
