package src.threads;

public class Basics {
    public static void main(String[] args) {
        // We defined an anonymous class inside the Thread class’s constructor
        // and an instance of it is instantiated and passed into the Thread
        // object.
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello thread !!!");
            }
        });
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            // handle exception
        }

        // another way to create thread
        // create a class that implements runnable interface
        // override run method
        Thread t2 = new Thread(new DemoThread());
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            // handle exception
        }

        // another way to create thread
        // create a class that extends Thread class
        // override run method
        SubThread t3 = new SubThread();
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            // handle exception
        }
    }
}

class DemoThread implements Runnable {
    public void run() {
        System.out.println("Hello DemoThread !!!");
    }
}

class SubThread extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Subclass Thread");
    }

}