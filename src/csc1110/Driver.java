package csc1110;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Get a fraction from the user
        System.out.println("Enter two fractions of the form numerator / denominator");
        Fraction fraction1 = new Fraction(in);
        Fraction fraction2 = new Fraction(in);

        Fraction difference = fraction1.minus(fraction2);
        System.out.println(fraction1 + " - " + fraction2 + " = " + difference);
    }
}
