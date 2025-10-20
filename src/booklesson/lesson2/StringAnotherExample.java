package booklesson.lesson2;

public class StringAnotherExample {
    public static void main(String[] args) {

        System.out.println(5 + 3 + " Abcd | This is showing additive result |");
        System.out.println(5 + 3 * 2 + " Abcd | This is showing additive result |" );
        System.out.println();
        System.out.println(" Abcd " + 5 + 3 +" here did not work plus operator");
        System.out.println(" Abcd " + 5 + 3 * 2 + " here did not work plus operator");
        System.out.println("----------------------------------------------");

        System.out.println("Keep In Mind: java always count any expression from left to right");
        System.out.println("----------------------------------------------");

        System.out.println(" Abcd " + (5 + 3 )+" here  plus operator is working");
        System.out.println(" Abcd " + (5 + 3 * 2 )+ " here plus operator is working properly");

    }
}
