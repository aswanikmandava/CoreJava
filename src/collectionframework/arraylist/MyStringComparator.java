package src.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Comparator is an interface that allows to plugin custom sort logic
// Plugin in custom sort of strings based on length

public class MyStringComparator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java is strongly typed");
        list.add("Python is an interpreted language");
        list.add("C is a compiled language");

        System.out.println("My list: " + list);
        Collections.sort(list);
        System.out.println("My Sorted list: " + list);

        // overriding compare method of Comparator interface using anonymous innner class
        // add custom sort logic to string length for sorting items in ascending order
        Comparator<String> c = new Comparator<String>() {
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length()) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        // Comparator<String> c = new Comparator<String>() {
        //     public int compare(String s1, String s2) {
        //         if (s1.length() < s2.length()) {
        //             return 1;
        //         }
        //         else {
        //             return -1;
        //         }
        //     }
        // };
        Collections.sort(list, c);
        System.out.println("My custom sorted list by string length: " + list);

    }
}
