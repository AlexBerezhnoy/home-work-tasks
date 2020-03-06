package com.hillel.lecture_3;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/22/19
 */
public class DiscountCountChecker {

    @Step
    public double checkDiscountCount(double price) {

//        TODO implements result
        double result = 0.0;
        if (price >= 1000) {
            result = price - price * 0.15;
            System.out.println("Скидка составляет "+result);
        } else {
            System.out.println("Скидка не предоставляется");
        }

        return result;
    }
}
