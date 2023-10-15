class Human {
    private int age;
    private String name;
    // Default constructor
    // it's a special method that is called during object creation
    // it must have same name as the class name
    // it doesn't require a return type
    public Human() {
        // set default vals
        age = 0;
        name = "Unknown";
    }
    // Parameterized constructor
    public Human(int age, String name) {
        // set default vals
        this.age = age;
        this.name = name;
    }
    // auto generated using "Source action"
    public Human(int age) {
        this.age = age;
    }
    public Human(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

// define a sub-class
class Indian extends Human {
    private int pincode;
    public Indian(int age, String name) {
        // calls the parameterized constructor of Human
        super(age, name);
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
}



public class Constructor {
    public static void main(String args[]) {
        Human h = new Human();
        System.out.println("obj h -> Name: " + h.getName() + "; Age: " + h.getAge());
        Human h2 = new Human(39, "Aswani");
        System.out.println("obj h2 -> Name: " + h2.getName() + "; Age: " + h2.getAge());
        Indian i = new Indian(38, "Suneetha");
        System.out.println("obj i -> Name: " + i.getName() + "; Age: " + i.getAge());
    }
}
