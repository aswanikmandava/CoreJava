package src.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Comparator is an interface that allows to plugin custom sort logic
// Plugin in custom sort of Student objects by enrollment year with out creating a Comparator object

// Override CompareTo method implementing Comparable interface

class Student implements Comparable<Student> {
    String name;
    int year;   // enrollment year

    public Student(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", year=" + year + "]";
    }

    @Override
    public int compareTo(Student o) {
        // if (this.year > o.year) {
        //     return 1;
        // }
        // else {
        //     return -1;
        // }
        return (this.year > o.year) ? 1: -1;
    }

}

public class MyObjectComparable {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student("Anil", 2002));
        st.add(new Student("Sankar", 1998));
        st.add(new Student("Srinivas", 2020));
        
        System.out.println("Student list: " + st);

        Collections.sort(st);
        System.out.println("Sort student list by year in ascending order: " + st);

        // loop through cars
        for (Student s: st) {
            System.out.println(s.name + ", Year: " + s.year);
        }
    }
}
