package src.collectionframework.arrays;

import java.util.Arrays;
public class ArraysDemo {
    public static void main(String[] args) {
        int[] numArr = {10, 12, 15, 17, 20, 23, 25, 28, 31};
        // since 13 is not in the array, the index of the first element greater than the key is returned.
        System.out.println("Index of 13 is at: " + Arrays.binarySearch(numArr, 13));
        System.out.println("Index of 20 is at: " + Arrays.binarySearch(numArr, 20));
        System.out.println("Index of 20 is at: " + Arrays.binarySearch(numArr, 10));

        // It is possible that we may not need to search the entire array. In that case,
        // we can provide the start and end index of the elements in the array that needs to be searched.
        System.out.println("Index of 23 is at: " + Arrays.binarySearch(numArr, 3, 7, 20));
    }
}
