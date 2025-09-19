package lessonOne;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = scanner.nextDouble();
        double area;
        area = r * r * 3.1416;
        System.out.println("Area of circle: " + area);
    }
}
