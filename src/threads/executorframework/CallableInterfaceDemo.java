package src.threads.executorframework;

import java.util.concurrent.Callable;

public class CallableInterfaceDemo {
    public static void main(String[] args) throws Exception {
        final int n = 5;
        // We could take advantage of the anonymous class feature in the Java language to
        // declare our task
        Callable<Integer> ct = new Callable<Integer>() {
            int sum = 0;
            @Override
            public Integer call() throws Exception {
                for (int i=0; i<n; i++) {
                    sum += i;
                }
                return null;
            }
        };

    }
}

class SumTask implements Callable<Integer> {
    int n;
    public SumTask(Integer n) {
        this.n = n;
    }

    public Integer call() throws Exception {
        int sum = 0;
        if (n <= 0) {
            return sum;
        }
        for (int i=0; i<n; i++) {
            sum += i;
        }
        return sum;
    }
}