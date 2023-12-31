package src.collectionframework.treemap;
import com.sun.source.tree.Tree;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        // tree map with keys stored in descending order
        TreeMap<String, Float> sp = new TreeMap<>(Comparator.reverseOrder());
        sp.put("Cisco", 120.10f);
        sp.put("Meta", 320.47f);
        sp.put("Microsoft", 263.68f);
        sp.put("Alphabet", 300.23f);
        System.out.println("Reverse order tree map: " + sp);

        // hash map with keys stored in random order
        HashMap<String, Float> sp2 = new HashMap<>();
        sp2.put("Cisco", 120.10f);
        sp2.put("Meta", 320.47f);
        sp2.put("Microsoft", 263.68f);
        sp2.put("Alphabet", 300.23f);
        System.out.println("Hash map: " + sp2);

        // creating a tree map using an existing hash map
        // it stores keys in ascending order
        TreeMap<String, Float> sp3 = new TreeMap<>(sp2);
        System.out.println("Tree map (default): " + sp3);

        // creating a tree map using an existing tree map
        // the order is preserved
        TreeMap<String, Float> sp4 = new TreeMap<>(sp);
        System.out.println("Tree map created from existing tree map with keys stored in desc order: " + sp4);

        // putAll() copies all of the mappings from the specified map to the current map.
        // These mappings will replace any mappings that this map had for any of the keys
        // currently in the specified map.
        TreeMap<String, Float> newmap = new TreeMap<>();
        newmap.put("Meta", 350.09f);
        newmap.put("Oracle", 200.21f);
        newmap.putAll(sp);
        System.out.println("New Map: " + newmap);

    }
}
