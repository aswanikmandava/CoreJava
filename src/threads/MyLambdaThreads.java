package threads;
class ThreadA implements Runnable {
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
}

class ThreadB implements Runnable {
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
}

public class MyLambdaThreads {
    public static void main(String[] args) {
        // Lambda expression
        Runnable ta = () -> {
            for(int i=0; i<5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable tb = () -> {
            for(int i=0; i<5; i++) {
                System.out.println("Bolo");
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread a = new Thread(ta);
        Thread b = new Thread(tb);
        a.start();
        b.start();
    }
}
