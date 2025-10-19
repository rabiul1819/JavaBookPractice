package booklesson.lesson2;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = 1.8 * celsius + 32;
        System.out.println("Temperature in fahrenheit: " + fahrenheit);

        input.close();
    }
}
