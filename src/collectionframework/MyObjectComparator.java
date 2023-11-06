package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// Comparator is an interface that allows to plugin custom sort logic
// Plugin in custom sort of Car objects by its year

class Car {
    String model;
    String make;
    int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", make=" + make + ", year=" + year + "]";
    }

    
}

public class MyObjectComparator {
    public static void main(String[] args) {
        List<Car> mycars = new ArrayList<>();
        mycars.add(new Car("Honda", "CRV", 2023));
        mycars.add(new Car("Mercedes", "Benz", 2010));
        mycars.add(new Car("Nissan", "Altima", 2021));
        
        // create a comparator object to sort cars by year
        // Comparator<Car> cComp = new Comparator<Car>() {
        //     public int compare(Car c1, Car c2) {
        //         if (c1.year < c2.year) {
        //             return 1;
        //         }
        //         else {
        //             return -1;
        //         }
        //     }
        // }; 

        // The above Comparator object can also be created using Lambda expression
        Comparator<Car> cComp = (c1, c2) -> (c1.year < c2.year) ? 1 : -1;
        System.out.println("Car list: " + mycars);

        Collections.sort(mycars, cComp);
        System.out.println("Sort car list by year in desc order: " + mycars);

        // loop through cars
        for (Car i: mycars) {
            System.out.println("Make: " + i.make + ", Model: " + i.model + ", Year: " + i.year);
        }
    }
}
