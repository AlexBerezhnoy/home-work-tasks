package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class ProductCodeValidationChecker {


    @Step
    public boolean validateCode(String code) {

        boolean isValid = false;
        String[] codeSplitArray = code.split(" ");
        int partOne = parseToInt(codeSplitArray[0],2,6) *
                parseToInt(codeSplitArray[0],7, 10) *
                parseToInt(codeSplitArray[0], 13, 17);

        int partTwo = Integer.parseInt(codeSplitArray[1]);
            if (codeSplitArray[0].equals(codeSplitArray[0].toUpperCase()) && partOne == partTwo) {isValid = true;}
        return isValid;
    }
    public static int parseToInt (String string, int firstNumberOfChar, int secondNumberOfChar) {
        String tempString = Character.toString(string.charAt(firstNumberOfChar));
        tempString = tempString + string.charAt(secondNumberOfChar);
        int result = Integer.parseInt(tempString);
        return result;
    };
}
