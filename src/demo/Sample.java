package demo;
import example.Demo;

class DemoSubClass extends Demo {
    public String getVal() {
        // accessing a protected variable inside a sub-class
        // which is a different package
        return demoName;
    }
}

public class Sample{
    public static void main(String args[]) {
        DemoSubClass obj = new DemoSubClass();
        System.out.println(obj.getVal());
    }
}
