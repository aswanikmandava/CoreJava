package src.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Comparator is an interface that allows to plugin custom sort logic

public class MyComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(26);
        list.add(12);
        list.add(33);

        System.out.println("My list: " + list);
        Collections.sort(list);
        System.out.println("My Sorted list: " + list);

        // overriding compare method of Comparator interface using anonymous innner class
        // add custom sort logic to use last digit of an integer for sorting items
        Comparator<Integer> c = new Comparator<Integer>() {
            public int compare(Integer i1, Integer i2) {
                if (i1%10 > i2%10) {
                    return 1;   // this is a signal to swap the elements using sort algorithm
                }
                else {
                    return -1;
                }
            }
        };
        Collections.sort(list, c);
        System.out.println("My custom sorted list by last digit: " + list);
    }
}
