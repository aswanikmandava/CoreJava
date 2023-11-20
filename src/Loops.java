
public class Loops {
    public static void main(String args[]) {
        int num = 5;
        while (num > 0) {
            System.out.println("value of num: " + num);
            num--;
        }
        int digit = 4;

        // if you want the code to execute at least once, use do-while loop
        do {
            System.out.println("value of digit: " + digit);
            digit--;
        } while (digit > 5);

        // for loop syntax - for(init_stmt; condition_stmt; post_stmt;)
        // init_stmt => executed only once before the code block execution
        // condition_stmt => defines the condition for the code block to be executed
        // post_stmt => is executed everytime after the code block is executed
        for (int number=0; number < 5; number++) {
            System.out.println("Number: " + number);
        }

        String[] fruits = {"banana", "strawberry", "mango", "avocado"};

        // foreach loop (enhanced for loop which loops over sequence)
        for (String f:fruits) {
            System.out.println("Fruit: " + f);
        }
    }
}
