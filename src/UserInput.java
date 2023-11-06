// Take input from console

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // BufferedReader bf = null;
        try {
            // Prior to java 1.5, you can use this way to accept input from user
            // InputStreamReader ir = new InputStreamReader(System.in);
            // BufferedReader bf = new BufferedReader(ir);
            // String my_input = bf.readLine();

            // From java 1.5, you can use Scanner class
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your input: ");
            String my_input = in.nextLine();
            System.out.println("Got input: " + my_input);
        }
        catch (Exception e) {
            System.out.println("ERR: " + e);
        }
        finally {
            // bf.close();
        }
    }
}
