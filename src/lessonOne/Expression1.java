package lessonOne;

import java.util.Scanner;

public class Expression1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Value of X = ");
        double x = scanner.nextDouble();
        double y = x + 1;
        System.out.println("Y = " + y );
        scanner.close();
    }

}
