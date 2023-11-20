package src.access_modifiers;

public class Mercedes {
    public static void main(String[] args) {
        Automobile a = new Automobile("Mercedes", "A5");
        System.out.println("Accessing public property (topSpeed) of object: " + a.topSpeed);
        System.out.println("Accessing private property using object interface (public method): " +
                a.getMake());
        // this is allowed since this class is in the same package
        System.out.println("Accessing protected property directly: " + a.engineType);


    }
}
