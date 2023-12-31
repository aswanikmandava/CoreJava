package src.collectionframework.hashmap;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapOperations {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Mark Zen", 90);
        m.put("Alex Clare", 85);
        m.put("Aswani Mandava", 80);

        // check if a key exists
        if (m.containsKey("Aswani Mandava")) {
            System.out.println("Aswani Mandava key exists");
        }
        else {
            System.out.println("Key doesn't exist");
        }

        if (m.containsValue(80)) {
            System.out.println("80 value is associated with at least a key");
        }
        else {
            System.out.println("Value doesn't exist");
        }

        // If we need to fetch all the keys that are stored in a HashMap,
        // then we can use the keySet() method. This method returns a Set containing
        // all the keys present in the Map
        System.out.println("HashMap keys:");
        Set<String> keys = m.keySet();
        for (String k : keys) {
            System.out.println(k);
        }

        // If we need to fetch all the values stored in a HashMap, we can use the values() method.
        // This method returns a Collection containing all the values present in the Map.
        System.out.println("HashMap Values:");
        Collection<Integer> values = m.values();
        for (Integer v : values) {
            System.out.println(v);
        }

        // fetch key value pairs
        Set<Entry<String, Integer>> es = m.entrySet(); // returns a Set of Entry objects
        for (Entry<String, Integer> kv : es) {
            System.out.println("Key: " + kv.getKey() + ", Value: " + kv.getValue());
        }

        System.out.println("Is HashMap empty? " + m.isEmpty());
    }
}
