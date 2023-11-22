package src.oops;

class Engine {
    private String engineType;
    private int cylinders;

    public Engine() {
        engineType = "v4";
        cylinders = 4;
    }

    public Engine(String engineType) {
        this.engineType = engineType;
    }

    public void getEngineInfo() {
        System.out.println("Engine Type: " + engineType +
                ", Cylinders: " + cylinders);
    }
}

class Doors {
    private int count;

    public Doors() {
        count = 0;
    }

    public Doors(int count) {
        this.count = count;
    }

    public void getDoorDetails() {
        System.out.println("No.of doors: " + this.count);
    }
}

class HondaCRV {
    // Composition is the practice of creating other class objects in your class.
    private Engine eng;
    private Doors dr;
    private int year;
    private String color;

    public HondaCRV(String engType, int cnt, int year, String color) {
        this.eng = new Engine(engType);
        this.dr = new Doors(cnt);
        this.year = year;
        this.color = color;
    }

    public void getInfo() {
        eng.getEngineInfo();
        dr.getDoorDetails();
        System.out.println("Color: " + this.color +
                ", Year: " + this.year);
    }
}
public class CompositionDemo {
    public static void main(String[] args) {
        HondaCRV hc = new HondaCRV("v4", 4, 2023, "Blue");
        hc.getInfo();
    }
}
