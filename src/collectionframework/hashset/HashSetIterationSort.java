package src.collectionframework.hashset;

import java.util.*;

public class HashSetIterationSort {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(20);
        hs.add(40);
        hs.add(10);
        System.out.println(hs);
        // enhanced for loop to iterate over hashset
        for (int i : hs) {
            System.out.println("Item: " + i);
        }

        // use iterator
        Iterator<Integer> hi = hs.iterator();
        while (hi.hasNext()) {
            System.out.println("Item: " + hi.next());
        }

        // Since a HashSet stores the elements in random order, it is not possible to
        // store the elements in a HashSet in sorted order. If we want to sort the
        // elements of a HashSet, then we should convert it into some other Collection such as a List
        List<Integer> mList = new ArrayList<>(hs);
        Collections.sort(mList);
        //System.out.println("Sorted items: " + mList);
        mList.forEach(System.out::println);
    }
}
