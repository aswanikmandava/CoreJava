package src.threads.executorframework;

import java.util.concurrent.*;

public class FutureInterfaceDemo {

    // create and initialize a thread pool
    static ExecutorService tpool = Executors.newFixedThreadPool(2);
    public static void main(String[] args) throws Exception {
        System.out.println("Sum of 5 integers: " + findSum(5));
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
}
