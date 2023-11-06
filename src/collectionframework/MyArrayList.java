package collectionframework;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;    // interface
import java.util.Collections;   // class


public class MyArrayList {
    public static void main(String[] args) {
        // define an array list of integers
        // Collection<Integer> myobj = new ArrayList<>();
        // Use ArrayList if you need to work with element indices
        // ArrayList<Integer> myobj = new ArrayList<>();
        // List is the interface. ArrayList the class that implements List
        List<Integer> myobj = new ArrayList<>();
        myobj.add(51);
        myobj.add(24);
        myobj.add(42);   // List accepts duplicates

        // get the element at index 1
        System.out.println("Index 1 item: " + myobj.get(1));
        // find the element index of 5
        System.out.println("Item 5 index: " + myobj.indexOf(5));

        System.out.println("Length of list: " + myobj.size());
        // print the entire list
        System.out.println(myobj);

        // to sort the list
        Collections.sort(myobj);
        System.out.println("Sorted list: " + myobj);
    }
}
