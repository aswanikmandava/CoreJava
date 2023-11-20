package src.practice;
import java.util.Random;
public class CoinFlip {
    public static void main(String[] args) {
        Random r = new Random();
        // generate a random number between 0 and given max (exclusive)
        int val = r.nextInt(2);
        if (val % 2 == 0) {
            System.out.println(val + " is even");
        }
        else {
            System.out.println(val + " is odd");
        }

    }
}
