package src.collectionframework.hashmap;

/*
The compute(Key, BiFunction) method allows us to update a value in HashMap.
This method tries to compute a mapping for the specified key and its current mapped value
(or null if no current mapping is found). This method is used to atomically update a value
for a given key in HashMap.
*/
import java.util.Map;
import java.util.HashMap;
public class HashMapCompute {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        // Cricketer century map
        m.put("Sachin", 100);
        m.put("Saurav", 60);
        m.put("Dravid", 70);
        m.put("Laxman", 30);

        // this will increment Dravid centuries by 5 as Dravid key exists
        m.compute("Dravid", (k, v) -> v == null ? 10 : v + 5);

        // this will insert new key/value pair as Sehwag doesn't exist with a default value of 10
        m.compute("Sehwag", (k, v) -> v == null ? 10: v + 5);

        // The computeIfAbsent(Key, Function) method of the HashMap class is used to compute the
        // value for a given key using the given mapping function and enter that computed value in HashMap;
        // otherwise, it’s null. Please note that the computeIfAbsent() will work only if the key is not
        // present or if the key is present with a null value.
        m.computeIfAbsent("Yuvraj", k -> k.length()*10);

        // this will update Yuvraj centuries since it already exists
        m.computeIfPresent("Yuvraj", (k, v) -> v == null ? 10 : k.length());
        // this will not insert Raju as no such key already exists
        m.computeIfPresent("Raju", (k, v) -> v == null ? 10 : k.length());
        System.out.println(m);
    }
}
