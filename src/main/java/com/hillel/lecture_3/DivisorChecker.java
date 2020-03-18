package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DivisorChecker {

    @Step
    public String checkDivisor(int divisor, int number) {
        String result = "";
            result = (divisor % number == 0) ? "The number "+number+" is divisor of the number "+divisor : "The number "+number+" is not divisor of the number "+divisor;
        return result;
    }
}
