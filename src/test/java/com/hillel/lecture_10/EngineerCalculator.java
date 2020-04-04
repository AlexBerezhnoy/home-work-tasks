package com.hillel.lecture_10;

public class EngineerCalculator extends Calculator {

    public EngineerCalculator(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double plus() {
        return firstNumber + secondNumber;
    }

    @Override
    public double minus() {
        return firstNumber - secondNumber;
    }

    @Override
    public double multy() {
        return firstNumber * secondNumber;

    }

    @Override
    public double div() {
        return firstNumber / secondNumber;
    }

    public double powerSinX (Calculator calculator) {
        return Math.pow(Math.sin(firstNumber), secondNumber);
    }

}
