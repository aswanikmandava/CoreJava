
public class Switch_Stmt {
    public static void main(String args[]) {
        int num = 1;

        // equivalent if else if statement
        // if (num == 1) {
        //     // do something
        // }
        // else if (num == 2) {
        //     // do something
        // }
        // else {
        //     // do default thing
        // }
        switch(num) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            default:
                System.out.println("No value matched");
        }
    }
}
