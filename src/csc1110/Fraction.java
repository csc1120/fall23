package csc1110;

import java.util.Scanner;

public class Fraction {
    private int num;
    private int den;

    public Fraction(int numerator, int den) {
        num = numerator;
        this.den = den;
    }

    public Fraction(Scanner in) {
        num = in.nextInt();
        in.next();
        den = in.nextInt();
    }

    public Fraction plus(Fraction that) {
        int sumNum = this.num * that.den + that.num * this.den;
        int sumDen = this.den * that.den;
        return new Fraction(sumNum, sumDen);
    }

    public Fraction minus(Fraction that) {
        return new Fraction(this.num * that.den - that.num * this.den,
                this.den * that.den);
    }

    public String toString() {
        return num + " / " + den;
    }
}
