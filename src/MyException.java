// Exception class hierarchy
// Object -> Throwable -> Exception -> RuntimeException -> ArithmeticException
//                     -> Error -> IOError, OutOfMemoryError

// define a custom exception by inheriting Exception class
class CustomException extends Exception {
    public CustomException(String str) {
        super(str);
    }
}

public class MyException {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int[] sum = new int[3];
        try {
            int result = i / j;
            sum[2] = 100;
            if (result == 0) {
                // raise an exception yourself by creating an object to specific Exception class
                throw new CustomException("This can lead to div/0 error downstream");
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Accessing non-existing array index: " + e);
        }
        catch (CustomException e) {
            System.out.println("Caught custom err: " + e);
        }
        catch (Exception e) {
            System.out.println("Error occurred: " + e);
        }
        finally {
            System.out.println("Finally, I'm here");
        }
    }
}
