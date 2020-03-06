package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class SquareAndCircleChecker {

    @Step
    public String checkCircleInSquare(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        result = (Math.sqrt(squareArea)>= Math.sqrt(4*circleArea/Math.PI)) ? "The circle is in the square" : "The circle is not in the square";

        return result;
    }

    @Step
    public String checkSquareInCircle(double circleArea, double squareArea) {

//        TODO implements result
        String result = "";
        result = (Math.sqrt(2*squareArea) <= Math.sqrt(4*circleArea/Math.PI)) ? "The square is in the circle" : "The square is not in the circle";
        return result;
    }

}
