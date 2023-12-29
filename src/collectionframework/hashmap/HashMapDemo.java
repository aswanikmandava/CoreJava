package src.collectionframework.hashmap;

import java.util.Map;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        // student marks
        m.put("Mark Zen", 100);
        // insert with the same key will update new value
        m.put("Mark Zen", 95);
        // following will not update
        m.putIfAbsent("Mark Zen", 90);
        // following will add a new key pair
        m.putIfAbsent("Alex Cook", 80);
        System.out.println(m);

        // get method takes a key as a parameter and returns the value corresponding to that key.
        // If the key is not present, it returns null.
        System.out.println("Value corresponding to Mark Zen: " + m.get("Mark Zen"));
        System.out.println("Value corresponding to Mark ZenTest: " + m.get("Mark ZenTest"));
        System.out.println("Value corresponding to Mark ZenTest: " + m.getOrDefault("Mark ZenTest", 0));

        // replaces the value of the key with the new value provided as a parameter and returns the
        // old value. If the key is not present, then it returns null.
        System.out.println("Replace if the key exists only: " + m.replace("Alex Cook", 85));
        System.out.println("Map before replace all" + m);
        // using replaceAll to add 5 to each key in map
        m.replaceAll((k, v) -> v+5);
        System.out.println(m);

        // remove an element by key which returns its value if found, else null
        System.out.println(m.remove("Alex Cook"));

        // remove an element by key and its associated value
        // returns true if the key is removed, else false.
        System.out.println(m.remove("Mark Zen", 95));
    }
}
