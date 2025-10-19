package booklesson.lesson2;

public class UnboxingExample1 {
    public static void main(String[] args) {

        //object to primitive data type
      //  Double d = new Double(10.25);//deprecated since Java 9
        Double obj = Double.valueOf(10.25);//  modern, safe way to create object (no deprecated constructor)
        double num = obj; // ✅ Unboxing happens automatically here

        System.out.println("Object value = " +obj);
        System.out.println("Primitive value= " + num);
    }
}
