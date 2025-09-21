package lessonOne.patternsrightangle;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {

        System.out.print("Enter number of rows: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int row,col;
        for (row = 1; row <= n; row++){
            for (col = 1; col <= row; col++){
                System.out.print(row % 2 + " ");
            }
            System.out.print("\n");
        }

        scanner.close();
    }
}
