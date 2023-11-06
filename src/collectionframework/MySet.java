package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MySet {
    public static void main(String[] args) {
        // Set is the interface and HashSet is a class that implements it
        // Set is similar to List except that it doesn't accept duplicate items.
        // Set<Integer> myobj = new HashSet<Integer>();
        // To automatically sort items, we can use TreeSet
        Set<Integer> myobj = new TreeSet<Integer>();
        myobj.add(51);
        myobj.add(42);
        myobj.add(24);
        System.out.println("Set: " + myobj + ", Size: " + myobj.size());
        System.out.println("Iterating each item in the set: ");
        // for (int i:myobj) {
        //     System.out.println("Item: " + i);
        // }

        // another way to loop through items in a set
        // get iterator object and navigate items
        Iterator it_obj = myobj.iterator();
        while (it_obj.hasNext()) {
            System.out.println("Item: " + it_obj.next());
        }
    }
}
