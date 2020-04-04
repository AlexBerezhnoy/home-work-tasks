package com.hillel.lecture_10;

public abstract class Calculator {
    double firstNumber;
    double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public abstract double plus ();
    public abstract double minus ();
    public abstract double multy ();
    public abstract double div ();

}
