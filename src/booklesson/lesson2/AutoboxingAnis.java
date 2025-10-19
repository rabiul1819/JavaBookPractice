package booklesson.lesson2;

public class AutoboxingAnis {
    public static void main(String[] args) {

        // primitive to object
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        Integer z = x;
        System.out.println("z = " + z);

    }
}
