package src.practice;
import src.access_modifiers.*;



public class TestAccessModifier extends Automobile {
    public static void main(String[] args) {
        Automobile at = new Automobile("Honda", "CRV 2023");
        // accessing protected property of a public class outside its package
        System.out.println("Top speed of Honda:  " + at.topSpeed);
        // cannot access default class outside of its package
        // despite importing it
        // following will generate compilation error
        // GenericAutomobile ga = new GenericAutomobile("Generic", "Model");

    }
}
