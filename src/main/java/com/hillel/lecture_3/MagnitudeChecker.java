package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
//        TODO implements result
        String result = "";
        if (Math.abs(a) == Math.abs(b)) {
            result = "The number "+a+" and "+b+" are equals by magnitude!";
        } else {
            result = Math.abs(a) > Math.abs(b) ? "The number " + a + " has the greatest magnitude!" : "The number " + b + " has the greatest magnitude!";
        }
        return result;
    }
}
