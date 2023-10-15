

class Student {
    int id;
    String first_name;
    String last_name;
    int age;
}

public class MyObjArray {
    public static void main(String args[]) {
        // create and init Student object
        Student s0 = new Student();
        s0.id = 100;
        s0.first_name = "Aswani";
        s0.last_name = "Mandava";
        s0.age = 39;
        // create and init Student object
        Student s1 = new Student();
        s1.id = 101;
        s1.first_name = "Suneetha";
        s1.last_name = "Bodavula";
        s1.age = 38;

        // create an array of type Student with size 2.
        Student s[] = new Student[2];
        // init student array
        s[0] = s0;
        s[1] = s1;

        // iterate through the student object array
        for (Student st: s) {
            String full_name = st.first_name + " " + st.last_name;
            System.out.println(st.id + ", " + full_name + ", " + st.age);
        }

    }
}
