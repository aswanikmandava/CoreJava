package collectionframework;

import java.util.Map;
import java.util.Hashtable;

// Map is a collection of key/value pairs similar to dictionary in python
// Map is an interface and the classes that implement are HashMap and Hashtable
// HashMap and HashTable work the same except that Hashtable is synchronized when
// working with multiple threads
public class MyMap {
    public static void main(String[] args) {
        Map<String, Integer> sports = new Hashtable<>();
        // add key value pairs. If the key exists, it's value is replaced with the given one
        sports.put("Cricket", 100);
        sports.put("Hockey", 200);
        sports.put("Tennis", 300);
        sports.put("Volleyball", 400);

        // print the mappings
        System.out.println("Map: " + sports);

        // print the keys
        System.err.println("Key Set:" + sports.keySet());

        // print the values
        System.out.println("Values: " + sports.values());

        // get the specific value using key
        System.out.println("Value of Tennis: " + sports.get("Cricket"));

        // remove the map entry by key
        sports.remove("Volleyball");
        System.out.println("Map after removing one : " + sports);

        // navigate the map
        for (String key:sports.keySet()) {
            System.out.println("Key: " + key + ", Val: " + sports.get(key));
        }
    }

    
}
