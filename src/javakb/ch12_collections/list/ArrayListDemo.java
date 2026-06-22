package javakb.ch12_collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstrates the ArrayList class.
 * Key Concepts:
 * 1. Backed by a dynamic array.
 * 2. Default capacity is 10; grows by 50% (newCapacity = oldCapacity + oldCapacity/2) when full.
 * 3. Search (index-based) is O(1).
 * 4. Add/remove elements in arbitrary positions is O(N) due to element shifting.
 * 5. Not synchronized (not thread-safe).
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. Instantiating an ArrayList with an initial capacity (optional, but good practice if size is known)
        ArrayList<Integer> numbers = new ArrayList<>(5);

        // 2. Performance Check: Insertion at end is amortized O(1)
        numbers.add(10);
        numbers.add(40);
        numbers.add(20);
        numbers.add(50);
        numbers.add(30);

        System.out.println("Initial ArrayList: " + numbers);

        // 3. Inserting at a specific index: O(N) shifting occurs
        numbers.add(2, 99); // Inserts 99 at index 2
        System.out.println("After insertion at index 2: " + numbers);

        // 4. Searching for elements: index-based get is O(1)
        int thirdElement = numbers.get(3);
        System.out.println("Element at index 3: " + thirdElement);

        // 5. Utility methods: Sorting using Collections.sort()
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // 6. Converting ArrayList to standard array
        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.print("Converted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 7. Clearing the list
        numbers.clear();
        System.out.println("Is list empty after clear()? " + numbers.isEmpty());
    }
}
