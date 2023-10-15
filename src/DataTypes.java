
public class DataTypes {
    public static void main(String args[]) {
        int a = 10; // 4 bytes
        int a1 = 0b1100; // you can assign binary number to integer type
        int a2 = 0xFF; // you can assign hexadecimal number to integer type as well
        int a3 = 1_000_000; // you can use underscore for a big number to improve readability
        System.out.println("binary a1="+a1);
        System.out.println("hexadecimal a2="+a2);
        System.out.println("readability int a3="+a3);
        short b = 1; // 2 bytes
        byte c = 2; // 1 byte
        long d = 344455555l; // long type ends with letter 'l'
        float e = 3.14f;    // float type ends with 'f' otherwise it is treated as double by default
        double f = 5.56777777777; // more precision than float type
        char g = 'a'; // 2 bytes - unicode
        boolean h = true;
    }
}
