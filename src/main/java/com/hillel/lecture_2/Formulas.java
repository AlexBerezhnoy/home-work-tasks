package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/16/19
 */
public class Formulas {

    @Step
    public double calculate9Formula(double x) {
        double result = 1.1 * Math.pow(Math.E, -1*x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - 3.0/8.0;
//        TODO implement formula 9
        return result;
    }

    @Step
    public double calculate10Formula(double x) {
        double result = (1.0/3.0) * Math.sqrt(Math.abs(Math.sin(x))) * Math.pow(Math.pow(Math.E, 0.12 * x), 1.0/3.0);

        return result;
    }

    @Step
    public double calculate11Formula(double x) {
        double result = 2 * Math.PI * x - Math.abs(Math.sin(Math.sqrt(10.5 * x)))/(Math.pow(x * x,1.0/3.0) + 1.0/7.0);
        return result;
    }

    @Step
    public double calculate12Formula(double x) {
        double result = Math.log(Math.sqrt(Math.abs(2 - x)) + 1.2)/(2 + Math.pow(Math.E,-1 * x)) + Math.pow(2.0/x, 1.0/3.0);
        return result;
    }

    @Step
    public double calculate13Formula(double x) {
        double result = Math.pow(Math.exp(-2 + x),1.0/5.0)/Math.sqrt(Math.pow(x, 2) + Math.pow(x, 4) + Math.log(Math.abs(x - 3.14)));

        return result;
    }
}
