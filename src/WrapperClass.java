public class WrapperClass {
    /*
    Classes for the primitive data types are called Wrapper classes
        int => Integer
        float => Float
        double => Double
        boolean => Boolean
    
    Auto-boxing is a feature where primitive variable can be assigned directly to 
    its corresponding wrapper class.
    Auto-unboxing is a feature where Wrapper object variable can be assigned to its
    corresponding primitive type
    */
    public static void main(String args[]) {
        int num = 5;
        // deprecated
        // Integer n = new Integer(num);
        Integer n = num; // auto-boxing
        System.out.println(n);
        int num2 = n; // auto-unboxing
        System.out.println(num2);

        String str = "5";
        Integer num3 = Integer.parseInt(str);
        System.out.println(num3);
    }
}
