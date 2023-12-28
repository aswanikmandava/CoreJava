package src;
import java.util.List;
import java.util.ArrayList;
/*
https://docs.oracle.com/javase/tutorial/java/generics/why.html

In a nutshell, generics enable types (classes and interfaces) to be parameters when defining
classes, interfaces and methods. Much like the more familiar formal parameters used in method
declarations, type parameters provide a way for you to re-use the same code with different inputs.
The difference is that the inputs to formal parameters are values, while the inputs to type parameters
are types.

Code that uses generics has many benefits over non-generic code:
    1) Stronger type checks at compile time.
        A Java compiler applies strong type checking to generic code and issues errors if the code violates
        type safety. Fixing compile-time errors is easier than fixing runtime errors, which can be difficult
        to find.
    2) Elimination of casts
    3) Enabling programmers to implement generic algorithms.
        By using generics, programmers can implement generic algorithms that work on collections of
        different types, can be customized, and are type safe and easier to read.
 */
public class GenericsDemo {
    public static void main(String[] args) {
        // raw use requires casting to compile
        List l = new ArrayList();
        l.add("Hello");
        String s = (String) l.get(0);
        System.out.println(s);

        // parameterized class usage eliminates casting and make code more flexible
        List<String> mylist = new ArrayList<>();
        mylist.add("World");
        String mystr = mylist.get(0);
        System.out.println(mystr);

    }
}
