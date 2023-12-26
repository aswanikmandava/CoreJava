package src.collectionframework;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

/*
One of the major drawbacks of using a Comparable interface is that the comparing logic gets fixed.
For instance, if we have a Vehicle class, then it can be sorted either on the basis of the brand or
the production year depending on the implementation of the compareTo() method.

If we need some flexibility in sorting, we should use the Comparator interface instead of the
Comparable interface. The Comparator interface has a method, compare(T o1, T o2), which takes
two objects, o1 and o2 as parameters.
It returns -1 if o1 < o2, 1 if o1 > o2 and 0 if o1 is equal to o2.
 */
public class ArrayListComparator {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Honda", "CRV", 2023);
        Vehicle v2 = new Vehicle("Toyota", "Camry", 2021);
        Vehicle v3 = new Vehicle("Mercedes", "Benz", 2020);

        List<Vehicle> cars = new ArrayList<>();
        cars.add(v1);
        cars.add(v2);
        cars.add(v3);
        Collections.sort(cars, new MakeComparator());
        System.out.println("Sorted cars by make: " + cars);
        Collections.sort(cars, new YearComparator());
        System.out.println("Sorted cars by year: " + cars);

    }
}


class Vehicle {
    String make, model;
    int year;
    public Vehicle() {
        this.make = null;
        this.model = null;
        this.year = 0;
    }
    public Vehicle(String make, String model, int year) {
        super();
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
}
class YearComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.year - v2.year;
    }
}
class MakeComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle v1, Vehicle v2) {
        return v1.make.compareTo(v2.make);
    }
}
