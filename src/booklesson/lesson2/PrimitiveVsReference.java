package booklesson.lesson2;

public class PrimitiveVsReference {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = i1;
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);

        String s1 = "hello";
        String s2 = s1;
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
    }
}
