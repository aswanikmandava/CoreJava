package src.oops;

interface InterfaceA {
    public default void showInfo() {
        System.out.println("In interface A");
    }
}

interface InterfaceB {
    public default void showInfo() {
        System.out.println("In interface B");
    }
}

public class MultiInheritanceInterface implements InterfaceA, InterfaceB {
    @Override
    public void showInfo() {
        System.out.println("In main");
        InterfaceA.super.showInfo();
    }

    public static void main(String[] args) {
        MultiInheritanceInterface m = new MultiInheritanceInterface();
        m.showInfo();
    }
}
