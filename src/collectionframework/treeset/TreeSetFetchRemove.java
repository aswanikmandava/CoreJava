package src.collectionframework.treeset;
import java.util.TreeSet;
import java.util.Set;

public class TreeSetFetchRemove {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        s.add(21);
        s.add(32);
        s.add(44);
        s.add(11);
        s.add(54);
        s.add(3);
        s.add(9);
        s.add(41);
        System.out.println("First element: " + s.first());
        System.out.println("Last element: " + s.last());
        System.out.println("Elements less than 50: " + s.headSet(50));
        System.out.println("Elements greater than 50: " + s.tailSet(50));

        // check if the tree set is empty
        System.out.println("Is empty? " + s.isEmpty());
        // size of tree set
        System.out.println("Size: " + s.size());
        // check if an element is in tree set
        System.out.println("is 40 in tree set? " + s.contains(new Integer(40)));
        // remove element
        s.remove(new Integer(54));
    }
}
