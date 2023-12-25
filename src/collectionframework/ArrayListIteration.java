package src.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
 Ways to navigate through the ArrayList
    1) For loop
    2) Enhanced For loop
    3) Iterator
       The Iterator provides very limited capabilities as we can iterate only in the
       forward direction and we can’t update or insert an element to the list while
       iterating. To overcome these problems, we can use ListIterator.
 */
public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple");

        // for loop
        for (int i=0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) + " ");
        }
        System.out.println();
        // enhanced for loop
        for (String s: fruits) {
            System.out.print(s + " ");
        }
        System.out.println();
        // using iterator object
        Iterator<String> i = fruits.iterator();
        while (i.hasNext()) {
            String f = i.next();
            System.out.print(f + " ");
            if (f.equals("Banana")) {
                i.remove(); // ArrayList item is removed while navigating it
            }
        }
        System.out.println();
        System.out.println(fruits);

        ListIterator<String> myList = fruits.listIterator();
        // traverse the list in forward direction
        while (myList.hasNext()) {
            System.out.println("Next element: " + myList.next() +
                    " at index: " + myList.nextIndex());
        }
        // traverse the list in backward direction
        // iterator is at the end at this point
        while (myList.hasPrevious()) {
            System.out.println("Prev element: " + myList.previous() +
                    " at index: " + myList.previousIndex());
        }

        // replace an element while traversing it
        while (myList.hasNext()) {
            String cur = myList.next();
            if (cur.equals("Mango")) {
                myList.set("Pineapple");
            }
        }
        // insert an element
        myList.add("Grape");
        System.out.println(fruits);
    }
}
