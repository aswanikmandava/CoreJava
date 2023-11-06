package threads;
// Using lambda expression, you can create shortened version of class that implements functional interface

@FunctionalInterface
interface Automobile {
    void start();
}

@FunctionalInterface
interface ElectricAutomobile {
    void start(String enginetype);
}

@FunctionalInterface
interface GenericAutomobile {
    String getEngineType();
}

public class LambdaExpression {
    public static void main(String[] args) {
        // implementation of a functional interface method with no params using lambda expression
        // Syntax: <Interface> <ref> = () -> { body };
        Automobile a = () -> {
            System.out.println("Implemented start method using lambda");
        };
        a.start();

        // implementation of a functional interface method that takes 1 arg with no return type using lambda expression
        // Syntax: <Interface> <ref> = (arg1) -> { body };
        ElectricAutomobile e = (enginetype) -> {
            System.out.println("Implemented electric start method using lambda");
        };
        e.start("electric");

        // implementation of a functional interface method that returns a value with a single statement
        // Syntax: <Interface> <ref> = () -> <return_val>;
        GenericAutomobile ga = () -> "Electric Engine";
        System.out.println(ga.getEngineType());
    }

}
