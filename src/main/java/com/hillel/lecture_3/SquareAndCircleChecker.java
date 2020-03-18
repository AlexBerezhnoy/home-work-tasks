package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

        String result = "";
        result = (Math.sqrt(squareArea) >= circleDiametr(circleArea)) ? "The circle is in the square" : "The circle is not in the square";

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {
        String result = "";
        result = (Math.sqrt(2 * squareArea) <= circleDiametr(circleArea)) ? "The square is in the circle" : "The square is not in the circle";
        return result;
    }

    public static double circleDiametr (double circleArea){
        double result = Math.sqrt(4*circleArea/Math.PI);
        return result;
    }
}
