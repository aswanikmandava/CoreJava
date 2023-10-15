
public class TypeCasting {
    public static void main(String args[]) {
        int num = 5;
        byte bnum = (byte)num;  // explicit type conversion called casting

        float pi = 3.14f;
        int pi2 = (int)pi; // loss of data - 0.14
        System.out.println(bnum);
        System.out.println(pi2);

    }
}
