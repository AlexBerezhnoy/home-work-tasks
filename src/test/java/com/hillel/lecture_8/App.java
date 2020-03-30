package com.hillel.lecture_8;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class App {
    FractionNumber firstFractionNumber = new FractionNumber(3,4);
    FractionNumber secondFractionNumber = new FractionNumber(2,3);

    @Test
    public void plusFractionNumberTest() {
        FractionNumber expectedPlusResult = new FractionNumber(17, 12);
        assertEquals(firstFractionNumber.plus(secondFractionNumber), expectedPlusResult);
    }

    @Test
    public void minusFractionNumberTest() {
        FractionNumber expectedMinusResult = new FractionNumber(1, 12);
        assertEquals(firstFractionNumber.minus(secondFractionNumber), expectedMinusResult);
    }

    @Test
    public void multiplyFractionNumberTest() {
        FractionNumber expectedMultiplyResult = new FractionNumber(6, 12);
        assertEquals(firstFractionNumber.multiply(secondFractionNumber), expectedMultiplyResult);
    }

    @Test
    public void devideFractionNumberTest() {
        FractionNumber expectedDevideResult = new FractionNumber(9, 8);
        assertEquals(firstFractionNumber.divide(secondFractionNumber), expectedDevideResult);
    }
}
