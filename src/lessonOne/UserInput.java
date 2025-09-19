package lessonOne;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer number: ");
        int num2 = scanner.nextInt();
        System.out.println(num1 + " + " + num2 +" = " + (num1 + num2));

        System.out.print("Enter first double number: ");
        double n1 = scanner.nextDouble();
        System.out.print("Enter second double number: ");
        double n2 = scanner.nextDouble();
        System.out.println(n1 + " + " + n2 +" = " + (n1 + n2));
    }
}
