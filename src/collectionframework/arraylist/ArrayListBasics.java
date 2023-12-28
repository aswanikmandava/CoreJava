package src.collectionframework.arraylist;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
ArrayList is the most widely used implementation of the List interface.
    1) Elements are stored in the order of insertion.
    2) It allows the storage of duplicate elements.
    3) ArrayList also supports null elements.
*/
public class ArrayListBasics {
    public static void main(String[] args) {
        // init an empty ArrayList of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana"); // append to the list
        fruits.add("Grape");
        System.out.println("fruits: " + fruits);

        fruits.add(0, "Apple"); // insert at the specific index
        System.out.println("fruits size: " + fruits.size());

        // init an ArrayList using an existing Collection
        List<String> favFruits = new ArrayList<>(fruits);
        // init an ArrayList directly
        List<String> roundFruits = new ArrayList<>(Arrays.asList("Orange", "Watermelon"));
        List<String> mixFruits = new ArrayList<>(Arrays.asList("Pear", "Mango", "Kiwi"));
        // append a Collection to the ArrayList
        favFruits.addAll(roundFruits);
        // append a Collection at the end of the ArrayList
        favFruits.addAll(3, mixFruits);
        System.out.println("favFruits: " + favFruits);

        // get an element at index
        System.out.println("Element at index 3: " + favFruits.get(3));
        // get the index based on element's first occurrence
        System.out.println("Index of Mango: " + favFruits.indexOf("Mango"));
        // get the index based on element's last occurrence
        System.out.println("Index of Mango: " + favFruits.lastIndexOf("Mango"));

        // check if an element exists
        if (favFruits.contains("Mango")) {
            System.out.println("Found Mango");
        }

        // update an element at index
        favFruits.set(0, "PineApple");

        // remove an element at index
        favFruits.remove(2);
        // remove an element
        favFruits.remove("Watermelon");
        // remove all elements from a given Collection
        favFruits.removeAll(roundFruits);
        // remove all elements
        favFruits.clear();
        System.out.println(favFruits);

    }
}
