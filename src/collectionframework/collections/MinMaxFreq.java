package src.collectionframework.collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class MinMaxFreq {
    public static void main(String[] args) {
        Integer[] nums = {10, 3, 5, 7, 19, 9, 20};
        List<Integer> numList = new ArrayList<>(Arrays.asList(nums));
        numList.add(15);
        numList.add(20);
        numList.add(20);
        numList.add(5);
        // find max element
        System.out.println("Max element: " + Collections.max(numList));
        // find min element
        System.out.println("Min element: " + Collections.min(numList));
        // sort elements
        Collections.sort(numList);
        System.out.println("Sorted list: " + numList);
        // find frequency of an element in the list
        System.out.println("Element (20) frequency: " + Collections.frequency(numList, Integer.valueOf(20)));
        System.out.println("Element (5) frequency: " + Collections.frequency(numList, Integer.valueOf(5)));


    }

}
