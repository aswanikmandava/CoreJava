package src.collectionframework.arrays;

import javax.swing.border.EmptyBorder;
import java.util.Arrays;
import java.util.Comparator;
public class SearchCustomClass {
    public static void main(String[] args) {
        Student[] students = {
                new Student(100, "Anna"),
                new Student(200, "Jenna"),
                new Student(300, "John"),
                new Student(350, "Zen"),
                };
        //Comparator<Student> sc = new Comparator<Student>() {
        //    @Override
        //    public int compare(Student s1, Student s2) {
        //        return s1.sname.compareTo(s2.sname);
        //    }
        //};
        //System.out.println("Search of John: " + Arrays.binarySearch(students, new Student(300, "John"), sc));

        // Comparator object using lambda expression
        System.out.println("Search of John: " + Arrays.binarySearch(students, new Student(300, "John"), (s1, s2) -> s1.sname.compareTo(s2.sname)));
    }
}

class Student {
    int sid;
    String sname;
    public Student(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }
}