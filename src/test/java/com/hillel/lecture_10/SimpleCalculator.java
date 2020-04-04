package com.hillel.lecture_10;

import java.util.Objects;

public class SimpleCalculator extends Calculator {

    private double memoryNumber;
    public SimpleCalculator(double firstNumber, double secondNumber) {
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

    public double getMemoryNumber() {
        System.out.println("Number in memory is " + this.memoryNumber);
        return this.memoryNumber;
    }

    public void setMemoryNumber(double memoryNumber) {
        System.out.println("Number was saved");
        this.memoryNumber = memoryNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleCalculator that = (SimpleCalculator) o;
        return Double.compare(that.memoryNumber, memoryNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(memoryNumber);
    }

    @Override
    public String toString() {
        return "SimpleCalculator{" +
                "memoryNumber=" + memoryNumber +
                ", firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
