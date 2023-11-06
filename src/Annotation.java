/*
In the Java programming language, an annotation is a form of syntactic metadata that can be added 
to Java source code. It is a special type of marker that can be used to provide additional information 
about the program to the compiler and other tools. Annotations are not part of the program itself and 
do not affect its execution, but they can be used to provide information that can be used by the 
compiler or other tools to improve the program's performance or functionality.

Annotations start with the @ symbol and can be used to annotate classes, methods, fields, and parameters.

They can also be used to annotate entire packages. Annotations can be used to provide information about 
the purpose of a piece of code, the author of the code, the date the code was written, and other information.
Annotations can be used by the compiler to generate warnings or errors if the code does not meet certain 
criteria. They can also be used by tools to generate documentation, to generate code, or to perform other 
tasks.

Annotations are a powerful feature that can be used to improve the quality and functionality of 
Java programs.
*/

class Car {
    private String make;
    private String model;

    public Car() {
        // default constructor
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        System.out.println("In superclass constructor");
    }

    public void start() {
        System.out.println("Engine started");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + "]";
    }
    
}

class Civic extends Car {
    public Civic(String make, String model) {
        super(make, model);
        System.out.println("In subclass constructor");
    }

    @Override   // this is added to give additional details to compiler on your intention to override start method
    public void start() {
        System.out.println("Overidden method");
    }
    
}
public class Annotation {
    public static void main(String[] args) {
        Civic c = new Civic("Honda", "Civic");
        c.start();
    }
}
