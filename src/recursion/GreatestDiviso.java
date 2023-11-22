package src.recursion;

// The GCD (Greatest Common Divisor) of two integers is the largest integer that can fully divide both numbers,
// without a remainder.
/*
The method should take two integers as input. Their GCD is to be computed, as input.
        The method should return the GCD of the two integers as output.
        The method should be recursive.
        Sample Input: 24, 18

        Sample Output: 6

 */
public class GreatestDiviso {
    public static int gcd(int num1, int num2) {
        System.out.println("called with args num1: " + num1 + ", num2: " + num2);
        if (num1 == 0) { // base case
            System.out.println("Returning num2: " + num2);
            return num2;
        }
        else if (num2 == 0) { // base case
            System.out.println("Returning num1: " + num1);
            return num1;
        }
        if (num1 > num2) {  // recursive case
            return gcd(num1 % num2, num2);
        }
        else {
            return gcd(num1, num2 % num1);
        }
    }

    public static void main(String[] args) {
        gcd(36, 54);
    }

}
