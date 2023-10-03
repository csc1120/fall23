package csc1110;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get a fraction from the user
        System.out.println("Enter a fraction of the form numerator / denominator");
        int num1 = in.nextInt();
        in.next();
        int den1 = in.nextInt();

        // Get a fraction from the user
        System.out.println("Enter a fraction of the form numerator / denominator");
        int num2 = in.nextInt();
        in.next();
        int den2 = in.nextInt();

        // Add two fractions
        int sumNum = num1 * den2 + num2 * den1;
        int sumDen = den1 * den2;

        // Display result
        System.out.println(num1 + " / " + den1 + " + " + num2 + " / " + den2 + " = " +
                sumNum + " / " + sumDen);
    }
}
