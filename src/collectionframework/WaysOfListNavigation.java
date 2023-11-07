package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// we can navigate an array list in 3 different ways
// 1) regular for loop
// 2) enhanced for loop
// 3) forEach method of arraylist
public class WaysOfListNavigation {
    public static void main(String[] args) {
        // List<Integer> y = new ArrayList<>();
        // y.add(2002);
        // y.add(2006);
        // y.add(2010);
        // y.add(2016);

        // Another way of initializing ArrayList
        List<Integer> y = Arrays.asList(2002, 2006, 2010, 2016);

        // regular for loop
        // for (int i=0; i<y.size(); i++) {
        //     System.out.println("Year: " + y.get(i));
        // }

        // enhanced for loop
        // for (Integer i:y) {
        //     System.out.println("Year: " + i);
        // }

        // forEach
        y.forEach(i -> System.out.println("Year: " + i));
    }
    
}
