package src.collectionframework;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListOperations {
    public static void main(String[] args) {
        // init a fruit ArrayList
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Mango", "Apple"));

        // replace all elements with new ones using method reference
        // fruits.replaceAll(String::toUpperCase);

        // replace all elements with new ones using lambda expression
        fruits.replaceAll((ele) -> ele.toUpperCase());

        System.out.println(fruits);

    }
}
