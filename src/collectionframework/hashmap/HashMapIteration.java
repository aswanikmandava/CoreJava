package src.collectionframework.hashmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;

public class HashMapIteration {
    public static void main(String[] args) {
        Map<String, Float> sp = new HashMap<>();
        sp.put("Cisco", 120.10f);
        sp.put("Microsoft", 263.68f);
        sp.put("Alphabet", 300.23f);
        sp.put("Meta", 320.47f);

        Set<Entry<String, Float>> es = sp.entrySet();   // returns a set of key-value entries
        for (Entry<String, Float> e : es) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }

        System.out.println("Iterating using an iterator object");
        Iterator<Entry<String, Float>> i = es.iterator(); // get the iterator on the EntrySet object
        // we can remove a key from the EntrySet, then it is also removed from the original Map
        while (i.hasNext()) {
            Entry<String, Float> e = i.next();
            System.out.println("Company: " + e.getKey() + ", Price: " + e.getValue());
            if (e.getKey().equals("Meta")) {
                System.out.println("Removing Meta from HashMap");
                i.remove();
            }
        }
        System.out.println("Iterating using forEach method ...");
        sp.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}
