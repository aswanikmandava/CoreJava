package src.collectionframework.treemap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class TreeMapFetchRemove {
    public static void main(String[] args) {
        TreeMap<String, Float> tm = new TreeMap<>();
        tm.put("Cisco", 120.10f);
        tm.put("Meta", 320.47f);
        tm.put("Microsoft", 263.68f);
        tm.put("Alphabet", 300.23f);

        // fetch the value of a specific key
        System.out.println("Cisco stock price: " + tm.get("Cisco"));

        // fetch the smallest key (since the keys are sorted)
        System.out.println("Smallest key: " + tm.firstKey());
        //System.out.println("Smallest key: " + tm.firstEntry().getKey());

        // fetch the largest key
        System.out.println("Largest key: " + tm.lastKey());
        //System.out.println("Largest key: " + tm.lastEntry().getKey());

        // remove key
        System.out.println("Removing Alphabet: " + tm.remove("Alphabet"));

        // update the value only if the key exists
        System.out.println("Replacing Alphabet: " + tm.replace("Alphabet", 100.05f));
        System.out.println("Replacing Microsoft: " + tm.replace("Microsoft", 200.05f));

        // update the new value only if the existing key value matches the given input
        System.out.println("Replacing Microsoft (incorrect existing): " + tm.replace("Microsoft", 200.04f, 300.05f));
        System.out.println("Replacing Microsoft: " + tm.replace("Microsoft", 200.05f, 300.05f));



    }
}
