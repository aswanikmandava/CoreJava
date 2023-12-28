package src.collectionframework.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/*
Collections.sort() method sorts the given List in ascending order.
Each wrapper class(Integer, Double, or Long), String class, and Date class implements
an interface called Comparable. This interface contains a compareTo(T o) method which
is used by sorting methods to sort the Collection. This method returns a negative
integer, zero, or a positive integer if this object is less than, equal to, or greater
than the object passed as an argument.

If we use the Collections.sort(List<T> list) method to sort an ArrayList, then the
class whose objects are stored in the ArrayList must implement the Comparable interface.
If the ArrayList stores an Integer, a Long, or a String, then we don’t need to worry as
these classes already implement the Comparable interface. But if the ArrayList stores a
custom class object, then that class must implement the Comparable interface.
 */
public class ArrayListComparable {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Mango", 30);
        Fruit f2 = new Fruit("Blueberry", 10);
        Fruit f3 = new Fruit("Pear", 40);
        List<Fruit> fruits = new ArrayList<>();
        fruits.add(f1);
        fruits.add(f2);
        fruits.add(f3);
        Collections.sort(fruits);
        System.out.println("Sorted fruits: " + fruits);
        Collections.sort(fruits, Collections.reverseOrder());
        System.out.println("Sorted fruits in desc order: " + fruits);
        System.out.println();

        Automobile c1 = new Automobile("Honda", "CRV");
        Automobile c2 = new Automobile("Mercedes", "Benz");
        Automobile c3 = new Automobile("Ford", "Mustang");
        List<Automobile> cars = new ArrayList<>();
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        Collections.sort(cars);
        System.out.println("Sorted cars by Make: " + cars);
        Collections.sort(cars, Collections.reverseOrder());
        System.out.println("Sorted cars by Make in desc order: " + cars);

    }

}

class Fruit implements Comparable<Fruit> {
    private String name;
    private int weight; // in lbs

    public Fruit(String name, int weight) {
        super();
        this.name = name;
        this.weight = weight;
    }

    public Fruit() {
        this.name = null;
        this.weight = 0;
    }

    @Override
    public int compareTo(Fruit f) {
        return (this.weight - f.weight);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}

class Automobile implements Comparable<Automobile> {
    private String manufacturer, model;
    public Automobile() {
        this.manufacturer = null;
        this.model = null;
    }

    public Automobile(String make, String model) {
        super();
        this.manufacturer = make;
        this.model = model;
    }

    @Override
    public int compareTo(Automobile a){
        // String comparison
        return this.manufacturer.compareTo(a.manufacturer);
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}