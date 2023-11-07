package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Stream allows to work on the data structure copy to transform the data with out modifying 
// the source. You can only act on the data stream once

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 4, 5, 10, 21, 30);
        // get the stream object from ArrayList object
        Stream<Integer> s1 = nums.stream();
        // override test method of Predicate interface using Anonymous inner class
        // Predicate<Integer> p = new Predicate<Integer>() {

        //     @Override
        //     public boolean test(Integer n) {
        //         return t%2 == 0;
        //     }
            
        // };

        // override test method of Predicate interface (Functional Interface) using Lambda expression
        // Predicate<Integer> p = n -> n%2 == 0;
        // Stream<Integer> s2 = s1.filter(p);
        
        // filter out odd numbers from previous stream object
        Stream<Integer> s2 = s1.filter(n -> n%2==0);

        // override apply method using anonymous inner class
        // Function<Integer, Integer> f = new Function<Integer, Integer>() {

        //     @Override
        //     public Integer apply(Integer n) {
        //         return n*2;
        //     }
            
        // };

        // override apply method using Lambda expression
        // Function<Integer, Integer> f = n -> n*2;
        // Stream<Integer> s3 = s2.map(f);

        // apply an expression to each one from the previous stream object
        Stream<Integer> s3 = s2.map(n -> n*2);
        // print each integer to the stdout
        // s3.forEach(n -> System.out.println(n));
        int result = s3.reduce(0, (c,e) -> c+e);
        System.out.println("Sum of items: " + result);

        // The above stream operations can all be combined a single statement
        // int result = nums.stream()
        //                 .filter(n -> n%2 == 0)
        //                 .map(n -> n*2)
        //                 .reduce(0, (c,e) -> c+e);

    }
}
