
class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }
    // method overloading
    // you can have multiple methods with same name but have different number of parameters (or)
    // same number of parameters but with different types

    public int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    public float add(float num1, float num2) {
        float result = num1 + num2;
        return result;
    }

    public double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

}

public class MyClass {
    public static void main(String args[]) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        // create an object to Calculator
        Calculator calc = new Calculator();
        // using object reference, call add method
        int sum = calc.add(num1, num2, num3);
        double sum2 = calc.add(3.1445555, 5.666666);
        System.out.println("Sum: " + sum);
        System.out.println("Double Sum: " + sum2);
    }
}
