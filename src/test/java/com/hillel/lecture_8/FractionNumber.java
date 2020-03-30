package com.hillel.lecture_8;

public class FractionNumber {
    private int numerator;
    private int denominator;

    FractionNumber(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public double addition (double term) {
        double result =  (double) numerator/denominator + term;
        System.out.println("Sum " + numerator + "/"+denominator + " + " + term + " = " + result);
        return result;
    }

    public double subtraction (double subtrahend) {
        double result = (double) numerator/denominator - subtrahend;
        System.out.println("Sub " + numerator + "/"+denominator + " - " + subtrahend + " = " + result);
        return result;
    }

    public double multiplication (double factor) {
        double result = (double) numerator/denominator * factor;
        System.out.println("Multi " + numerator + "/"+denominator + " * " + factor + " = " + result);
        return  result;
    }

    public double division (double divider) {
        double result =((double) numerator/denominator) / divider;
        System.out.println("Div " + numerator + "/"+denominator + " : " + divider + " = " + result);
        return  result;
    }

    @Override
    public String toString() {
        return "FractionNumbers{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
