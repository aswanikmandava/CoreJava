package oops;
/*
Encapsulation in Java is an object-oriented programming concept that refers 
to the bundling of data and methods that operate on that data within a single unit, 
which is called a class. Encapsulation is a way of hiding the implementation details 
of a class from outside access and only exposing a public interface that can be used 
to interact with the class.
*/

class Human {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        // this keyword refers the current object
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // expose a public method to interact with this class
    // public String getName() {
    //     return name;
    // }

    // public int getAge() {
    //     return age;
    // }

    // public void setName(String n) {
    //     name = n;
    // }

    // public void setAge(int a) {
    //     age = a;
    // }

    // you can auto-generate getters and setters using IDE
    // right click and then use "Source Action" > "Generate Getters and Setters"
    
}


public class Encapsulation {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setAge(39);
        h1.setName("Aswani");
        System.out.println("Name: " + h1.getName());
        System.out.println("Age: " + h1.getAge());
    }
}
