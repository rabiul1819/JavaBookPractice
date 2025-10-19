package booklesson.lesson2;

public class OverflowUnderflow {
    public static void main(String[] args) {

        int a = 2_147_483_647;
        a = a + 1;
        System.out.println("a = " + a);

        int b = 2_147_483_647;
        b = b - 1;
        System.out.println("b = " + b);

        int maxInteger = Integer.MAX_VALUE;
        System.out.println("Integer Max: " + maxInteger);
        int minInteger = Integer.MIN_VALUE;
        System.out.println("Integer Minimum: " + minInteger);

        byte byteMax = Byte.MAX_VALUE;
        System.out.println("Byte Max: " + byteMax);
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("Byte Min: " + byteMin);

        short maxShort = Short.MAX_VALUE;
        System.out.println("Short Max: " + maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println("Short Min: " + minShort);

        long maxLong = Long.MAX_VALUE;
        System.out.println("Long max: " + maxLong);
        long minLong = Long.MIN_VALUE;
        System.out.println("Long min: " + minLong);

        float maxFloat = Float.MAX_VALUE;
        System.out.println("Float max: " + maxFloat);
        float minFloat = Float.MIN_VALUE;
        System.out.println("Float min: " + minFloat);

        double maxDouble = Double.MAX_VALUE;
        System.out.println("Double max: " + maxDouble);
        double minDouble = Double.MIN_VALUE;
        System.out.println("Double min: " + minDouble);

        double p = Double.MAX_VALUE * 2; // if floating is overflow then result will be Infinity
        System.out.println("Overflow: " + p);
        double q = Double.MIN_VALUE / 2;
        System.out.println("Underflow: " + q);//if floating is underflow then result will be 0.0

        float f1 = Float.MAX_VALUE * 2; // if floating is overflow then result will be Infinity
        System.out.println("Overflow: " + f1);
        double f2 = Float.MIN_VALUE / 2;
        System.out.println("Underflow: " + f2);//if floating is underflow then result will be 0.0

    }
}
