package com.hillel.lecture_11.Converters;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class SpeedConverter implements IConverter{
    public static final double COEFFICIEN_KILOMETERS_MILES = 0.6214;

    @Override
    public double convert(String converter, double value) {
        switch (converter) {
            case "speedKmToMi": return value * COEFFICIEN_KILOMETERS_MILES;
            case "speedMiToKm": return value / COEFFICIEN_KILOMETERS_MILES;
             default: return 0;
        }
    }
}
