package src.collectionframework.hashset;

import java.util.Set;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // This constructor creates a HashSet with an initial capacity of 16
        // and a load factor of 0.75.
        // Load factor is a number that defines when a Set should be resized.
        // If the load factor is 0.75, then the Set should be resized when it is 75% full.
        Set<Integer> hs = new HashSet<>();

        // add method is used to insert an element into set
        // If the element is not already present, then this method puts the element and returns true.
        // If the element is already present, then it returns false.
        System.out.println("Adding 10 to set: " + hs.add(10));
        System.out.println("Adding 20 to set: " + hs.add(20));
        System.out.println("Adding duplicate 10 to set: " + hs.add(10));
        System.out.println(hs);

        // Unlike ArrayList, there is no get() method in a HashSet
        // because a HashSet is not backed by an array.
        // The elements are stored in random order in a HashSet, and we can’t get a particular element.
        // If we want to check whether a particular element is in the HashSet or not,
        // then we can use the contains() method.
        System.out.println("Checking if 20 is in set: " + hs.contains(20));

        // remove method is used to remove an element
        hs.remove(20);

        // clear method is used to remove all elements in a set
        hs.clear();

        System.out.println("Is set empty: " + hs.isEmpty());

    }
}
