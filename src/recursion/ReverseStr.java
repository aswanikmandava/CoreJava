package src.recursion;

public class ReverseStr {
    public static String reverse(String str) {
        if ( str.isEmpty()) {
            return str;
        }
        else {
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
    public static void main(String[] args) {
        String mystr = "Hello, World";
        System.out.println("Reversed string: " + reverse(mystr));

    }

}
