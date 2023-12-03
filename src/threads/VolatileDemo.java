package src.threads;

public class VolatileDemo {
    // volatile doesn't imply thread safety
    public static volatile int total=0;
    public static void main(String[] args) throws InterruptedException {
        int numThreads = 10;
        Thread[] threads = new Thread[numThreads];

        // create multiple threads
        for (int t=0; t<numThreads; t++) {
            threads[t] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0; i<1000; i++) {
                        total++;
                    }
                }
            });

            // start the thread
            threads[t].start();
        }

        // wait for threads to finish
        for (int t=0; t<numThreads; t++) {
            threads[t].join();
        }
        System.out.println("Total: " + total);
    }
}
