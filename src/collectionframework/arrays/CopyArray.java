package src.collectionframework.arrays;
import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] numsC = Arrays.copyOf(nums, nums.length);
        int[] numsBig = Arrays.copyOf(nums, 10);
        for (int i : numsBig) {
            System.out.print(i + " ");
        }
        System.out.println();

        Automobile[] cars = {
                new Automobile("Honda", "CRV", 2023),
                new Automobile("Mercedes", "Benz", 2022),
                new Automobile("Tesla", "Model-S", 2020),
        };
        Automobile[] carsNextGen = Arrays.copyOf(cars, cars.length);
        // If we change the object in the original array, will it be changed in the copied array?
        // this answer is No
        // copyOf() method creates a deep copy of objects instead of just changing the references.
        cars[0] = new Automobile("Honda", "Civic", 2008);
        System.out.println("Original array first object: " + cars[0]);
        System.out.println("Copy array first object: " + carsNextGen[0]);
    }
}

class Automobile {
    String make, model;
    int year;

    public Automobile(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}