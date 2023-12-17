package src.threads.executorframework;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Future;

// Java also provides an implementation of the future interface called the FutureTask.
// It can wrap a callable or runnable object and in turn be submitted to an executor.
public class FutureTaskDemo {
    static ExecutorService tpool = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws Exception {
        FutureTask<Integer> t = new FutureTask(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                try {
                    Thread.sleep(1);
                }
                catch (InterruptedException e) {
                    System.out.println("Caught exception");
                }
                return 5;
            }
        });
        Future f = tpool.submit(t);
        System.out.println("Result: " + t.get());
    }


}
