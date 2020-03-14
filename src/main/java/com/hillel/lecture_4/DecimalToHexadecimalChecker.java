package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class DecimalToHexadecimalChecker {

    @Step
    public String fromDecimalToHexadecimal(int value) {

        String result = "";

        while (value  !=0 ) {
            int mod = value % 16;
            int div = value / 16;
            switch (mod) {
                case 10:
                    result = "A" + result;
                    value = div;
                    break;
                case 11:
                    result = "B" + result;
                    value = div;
                    break;
                case 12:
                    result = "C" + result;
                    value = div;
                    break;
                case 13:
                    result = "D" + result;
                    value = div;
                    break;
                case 14:
                    result = "E" + result;
                    value = div;
                    break;
                case 15:
                    result = "F" + result;
                    value = div;
                    break;
                default:
                    result = mod + result;
                    value = div;
            }
        }
        return result;
    }

    @Step
    public int fromHexadecimalToDecimal(String value) {

        int result = 0;
// !!!stackoverflow coding

//        String digits = "0123456789ABCDEF";
//        int val = 0;
//        for (int i = 0; i < value.length(); i++) {
//            char c = value.charAt(i);
//            int d = digits.indexOf(c);
//            result = 16*result + d;
//        }

        for (int i = 0; i < value.length(); i++) {
             char numeric = value.charAt(i);
            int power = (int) Math.pow( 16, value.length() - i - 1);
            switch (numeric) {
                case 'A':
                    result = result + 10 * power;
                    break;
                case 'B':
                    result = result + 11 * power;
                    break;
                case 'C':
                    result = result + 12 * power;
                    break;
                case 'D':
                    result = result + 13 * power;
                    break;
                case 'E':
                    result = result + 14 * power;
                    break;
                case 'F':
                    result = result + 15 * power;
                    break;
                default:
                    result = result +  Character.getNumericValue(numeric) * power;
            }
        }
        return result;
    }
}
