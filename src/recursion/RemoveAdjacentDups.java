package src.recursion;

// Given an input string, remove any adjacent duplicate chars
// "Rabbit" becomes "Rabit"
// "Door bell" becomes "Dor bel"
public class RemoveAdjacentDups {
    public static String removeDups(String str) {
        System.out.println("Called with: " + str);
        if (str.length() == 1) {
            return str;
        }
        if (str.charAt(0) == str.charAt(1)) { // first and second chars in a given string are same
            System.out.println(str.charAt(0) + " == " + str.charAt(1));
            return removeDups(str.substring(1)); // consider rest of string starts with 2nd char
        }
        else {
            return str.charAt(0) + removeDups(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String mystr = "abbaapppa";
        System.out.println(removeDups(mystr));
    }
}
