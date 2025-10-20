package booklesson.lesson2;

import java.util.Scanner;

public class EqualityExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any integer value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter any integer value of b: ");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println(a + " > " + b + " = a greater than b");
        }
        else {
            System.out.println(b + " > " + a + " = b greater than a");
        }
    }
}
