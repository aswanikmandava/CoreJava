// Thread States
// NEW (when a thread object is instantiated)
// RUNNABLE (when you call start() method on thread object)
// RUNNING (when OS scheduler allocates CPU time for the thread to run)
// WAITING (when sleep() or wait() is called. If wait() is used then notify() is required to put it back to RUNNABLE state)
// DEAD (when thread is joined to main thread or finished execution)

package threads;
class Hello extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Bolo extends Thread {
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Bolo");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class MyThread {
    public static void main(String[] args) {
        Hello h = new Hello();
        Bolo b = new Bolo();
        h.start();  // start method will invoke run() on the object
        b.start();
    }
}
