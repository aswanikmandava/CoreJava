/*
final keyword can be used with a variable, method and class
final variable keeps the value as constant preventing others from changing its value
final method prevents overriding by its sub-class
final class prevents inheritance (No class can extend it)
*/

public class Final {
    public final double PI = 3.143455555555;
    public final void show() {
        // following assignment is not allowed
        // this.PI = 3.14;
        System.out.println("In Final class show method");
    }
}

final class ExampleFinal {

}

class ExFinal extends Final {
    // the following method is not allowed
    // public void show() {

    // }

}

// the following class is not allowed
// class DemoFinal extends ExampleFinal {

// }
