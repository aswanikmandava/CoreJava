package src.collectionframework.arrays;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Integer[] nums = {100, 32, 10, 25, 80};
        //Arrays.sort(nums);
        Arrays.parallelSort(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
