package src.oops.others;

class Vehicle {
    private String make;
    private String model;
    private int year;
    private int topSpeed = 200;

    public Vehicle() {
        this.make = null;
        this.model = null;
        this.year = 0;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void showDetails() {
        System.out.println("Make: " + this.make +
                ", Model: " + this.model +
                ", Year: " + this.year +
                ", Speed: " + this.topSpeed
                );
    }
}

class Car extends Vehicle {
    private String engineType;
    private int topSpeed = 100;

    public Car() {
        super();    // call default constructor from super class (Vehicle)
    }

    public Car(String make, String model, int year, String engineType) {
        super(make, model, year);
        this.engineType = engineType;
    }
    public void getDetails() {
        showDetails();
        System.out.println("Engine type: " + this.engineType);
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Car c = new Car("Honda", "CRV", 2023, "Gasoline");
        c.getDetails();
        System.out.println("Top Speed: " + c.getTopSpeed());
    }
}
