package booklesson.lesson2;

public class NumericLiteral {
    public static void main(String[] args) {

        int x1 = 2_101_969;
        System.out.println("X1 = " + x1);

        int x2 = 1__192;
        System.out.println("X2 = " + x2);

        int x3 = 03_661;
        System.out.println("X3 = " + x3);

        int x4 = 0b0111_1011_0001;
        System.out.println("X4 = " + x4);

        int x5 = 0x7_B_1;
        System.out.println("X5 = " + x5);

        byte b1 = 1_2_7;
        System.out.println("b1 = " + b1);

        double d1 = 1_29.09_19;
        System.out.println("d1 = " + d1);
    }
}
