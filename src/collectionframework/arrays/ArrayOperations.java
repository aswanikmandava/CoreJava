package src.collectionframework.arrays;
import java.util.Arrays;
import java.util.List;
public class ArrayOperations {
    public static void main(String[] args) {
        Integer[] nums = {10, 20, 30, 40, 50};
        List<Integer> numList = Arrays.asList(nums);    // returns fixed size list
        for (Integer i : numList) {
            System.out.println(i);
        }
        System.out.println("Accessing element at index 2: " + numList.get(2));
        // add and remove operations are not supported
        //numList.add(60);
        //numList.remove(Integer.valueOf(50));

        // If any changes are made to the resulting list, then changes are propagated to the original array
        // updating element at index 0
        numList.set(0, 100);
        System.out.println("Original source first element: " + nums[0]);
        System.out.println("List first element: " + numList.get(0));

        Integer[] numsCopy = Arrays.copyOf(nums, nums.length);
        Integer[] numsBigCopy = Arrays.copyOf(nums, nums.length+5);
        System.out.println("nums and numsCopy are equal? " + Arrays.equals(nums, numsCopy));
        System.out.println("nums and numsBigCopy are equal? " + Arrays.equals(nums, numsBigCopy));

        // fill each element with the default value
        Arrays.fill(numsBigCopy, 10);
        for ( int i : numsBigCopy ) {
            System.out.print(i + " ");
        }
    }
}
