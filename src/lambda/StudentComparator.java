package src.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class StudentComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100, "James"));
        students.add(new Student(101, "Ana"));
        students.add(new Student(102, "Diana"));
        students.add(new Student(103, "Morgan"));

        // sort students by name
        //Collections.sort(students, new Comparator<Student>() {
        //    @Override
        //    public int compare(Student s1, Student s2) {
        //        return s1.getName().compareTo(s2.getName());
        //    }
        //});

        // use lambda expression to provide Comparator object to sort()
        Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println(students);
    }
}

class Student {
    private int id;
    private String name;
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}