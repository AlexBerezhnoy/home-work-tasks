package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class MagnitudeChecker {

    @Step
    public String getGreatestNumberByMagnitude(double a, double b) {
        double mathAbsA = Math.abs(a);
        double mathAbsB = Math.abs(b);
        String result = "";
        if (mathAbsA == mathAbsB) {
            result = "The number "+a+" and "+b+" are equals by magnitude!";
        } else {
            result = mathAbsA > mathAbsB ? "The number " + a + " has the greatest magnitude!" : "The number " + b + " has the greatest magnitude!";
        }
        return result;
    }
}
