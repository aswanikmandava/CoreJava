package src.recursion;

// given an array of integers, find the index of its first occurrence
public class NumFirstOccurr {
    public static int getElementIndex(int[] arr, int ele, int index) {
        if (arr.length-1 == index) {
            return -1;
        }
        else if (arr[index] == ele) {
            return index;
        }
        else {
            return getElementIndex(arr, ele, (index+1));
        }
    }

    public static int getElementIndexIterative(int[] arr, int ele) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == ele) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] items = {10, 2, 5, 33, 56, 90, 1};
        System.out.println("Item found at: " + getElementIndex(items, 56, 0));
        System.out.println("Item found at: " + getElementIndexIterative(items, 56));
    }
}
