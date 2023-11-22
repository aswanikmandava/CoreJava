package src.recursion;

// program that takes a particular number and sums up all the numbers from 1 up until that number.
public class SumUp {
    public static int getTotal(int num){    // recursion
        if (num == 1) {
            return num;
        }
        else {
            return num + getTotal(num-1);
        }
    }

    public static int getTotalIterative(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num;
            num--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Total: " + getTotal(10));
        System.out.println("Total: " + getTotalIterative(10));

    }
}
