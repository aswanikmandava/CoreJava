
public class LogicalOperators {
    public static void main(String args[]) {
        int a = 10;
        int b = 15;
        boolean gt_result = a > b;
        boolean lg_result = (a % 2 == 0) && gt_result;
        boolean lg2_result = a > 20 || b > 20 || (a + b) > 20;
        boolean lg3_result = !lg_result;
        System.out.println("LOGICAL AND: " + lg_result);
        System.out.println("LOGICAL OR: " + lg2_result);
        System.out.println("LOGICAL NOT: " + lg3_result);
    }
}
