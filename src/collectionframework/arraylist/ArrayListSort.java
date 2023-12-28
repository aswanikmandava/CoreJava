package src.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayListSort {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Kiwi");

        // sort in ascending order
        Collections.sort(fruits);
        System.out.println(fruits);

        // sort in descending order
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Desc order: " + fruits);

    }
}
