package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class QuadraticEquationChecker {

    @Step
    public String checkQuadraticEquation(double a, double b, double c) {

        String result = "";
        double discriminant = discriminant(a,b,c);
        if (a == 0) {
            result = "The 'a' coefficient should not be zero!";
        } else if (discriminant < 0) {
            result = "No roots on the set of real numbers!";
        } else if (discriminant ==0) {
            result = "Two real, identical roots: [x1 && x2] = "+(-1 * b / (2 * a));
        } else {
            result = "Discriminant: "+ discriminant +", x1: " + (-1 * b + Math.sqrt(discriminant))/(2 * a) +", x2: "+ (-1 * b - Math.sqrt(discriminant))/(2 * a);
        }
        return result;
    }
    public static double discriminant (double a, double b, double c){
        double result =  b * b - 4 * a * c;
        return result;
    }
}
