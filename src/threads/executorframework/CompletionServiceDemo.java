package src.threads.executorframework;

import java.util.Random;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
The completion service is a combination of a blocking queue and an executor.
Tasks are submitted to the queue and then the queue can be polled for completed tasks.
The service exposes two methods, one poll which returns null if no task is completed or
none were submitted and two take which blocks till a completed task is available.
*/
public class CompletionServiceDemo {
    static Random r = new Random(System.currentTimeMillis());

    public static void main(String[] args) {

    }

    static void completionServiceExample() throws Exception {
        class TrivialTask implements Runnable {
            int n;
            public TrivialTask(int n) {
                this.n = n;
            }

            @Override
            public void run() {
                try {
                    Thread.sleep(r.nextInt());
                    System.out.println(n*n);
                }
                catch (InterruptedException e) {
                    // caught exception
                }

            }
        }
        ExecutorService tpool = Executors.newFixedThreadPool(3);
        ExecutorCompletionService<Integer> srv = new ExecutorCompletionService<Integer>(tpool);

        // submit 10 trivial tasks
        for (int i=0; i<10; i++) {
            System.out.println(srv.submit(new TrivialTask(i), new Integer(i)));
        }

        // wait for all tasks to complete
        int count = 10;
        while (count > 0) {
            Future<Integer> f = srv.poll();
            if (f != null) {
                System.out.println("Thread " + f.get() + " is done");
            }
            count--;
        }
        tpool.shutdown();
    }
}
