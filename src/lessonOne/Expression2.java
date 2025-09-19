package lessonOne;

import java.util.Scanner;

public class Expression2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value of X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value of c: ");
        double c = scanner.nextDouble();

        double y = a * x * x + b * x + c;
        System.out.println("y = " + y);



    }
}
