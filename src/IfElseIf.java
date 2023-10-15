
public class IfElseIf {
    public static void main(String args[]) {
        int a = 0;

        if(a > 20) {
            System.out.println(a + " is greator than 20");
        }
        else if(a > 0 && a < 100) {
            System.out.println(a + " is in the range 0-100");
        }
        else {
            System.out.println("No prior conditions matched");
        }
    }
}
