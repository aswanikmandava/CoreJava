package threads;
// when 2 threads act on the shared variable, it can lead to race condition which means
// the output is unpredictable. This problem can be solved by making the method synchronized

/*
The synchronized keyword in Java is used to achieve thread safety by allowing only one thread at a time 
to access a synchronized block or method. It is used to solve the problem of data inconsistency when 
multiple threads are trying to access the same data at the same time.

The synchronized keyword can be used with:
    Methods: When a method is declared as synchronized, only one thread can execute that method at a time.
    Blocks: When a block of code is enclosed in a synchronized statement, only one thread can execute that block of code at a time.
    Objects: When an object is declared as synchronized, only one thread can access that object at a time.

    When you use the synchronized keyword, Java will automatically lock the object or block of code that 
    is being accessed. This will prevent other threads from accessing the object or block of code until the 
    current thread has finished.

The synchronized keyword can be used to improve the performance of your Java applications by reducing 
the number of times that threads need to wait for each other. It can also help to prevent data corruption 
by ensuring that only one thread is able to access a shared resource at a time.

*/

class Counter {
    int counter=0;
    // synchronized keyword will prevent race condition
    public synchronized void increment() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
}

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable r1 = () -> {
            for(int i=0; i<1000; i++) {
                c.increment();
            }
        };
        Runnable r2 = () -> {
            for(int i=0; i<1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        // wait for threads to complete
        t1.join();
        t2.join();

        // print the value of counter
        System.out.println(c.getCounter());
    }
}
