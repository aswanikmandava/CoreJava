package src.collectionframework.treemap;

/*
By default, when we store the Map’s stock data, it will be stored in sorted order by key.
But we need to store the data such that it is sorted by value. This means that the first element
will be the company with the lowest stock price, and the last element will be the company with
the highest stock price.

We know that while creating a TreeMap object we can provide a Comparator implementation that will
be used to sort the elements. We can write a Comparator implementation so that it sorts the elements
based on values instead of keys.
*/

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapSort {
    public static TreeMap<String, Float> sortByValues(TreeMap<String, Float> givenMap) {
        //Comparator<String> valueComparator = new Comparator<String>() {
        //    @Override
        //    public int compare(String k1, String k2) {
        //        int comp = givenMap.get(k1).compareTo(givenMap.get(k2));
        //        if (comp == 0) {
        //            return 1;
        //        }
        //        else {
        //            return comp;
        //        }
        //    }
        //};

        // anonymous Comparator inner class can be replaced with a lambda expression
        Comparator<String> valueComparator = (k1, k2) -> {
            int comp = givenMap.get(k1).compareTo(givenMap.get(k2));
            if (comp == 0) {
                return 1;
            }
            else {
                return comp;
            }
        };

        TreeMap<String, Float> myMap = new TreeMap<>(valueComparator);
        myMap.putAll(givenMap);
        return myMap;
    }
    public static void main(String[] args) {
        TreeMap<String, Float> sp = new TreeMap<>();
        sp.put("Cisco", 120.10f);
        sp.put("Meta", 320.47f);
        sp.put("Microsoft", 263.68f);
        sp.put("Alphabet", 300.23f);
        System.out.println("Companies are sorted by their price");
        System.out.println(sortByValues(sp));
    }
}
