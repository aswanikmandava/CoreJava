package src.access_modifiers;

public class Automobile {
    private String make, model;
    public int topSpeed = 200;
    protected String engineType = "gasoline";

    public Automobile() {
        this.make = null;
        this.model = null;
    }

    public Automobile(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
