import java.util.Arrays;

public class MyArray {
    public static void main(String[] args) {
        // declare and initialize and int array
        // int[] my_arr = {10, 20, 30};
        // declare an int array
        int[] my_arr = new int[3];
        // init some random values to it using for loop and Math.random method
        for (int i=0; i < my_arr.length; i++) {
            double val = Math.random()*100;
            my_arr[i] = (int)val;
            System.out.println(my_arr[i]);
        }
        // declare a 2D array
        int[][] my_2d_arr = new int[3][4];
        for (int i=0; i < my_2d_arr.length; i++) {
            for (int j=0; j < my_2d_arr[i].length; j++) {
                double val = Math.random()*5;
                my_2d_arr[i][j] = (int)val;
                System.out.print(my_2d_arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("Navigating 2D array in an efficient way");
        // efficient way of navigating 2D array
        for (int[] num:my_2d_arr) {
            for (int digit:num) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }
        System.out.println("Initializing jagged array");
        // declare a 2D jagged array
        // size of inner array varies
        int[][] my_2d_j_arr = new int[3][];
        my_2d_j_arr[0] = new int[2];
        my_2d_j_arr[1] = new int[5];
        my_2d_j_arr[2] = new int[3];
        for (int i=0; i < my_2d_j_arr.length; i++) {
            for (int j=0; j < my_2d_j_arr[i].length; j++) {
                double val = Math.random()*10;
                my_2d_j_arr[i][j] = (int)val;
                System.out.print(my_2d_j_arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("Navigating jagged 2D array in an efficient way");
        for (int[] num:my_2d_j_arr) {
            for (int digit:num) {
                System.out.print(digit + " ");
            }
            System.out.println();
        }

    }
}
