package src.collectionframework.treeset;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetDemo {
    public static void main(String[] args) {
        List<Integer> mList = new LinkedList<>();
        mList.add(50);
        mList.add(10);
        mList.add(40);
        mList.add(3);

        Set<Integer> ts = new TreeSet<>(mList);
        System.out.println("Items in ascending order: " + ts);

        // store items in descending order
        Set<Integer> rs = new TreeSet<>(Comparator.reverseOrder());
        rs.add(11);
        rs.add(1);
        rs.add(50);
        rs.add(5);
        rs.add(25);
        System.out.println("Iterating over items in reversed tree set");
        rs.forEach(System.out::println);
    }
}
