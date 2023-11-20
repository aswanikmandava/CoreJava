
// static variable contains same value for all objects of a class which can be referenced using a classname
// static variable is shared by all objects.
// static method can be referenced using a class name

class iPhone {
    static String manufacturer;
    String model;
    float price;

    static {
        // static block is called only once
        // doesn't matter how many objects you create
        iPhone.manufacturer = "Apple";
        System.out.println("In static block");
    }

    public iPhone() {
        // constructor
        // set default values for each object
        model = "latest";
        price = 1200.0f;
        System.out.println("In constructor");
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }

    public static String getManufacturer(){
        return iPhone.manufacturer;
    }
}


public class MyStatic {
    public static void main(String args[]) {
        iPhone i1 = new iPhone();
        i1.model = "iphone 11";
        i1.price = 1000.0f;
        // set static variable
        iPhone.manufacturer = "Apple";
        System.out.println("i1 model: " + i1.getModel());
        System.out.println("i1 price: " + i1.getPrice());

        iPhone i2 = new iPhone();
        i2.model = "iphone 13";
        i2.price = 1500.0f;

        System.out.println("i2 model: " + i2.getModel());
        System.out.println("i2 price: " + i2.getPrice());
        System.out.println("i2 manufacturer (using static var): " + iPhone.manufacturer);
        // it is not required to access static var using object,
        // instead we can use its class
        // the following won't cause error but, can give warning
        System.out.println("Accessing static var using object: " + i2.manufacturer);
        System.out.println("i2 manufacturer (using static method): " + iPhone.getManufacturer());
    }
}
