// define enum with a list of named constants

import javax.swing.JOptionPane;

enum JobStatus {
    // JobStatus is treatd as Class of type enum
    // All defined constants are its objects
    READY, STARTED, PAUSED, STOPPED, FAILED
}



public class Enum {
    public static void main(String[] args) {
        JobStatus s = JobStatus.FAILED;
        // get enum object super class
        System.out.println("Class: " + s.getClass().getSuperclass());
        System.out.println(s);
        // to get the constant position
        int val = s.ordinal();
        System.out.println("Constant correponding int value: " + val);
        // to get all enum constants
        JobStatus[] e = JobStatus.values();
        // iterate JobStatus to print each enum val
        for (JobStatus js:e) {
            System.out.println("Enum const: " + js + ", value: " + js.ordinal());
        }

        // use switch to compare JobStatus constants
        switch (s) {
            case READY:
                System.out.println("Job status is ready");
                break;
            case STARTED:
                System.out.println("Job status is started");
                break;
            case STOPPED:
                System.out.println("Job status is stopped");
                break;
            default:
                System.out.println("No match");
                break;
        }

    }
}
