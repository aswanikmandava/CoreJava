package src.recursion;

// find the sum of all integers in an array
public class SumArray {
    public static int getSum(int[] arr, int size) {
        if (size <= 0) {
            return 0;
        }
        return getSum(arr, size-1) + arr[size-1];
    }

    public static int getSumIterative(int[] arr) {
        int sum=0;
/*        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
        }*/
        for (int i:arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myArr = {1, 20, 11, 5, 8};
        System.out.println("Sum: " + getSumIterative(myArr));
        System.out.println("Sum: " + getSum(myArr, myArr.length));
    }
}
