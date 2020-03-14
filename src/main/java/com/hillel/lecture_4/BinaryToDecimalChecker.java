package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class BinaryToDecimalChecker {

    @Step
    public int fromDecimalToBinary(int value) {

        int result = 0;
        int powerNumber = 0;
        int temp;
         while (value != 0) {
            temp = value % 2;
            result = result + temp * (int) Math.pow(10, powerNumber);
            powerNumber++;
            value = value/2;
        }
        return result;
    }

    @Step
    public int fromBinaryToDecimal(int value) {

        int result = 0;
        int powerNumber = 0;
        while (value > 0) {
            if (value % 2 != 0) {result = result + (int) Math.pow(2, powerNumber);}
            powerNumber++;
            value = value/10;
        }
        return result;
    }
}
