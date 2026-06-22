package javakb.ch12_collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Demonstrates the PriorityQueue class.
 * Key Concepts:
 * 1. Backed by a priority heap (binary heap).
 * 2. Unordered during print/iteration, but elements are ordered when polling.
 * 3. Default ordering is natural ordering (min-heap, lowest value has highest priority).
 * 4. Can customize ordering using a custom Comparator.
 * 5. Retrieval/removal (poll) is O(log N); inserting (offer) is O(log N); lookup (peek) is O(1).
 * 6. Does not allow null elements.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        // 1. Instantiating a default PriorityQueue (Min-Heap: lowest number has highest priority)
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(40);
        minHeap.offer(10);
        minHeap.offer(30);
        minHeap.offer(20);

        // Note: Printing directly won't show sorted order because of the underlying binary heap array structure
        System.out.println("Underlying heap representation (printed directly): " + minHeap);

        // Polling elements will retrieve them in order: 10, 20, 30, 40
        System.out.print("Polling elements in priority order (Min-Heap): ");
        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();

        // 2. Instantiating a custom PriorityQueue (Max-Heap: highest number has highest priority)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.offer(40);
        maxHeap.offer(10);
        maxHeap.offer(30);
        maxHeap.offer(20);

        System.out.print("Polling elements in priority order (Max-Heap): ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
        System.out.println();
    }
}
