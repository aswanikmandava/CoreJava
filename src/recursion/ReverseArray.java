package src.recursion;

// Given the array of integers, reverse the elements in it
// eg: {20, 31, 6, 1, 10} becomes {10, 1, 6, 31, 20}
public class ReverseArray {
    public static void reverseArr(int[] arr, int index) {
        if (index < arr.length / 2) {
            // swap element at index with the corresponding position from the end
            int reverse_pos = (arr.length - 1) - index;
            System.out.println("Swapping ele at pos " + index + " with " + reverse_pos);
            int temp = arr[index];
            arr[index] = arr[reverse_pos];
            arr[reverse_pos] = temp;
            reverseArr(arr, (index+1));
        }

    }

    public static void reverseArrIterative(int[] arr) {
        int mid = arr.length / 2;
        int temp;
        for (int i=0; i<mid; i++) {
            int rev_index = (arr.length-1) - i;
            // swap elements at indexes i and rev_index
            System.out.println("swap element at " + i + " with " + rev_index);
            temp = arr[i];
            arr[i] = arr[rev_index];
            arr[rev_index] = temp;
        }
    }

    public static void main(String[] args) {
        int[] myArr = {20, 31, 6, 1, 10, 22, 8, 11, 15};
        //reverseArr(myArr, 0);
        reverseArrIterative(myArr);

        for (int i: myArr) {
            System.out.print(i + " ");
        }
    }
}
