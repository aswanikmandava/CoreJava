package src.threads.executorframework;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskDemo {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        TimerTask badTask = new TimerTask() {
            @Override
            public void run() {
                throw new RuntimeException("by badTask");
            }
        };
        TimerTask goodTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Good Task");
            }
        };
        t.schedule(badTask, 10);
        Thread.sleep(500);
        t.schedule(goodTask, 10);
    }
}
