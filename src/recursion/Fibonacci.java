package src.recursion;

import java.util.ArrayList;

// The Fibonacci Sequence is one of the most famous formulas in mathematics.
// Each number in the sequence is the sum of the two numbers that precede it.
public class Fibonacci {
    public static int getSeries(int num) {
        if (num <= 1) { // base case
            return num;
        }
        else {
            return getSeries(num-1) + getSeries(num-2);
        }

    }

    public static void getSeriesIterative(int num) {
        ArrayList<Integer> mylist = new ArrayList<>();
        mylist.add(0);
        mylist.add(1);
        for (int i=2; i<num; i++) {
            int temp = mylist.get(i-1) + mylist.get(i-2);
            mylist.add(temp);
        }
        System.out.println(mylist);
    }

    public static void main(String[] args) {
        int numCount = 8;
        for (int i=0; i<numCount; i++) {
            System.out.print(getSeries(i) + " ");
        }

        System.out.println("Fibonacci series using non-recursive approach");
        getSeriesIterative(8);

    }
}
