package booklesson.lesson2;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextByte();

        System.out.print("Enter value of c: ");
        double c = input.nextByte();

        double determinant = b * b - 4 * c;

        if (determinant > 0){
            double root1 = ( -b + Math.sqrt(determinant)) / 2 * a;
            double root2 = ( -b - Math.sqrt(determinant)) / 2 * a;

            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (determinant == 0) {
            double root = -b /(2 * a);
            System.out.println("The root is: " + root);

        }
        else {
            System.out.println("The equation has no real equation: ");
        }
    }
}
