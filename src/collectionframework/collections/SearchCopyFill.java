package src.collectionframework.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SearchCopyFill {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(12);
        nums.add(15);
        nums.add(20);
        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(10);

        // binary search for elements 15 in a sorted list
        System.out.println("Index of 12 is: " + Collections.binarySearch(nums, 12));
        // copy() method does not merge the elements of the two lists.
        // It replaces the elements in the destination list from the elements in the source list
        Collections.copy(nums, nums2);
        System.out.println("nums after copy operation: " + nums);

        // fill the list with default value
        List<Integer> myList = new ArrayList<>(nums2);
        Collections.fill(myList, Integer.valueOf(0));
        System.out.println("myList with default init: " + myList);

        // create an unmodifiable list
        List<Integer> readOnly = Collections.unmodifiableList(nums2);
        System.out.println("Read only: " + readOnly);
        // this will throw exception (UnsupportedOperationException)
        readOnly.add(100);
    }
}
