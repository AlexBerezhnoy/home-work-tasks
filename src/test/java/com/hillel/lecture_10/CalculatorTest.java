package com.hillel.lecture_10;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    double simpleFirstNumber = 10D;
    double simpleSecondNumber = 2D;
    double engineerFirstNumber = 9D;
    double engineerSecondNumber = 3D;


    Calculator simpleCalculator1 = new SimpleCalculator(simpleFirstNumber,simpleSecondNumber);
    Calculator engineerCalculator1 = new EngineerCalculator(engineerFirstNumber,engineerSecondNumber);
    SimpleCalculator simpleCalculator2 = new SimpleCalculator(simpleFirstNumber,simpleSecondNumber);
    EngineerCalculator engineerCalculator2 = new EngineerCalculator(engineerFirstNumber,engineerSecondNumber);

    @Test
    public void plusSimpleCalculatorTest() {
        assertEquals(simpleCalculator1.plus(), simpleFirstNumber + simpleSecondNumber );
    }

    @Test
    public void minusSimpleCalculatorTest() {
        assertEquals(simpleCalculator1.minus(), simpleFirstNumber - simpleSecondNumber );
    }

    @Test
    public void multySimpleCalculatorTest() {
        assertEquals(simpleCalculator1.multy(), simpleFirstNumber * simpleSecondNumber );
    }

    @Test
    public void divSimpleCalculatorTest() {
        assertEquals(simpleCalculator1.div(), simpleFirstNumber / simpleSecondNumber );
    }

    @Test
    public void plusEngineerCalculatorTest() {
        assertEquals(engineerCalculator1.plus(), engineerFirstNumber + engineerSecondNumber );
    }

    @Test
    public void minusEngineerCalculatorTest() {
        assertEquals(engineerCalculator1.minus(), engineerFirstNumber - engineerSecondNumber );
    }

    @Test
    public void multyEngineerCalculatorTest() {
        assertEquals(engineerCalculator1.multy(), engineerFirstNumber * engineerSecondNumber );
    }

    @Test
    public void divEngineerCalculatorTest() {
        assertEquals(engineerCalculator1.div(), engineerFirstNumber / engineerSecondNumber );
    }

    @Test
    public void memorySimpleCalculatorTest() {
        simpleCalculator2.setMemoryNumber(engineerCalculator2.plus());
        assertEquals(simpleCalculator2.getMemoryNumber(), engineerFirstNumber + engineerSecondNumber  );
    }

    @Test
    public void powSinEngineerCalculatorTest() {
        assertEquals(engineerCalculator2.powerSinX(engineerCalculator1), Math.pow(Math.sin(engineerFirstNumber), engineerSecondNumber) );
    }
}
