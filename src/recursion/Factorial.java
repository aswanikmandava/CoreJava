package src.recursion;

/*
    A factorial is a product of an integer and all the positive integers below it.
    It's denoted by the symbol !
    eg:- factorial of 5 (5!) = 5 x 4 x 3 x 2 x 1
 */
public class Factorial {
    public static int getResult(int number) {
        if (number == 1) {  // base case which tells when to stop execution
            return 1;
        }
        else {  // recursive case
            return number * getResult(number-1);
        }
    }

    public static int getResultIterative(int number) { // this uses non-recursive approach
        int result=1;
        for (int i=1; i<=number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + getResult(5));
        System.out.println("Factorial of 5: " + getResultIterative(5));
    }
}
