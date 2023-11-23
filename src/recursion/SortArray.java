package src.recursion;

// sort an array of integers

// following logic compares element at index i with element at index i+1
// if arr[i] > arr[i+1] then elements at those positions are swapped
// when this logic is repeated for one iteration of an entire array,
// it would leave smallest integer at last index
// repeat this process leaving the last element
// repeat this process leaving the last 2 elements which would put first 2 smallest elements
// at the end

public class SortArray {
    public static void sortArr(int[] arr, int size) {   // recursive approach
        if (size == 1) {
            return;
        }
        for (int i=0; i<(size-1); i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sortArr(arr, (size-1));
    }

    public static void sortArrIterative(int[] arr) {
        // regular (non-recursive) approach
        int size = arr.length;
        for (int i=0; i<size; i++) {
            for (int j=0; j<(size-1); j++) {
                if (arr[j] > arr[j+1]) {
                    // swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArr = {15, 11, 8, 22, 10, 1, 6, 31, 20};
        sortArr(myArr, myArr.length);
        //sortArrIterative(myArr);
        for (int i:myArr) {
            System.out.print(i + " ");
        }

    }
}
