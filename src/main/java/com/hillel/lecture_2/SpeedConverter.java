package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter {
    public static final double COEFFICIEN_KILOMETERS_MILES = 0.6214;
    @Step
    public double speedKmToMi(double speedKm) {
//        TODO implements result
        double result = speedKm * COEFFICIEN_KILOMETERS_MILES;
        return result;
    }

    @Step
    public double speedMiToKm(double speedMi) {
//        TODO implements result
        double result = speedMi / COEFFICIEN_KILOMETERS_MILES;
        return result;
    }

}
