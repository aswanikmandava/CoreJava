package oops;
/*
An interface in Java is a reference type that is similar to a class. 
It is a collection of abstract methods that must be implemented by a class that implements the 
interface. Interfaces can be used to achieve abstraction and multiple inheritance in Java.
An interface in Java is similar to an abstract class, but it cannot have any constructors or 
instance variables. It can only have abstract methods, static methods, and default methods.
*/

interface MotorCar {
    // all methods are public abstract
    void start();
    void stop();
}

// functional interface has only 1 method declaration
@FunctionalInterface
interface Automobile {
    String setType(String type);
}

class Mercedes implements MotorCar {
    public Mercedes() {
        System.out.println("Mercedes initialized");
    }
    public void start() {
        System.out.println("Started");
    }
    public void stop() {
        System.out.println("Stopped");
    }
}
public class Interface {
    public static void main(String[] args) {
        Mercedes mc = new Mercedes();
        mc.start();
        mc.stop();
    }

}
