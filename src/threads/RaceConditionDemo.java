package src.threads;
import java.util.*;

public class RaceConditionDemo {
    public static void main(String[] args) throws InterruptedException
    {
        RaceCondition.runTest();
    }

}

class RaceCondition {
    int randInt;
    Random random = new Random(System.currentTimeMillis());

    void printer() {
        int i = 100000;
        while ( i != 0 ) {
            if (randInt % 5 == 0) { // code to show thread is unsafe
                // even though we check the state
                // before executing next line of code
                // state of randInt is modified causing inconsistent behavior
                // which causes race condition
                if (randInt % 5 != 0) {
                    System.out.println(randInt);
                }
            }
            i--;
        }
    }

    void modifier() {
        int i = 100000;
        while ( i != 0 ) {
            randInt = random.nextInt(1000);
            i--;
        }

    }

    public static void runTest() throws InterruptedException {
        final RaceCondition rc = new RaceCondition();
        Thread pt = new Thread(new Runnable() {
            @Override
            public void run() {
                rc.printer();
            }
        });
        Thread mt = new Thread(new Runnable() {
            @Override
            public void run() {
                rc.modifier();
            }
        });
        pt.start();
        mt.start();
        pt.join();
        mt.join();
    }
}