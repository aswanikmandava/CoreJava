package threads;
// implementation of Threads using anonymous inner class that implements Runnable interface

public class AnonymousInnerClassThreads {
    public static void main(String[] args) {
        Runnable ra = new Runnable() {
            public void run() {
                for(int i=0; i<5; i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable rb = new Runnable() {
            public void run() {
                for(int i=0; i<5; i++) {
                    System.out.println("Bolo");
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        // create threads that takes object of type Runnable
        Thread ta = new Thread(ra);
        Thread tb = new Thread(rb);

        // start threads
        ta.start();
        tb.start();
    }
}
