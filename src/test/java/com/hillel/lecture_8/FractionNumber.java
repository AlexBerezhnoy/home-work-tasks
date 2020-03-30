package com.hillel.lecture_8;

import java.util.Objects;

public class FractionNumber {
    private int numerator;
    private int denominator;

    FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public FractionNumber plus (FractionNumber term) {
        int resultNumerator = this.numerator * term.denominator + term.numerator * this.denominator;
        int resultDenominator = this.denominator * term.denominator;
        System.out.println("Sum " + this.numerator + "/" + this.denominator + " + " + term.toString() + " = " + resultNumerator + "/" + resultDenominator );
        return new FractionNumber(resultNumerator, resultDenominator);
    }

      public FractionNumber minus (FractionNumber term) {
        int resultNumerator = this.numerator * term.denominator - term.numerator * this.denominator;
        int resultDenominator = this.denominator * term.denominator;
        System.out.println("Sub " + this.numerator + "/" + this.denominator + " - " + term.toString() + " = " + resultNumerator + "/" + resultDenominator );
        return new FractionNumber(resultNumerator, resultDenominator);
    }

    public FractionNumber multiply (FractionNumber factor) {
        int resultNumerator = this.numerator * factor.numerator;
        int resultDenominator = this.denominator * factor.denominator;
        System.out.println("Multi " + this.numerator + "/" + this.denominator + " * " + factor.toString() + " = " + resultNumerator + "/" + resultDenominator );
        return new FractionNumber(resultNumerator, resultDenominator);
    }

    public FractionNumber divide (FractionNumber divider) {
        int resultNumerator = this.numerator * divider.denominator ;
        int resultDenominator = this.denominator * divider.numerator;
        System.out.println("Div " + this.numerator + "/" + this.denominator + " : " + divider.toString() + " = " + resultNumerator + "/" + resultDenominator );
        return new FractionNumber(resultNumerator, resultDenominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return numerator == that.numerator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }
}
