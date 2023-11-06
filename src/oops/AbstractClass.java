package oops;
/*
abstract class is a class that contains atleast an abstract method
abstract method is a method that doesn't require implementation for declaration
i,e it doesn't need a body. Subclass will implement the method

The purpose of an abstract class is to provide a template or blueprint for the subclasses to follow. 
By defining a constructor in an abstract class, you can ensure that the subclasses follow a 
specific initialization pattern and avoid code duplication.
When you create an object of a subclass that extends an abstract class, the constructor of the 
abstract class is called first, followed by the constructor of the subclass. This ensures that 
the subclass has all the necessary information to initialize its instance variables.

Note that an abstract class cannot be instantiated directly. 
You can only create objects of a subclass that extends an abstract class.
*/


abstract class Car {
    protected String make;
    protected String model;
    protected int year;
    public Car() {
        // default constructor
        // if we don't create it, compiler will create it
        System.out.println("In Car constructor");
    }
    public void start() {
        System.out.println("Engine started");
    }
    abstract void displayDashboard();
    
}

class Civic extends Car {
    public Civic(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println("Civic object instantiated for model: " + model + " year: " + year);
    }
    public void displayDashboard() {
        System.out.println("Showing dashboard ..");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Civic c = new Civic("Honda", "Civic", 2008);
        c.start();
        c.displayDashboard();
    }
}
