
public class Operators {
    public static void main(String args[]) {
        int num = 10;
        int num2 = 10;
        // following all are same commands
        // num = num + 1;
        // num += 1;
        // num++;

        int result = ++num; // pre-increment num before assignment
        int result2 = num2++; // post-increment num after assignment
        System.out.println("pre increment assignment: " + result);
        System.out.println("post increment assignment: " + result2);

        // result = (condition) ? (when_true) : (when_false)
        boolean result3 = (num > 100) ? true : false;
        System.out.println(result3);
    }
}
