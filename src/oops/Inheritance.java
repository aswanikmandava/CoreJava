package oops;
class Calculator {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int diff(int num1, int num2) {
        return num1 - num2;
    }
}

class AdvCalculator extends Calculator {
    public int product(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

}
// multi-level inheritance
class L2Calculator extends AdvCalculator {
    // method overriding
    // if the same method exists in the parent or grand parent etc
    // you can overiding it defining a local method
    public int sum(int num1, int num2) {
        System.out.println("Computing sum ...");
        return num1 + num2;
    }

    public int modulo(int num1, int num2) {
        return num1 % num2;
    }
}

// Java doesnot support multiple inheritance due to ambiguity problem
// i,e when the same method exists in multiple parents it doesn't know which method
// to use in that situation
public class Inheritance {
    public static void main (String args[]) {
        L2Calculator l = new L2Calculator();
        System.out.println("Sum: " + l.sum(1, 2));
        System.out.println("Diff: " + l.diff(5, 2));
        System.out.println("Product: " + l.product(4, 2));
        System.out.println("Division: " + l.div(8, 2));
        System.out.println("Modulo: " + l.modulo(5, 2));

    }
}
