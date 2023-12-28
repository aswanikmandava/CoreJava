package src.collectionframework.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedListDemo {
    public static void main(String[] args) {
        // init a linked list with no args
        LinkedList<Integer> mylink = new LinkedList<>();
        mylink.add(10); // appends element
        mylink.addLast(20); // appends element
        mylink.addFirst(5); // adds element at the beginning
        mylink.add(1, 15); // adds element at the specific index
        System.out.println(mylink);

        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(100);
        mylink.add(200);

        mylink.addAll(mylist); // adds collection at the end

        ArrayList<Integer> slist = new ArrayList<>();
        slist.add(125);
        slist.add(150);

        mylink.addAll(5, slist); // adds collection at specific index
        System.out.println(mylink);

        System.out.println("First: " + mylink.getFirst()); // gets first element
        System.out.println("Last: " + mylink.getLast()); // gets last element
        System.out.println("Element at index 2: " + mylink.get(2)); // gets element at index 2

        System.out.println("Remove first: " + mylink.remove()); // removes first element
        System.out.println("Remove last: " + mylink.removeLast()); // removes last element
        System.out.println("Remove element at index 4: " + mylink.remove(2)); // removes element at index 2
        System.out.println("Remove first occurrence of 125: " + mylink.remove(new Integer(125))); // removes element at index 2

        System.out.println(mylink);

        Collections.sort(mylink);

        System.out.println("Sorted linked list: " + mylink);
    }
}
