package src.collectionframework.arraylist;

import java.util.*;

class Employee {
    String name;
    int age;
    String country;

    public Employee(String name, int age, String country) {
        super();
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
public class ArrayListExercise {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Alex", 23, "USA"));
        emp.add(new Employee("Dave", 34, "India"));
        emp.add(new Employee("Carl", 21, "USA"));
        emp.add(new Employee("Joe", 56, "Russia"));
        emp.add(new Employee("Amit", 64, "China"));
        emp.add(new Employee("Ryan", 19, "Brazil"));

        // to find employees ages over 50
        for (Employee e: emp) {
            if (e.age > 50) {
                System.out.println(e.name);
            }
        }

        // to remove employees who reside in USA
        Iterator<Employee> i = emp.iterator();
        while (i.hasNext()) {
            Employee e = i.next();
            if (e.country.equals("USA")) {
                System.out.println("Removing " + e.name);
                i.remove();
            }
        }

        // to sort employees by country
        //Collections.sort(emp, new CountryComparator());
        // comparator object can be created using lambda expression
        Collections.sort(emp, (e1, e2) -> e1.country.compareTo(e2.country));
        System.out.println("Employees sorted by Country: " + emp);

    }

}

class CountryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.country.compareTo(e2.country);
    }
}