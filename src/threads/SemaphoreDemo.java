package src.threads;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) throws InterruptedException {
        SemExample.goodBadThreads();
    }
}

class SemExample {
    public static void goodBadThreads() throws InterruptedException {
        final Semaphore s = new Semaphore(1);
        Thread bad = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        s.acquire();    // get a permit
                        System.out.println("Permit acquired by " + Thread.currentThread().getName());
                        try {
                            throw new RuntimeException("");
                        }
                        catch (Exception e) {
                            // handle run time err and exit function
                            return;
                        }
                        finally {
                            s.release();    // release the permit always
                            System.out.println("Permit released by " + Thread.currentThread().getName());
                        }
                    }
                    catch (InterruptedException e) {
                        System.out.println(Thread.currentThread().getName() + " is interrupted");
                    }
                }
            }
        });

        bad.start();
        // wait for the bad thread to go belly-up
        Thread.sleep(1000);
        Thread good = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " waiting to be signalled");
                try {
                    s.acquire();
                    System.out.println("Permit acquired by " + Thread.currentThread().getName());
                }
                catch (InterruptedException e) {
                    // handle exception
                }
                finally {
                    s.release();
                    System.out.println("Permit released by " + Thread.currentThread().getName());
                }
            }
        });
        good.start();
        bad.join();
        good.join();
        System.out.println("Completed");
    }
}