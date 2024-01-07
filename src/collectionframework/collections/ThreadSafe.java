package src.collectionframework.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ThreadSafe {
    public static void main(String[] args) {
        // to make an ArrayList thread-safe
        List<Integer> nums = Collections.synchronizedList(new ArrayList<>());
        nums.add(10);
        nums.add(20);
        nums.add(30);
        System.out.println("Nums: " + nums);

    }
}
