package booklesson.lesson2;

import java.util.Scanner;

public class LengthConversionCalculatorInchToMeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double inch ;
        System.out.println("Enter the length in inch: ");
        inch = input.nextDouble();

        double meter = inch * .0254;
        System.out.print("Result in meter: " + meter + " meters.");
    }
}
