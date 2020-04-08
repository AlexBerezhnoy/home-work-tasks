package com.hillel.lecture_11.Converters;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class WeightConverter implements IConverter{

    @Override
    public double convert(String converter, double value) {
        switch (converter) {
            case "kilogramsToPounds": return value * 2.20462;
            case "poundsToKilograms": return value / 2.2046;
            default: return 0;
        }
    }
}
