package src.recursion;

public class DigitCounter {
    public static int getCount(int number) {    // recursive
        if (number < 10) {
            return 1;
        }
        else {
            return 1 + getCount(number/10);
        }
    }

    public static int getCountIterative(int number) {
        int count = 1;
        while (number >= 10) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Count of digits: " + getCount(2344556));
        System.out.println("Count of digits: " + getCountIterative(2344589));
    }
}
