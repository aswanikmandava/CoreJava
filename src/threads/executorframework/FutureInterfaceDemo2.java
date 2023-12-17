package src.threads.executorframework;

import java.util.concurrent.*;

public class FutureInterfaceDemo2 {
    static ExecutorService tpool = Executors.newSingleThreadExecutor();
    public static void main(String[] args) throws Exception {
        System.out.println("Sum of first 5 integers: " + findSumPollTaskStatusCancelTask(5));
        tpool.shutdown();
    }
    static int findSumPollTaskStatusCancelTask(final int n) throws Exception {
        int result = -1;
        Callable<Integer> t1 = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                Thread.sleep(10);
                for (int i=0; i<n; i++) {
                    sum += i;
                }
                return sum;
            }
        };

        Callable<Void> t2 = new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                Thread.sleep(3600*1000);  // sleep for an hour
                return null;
            }
        };

        // submit tasks
        Future<Integer> f1 = tpool.submit(t1);
        Future<Void> f2 = tpool.submit(t2);

        try {
            f2.cancel(true);
            // poll for the completion of first task
            while (! f1.isDone()) {
                System.out.println("Waiting for the first task to be completed");
                Thread.sleep(5);
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println("Is the second task cancelled: " + f2.isCancelled());
        return result;
    }
}
