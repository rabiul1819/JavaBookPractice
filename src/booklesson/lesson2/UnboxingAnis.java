package booklesson.lesson2;

public class UnboxingAnis {
    public static void main(String[] args) {
        // object to primitive
        Double obj = Double.valueOf(10.25); // ✅modern, create object  (no deprecated constructor)
        double num = obj; // ✅ // automatic unboxing

        System.out.println("Object value = " + obj);
        System.out.println("Primitive value = " + num);
    }
}
