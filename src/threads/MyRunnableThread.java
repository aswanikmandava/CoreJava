package threads;
// implementation of threads using Runnable interface

class X implements Runnable {
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

class Y implements Runnable {
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

public class MyRunnableThread {
    public static void main(String[] args) {
        Thread a = new Thread(new X());
        Thread b = new Thread(new Y());
        a.start();
        b.start();
    }
}
