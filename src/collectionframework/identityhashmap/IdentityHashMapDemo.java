package src.collectionframework.identityhashmap;

import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        /*
            Now we will create two Student objects with exactly the same data and will store them in an
            IdentityHashMap as well as in a HashMap. We will find out that an IdentityHashMap will store
            both the objects whereas the HashMap will have only one object, stored in it.
         */
        Student st1 = new Student(100, "Ganguly");
        Student st2 = new Student(100, "Ganguly");

        Map<Student, String> hashMap = new HashMap<>();
        hashMap.put(st1, "S1");
        hashMap.put(st2, "S2");

        Map<Student, String> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put(st1, "S1");
        identityHashMap.put(st2, "S2");

        System.out.println("The student objects in HashMap are:");
        System.out.println(hashMap);

        System.out.println();
        System.out.println("The student objects in IdentityHashMap are:");
        System.out.println(identityHashMap);

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.sname == null) ? 0 : this.sname.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Student s2 = (Student) obj;
        if (this.sid != s2.sid) {
            return false;
        }
        if (this.sname == null) {
            if (s2.sname != null) {
                return false;
            }
        }
        else if (!this.sname.equals(s2.sname)) {
            return false;
        }
        return true;
    }
}