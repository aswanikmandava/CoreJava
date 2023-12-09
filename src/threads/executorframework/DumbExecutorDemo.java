package src.threads.executorframework;

import java.util.concurrent.Executor;

public class DumbExecutorDemo {
    public static void main(String[] args) {
        DumbExecutor d = new DumbExecutor();
        Task t = new Task();
        d.execute(t);
    }

}

class DumbExecutor implements Executor {
    public void execute(Runnable r) {
        Thread t = new Thread(r);
        t.start();
    }
}
class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is executed");
    }
}