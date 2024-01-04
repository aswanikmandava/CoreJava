package src.collectionframework.linkedhashmap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // create LinkedHashMap with initial capacity of 16 elements,
        // load factor of 0.75 and access order enabled (most frequently accessed elements will be kept at last position)
        HashMap<String, Integer> lhm = new LinkedHashMap<>(16, 0.75f, true);
        lhm.put("Apple", 500);
        lhm.put("Google", 325);
        lhm.put("Amazon", 330);
        lhm.put("Microsoft", 320);
        System.out.println(lhm);
        lhm.get("Amazon");
        lhm.get("Google");
        lhm.get("Amazon");
        System.out.println("After some retrievals: " + lhm);
    }
}
