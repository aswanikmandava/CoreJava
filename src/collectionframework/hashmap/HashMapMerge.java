package src.collectionframework.hashmap;
/*
The merge function can be used to merge two Maps. This method takes three arguments:
    key — The key that needs to be merged.
    value — The value that needs to be inserted in case the key is not present.
    remappingFunction — This is a BiFunction that is used to update the value if the key is present.
 */
import java.util.Map;
import java.util.HashMap;
public class HashMapMerge {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        // student Math class marks map
        m1.put("s1", 20);
        m1.put("s2", 23);
        m1.put("s3", 35);
        m1.put("s4", 55);

        Map<String, Integer> m2 = new HashMap<>();
        // student Science class marks map
        m2.put("s1", 40);
        m2.put("s2", 30);
        m2.put("s3", 50);
        m2.put("s4", 60);

        // merge m1 and m2 for each student by averaging marks from Math and Science classes
        m1.forEach((key, value) -> m2.merge(key, value, (v1, v2) -> (v1 + v2)/2));
        System.out.println(m2);
    }
}
