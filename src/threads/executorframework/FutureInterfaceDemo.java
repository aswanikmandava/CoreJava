package src.threads.executorframework;

import java.util.concurrent.*;

public class FutureInterfaceDemo {

    // create and initialize a thread pool
    static ExecutorService tpool = Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws Exception {
        System.out.println("Sum of 5 integers: " + findSum(5));
        System.out.println("Sum of 5 integers (exception): " + findSumWithException(5));
        tpool.shutdown();
    }

    static int findSum(final int n) throws ExecutionException, InterruptedException {
        Callable<Integer> sumTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int sum = 0;
                for (int i=0; i<n; i++) {
                    sum += i;
                }
                return sum;
            }
        };
        Future<Integer> f = tpool.submit(sumTask);
        return f.get();
    }

    static int findSumWithException(final int n) throws ExecutionException, InterruptedException {
        int result = -1;
        Callable<Integer> sumTask = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                throw new RuntimeException("Unknown runtime exception");
            }
        };
        Future<Integer> t = tpool.submit(sumTask);
        try {
            /*
            The get method is a blocking call. It'll block till the task completes.
            We can also write a polling version, where we poll periodically to check if the
            task is complete or not. Future also allows us to cancel tasks. If a task has
            been submitted but not yet executed, then it'll be cancelled. However, if a
            task is currently running, then it may or may not be cancellable.
             */
            t.get();
        }
        catch (ExecutionException e) {
            System.out.println("Something went wrong: " + e.getCause());
        }
        return result;
    }
}
