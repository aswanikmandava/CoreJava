package src.oops;

class Calculator {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public double sum(double num1, double num2) {
        return num1 + num2;
    }
}
class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}

class Circle extends Shape {
    private double radius;
    private double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * this.radius * this.radius;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        /*
            We have child classes objects assigned to the parent class reference.
            So to determine which method would be called, the type of the object
            would be determined at runtime.
            This is the reason it is also known as dynamic (runtime) polymorphism.
         */
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2.0, 3.0);
        shapes[1] = new Circle(2.2);
        System.out.println("Area of rectangle: " + shapes[0].getArea());
        System.out.println("Area of circle: " + shapes[1].getArea());

        /*
            we have two definitions of the same method add() in the Calculator class.
            Which add() method would be called is determined by the parameter list at the compile time.
            This is the reason this is also known as static (compile time) polymorphism.
         */
        Calculator c = new Calculator();
        System.out.println("sum: " + c.sum(20, 30));
        System.out.println("Double type sum: " + c.sum(20.12, 30.39));
    }
}
