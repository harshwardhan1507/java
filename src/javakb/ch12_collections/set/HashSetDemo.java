package javakb.ch12_collections.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * Demonstrates the HashSet class.
 * Key Concepts:
 * 1. Backed by a HashMap instance.
 * 2. Unordered: No guarantee of element order; order can change over time.
 * 3. Search, insert, and delete operations are O(1) constant time on average.
 * 4. Allows a single null element.
 * 5. Critical Contract: Objects inserted must correctly implement hashCode() and equals()
 *    to prevent duplicate entries.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        // 1. Instantiating a HashSet
        HashSet<String> set = new HashSet<>();

        // 2. Adding elements (add returns true if set did not already contain the element)
        System.out.println("Adding 'Apple': " + set.add("Apple")); // true
        System.out.println("Adding 'Banana': " + set.add("Banana")); // true
        System.out.println("Adding 'Apple' duplicate: " + set.add("Apple")); // false (not added)
        set.add("Orange");
        set.add(null); // Null values allowed

        // Order is not guaranteed, it will look random
        System.out.println("HashSet output (unordered): " + set);

        // 3. Custom Object Contract Demo
        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student(101, "Alice"));
        studentSet.add(new Student(101, "Alice")); // Duplicate object in content

        // Because hashCode() & equals() are overridden, size will be 1, not 2
        System.out.println("Student set size: " + studentSet.size()); 
    }

    // Static helper class representing a custom Object
    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        // Must override equals to compare object content
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return id == student.id && Objects.equals(name, student.name);
        }

        // Must override hashCode to ensure same bucket lookup
        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
}
