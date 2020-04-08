package com.hillel.lecture_11.Converters;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class DistanceConverter implements IConverter {
    public static final double COEFFICIEN_METERS_INCHES = 39.37;
    public static final double COEFFICIEN_MILES_KILOMETERS = 1.609;

    @Override
    public double convert(String converter, double value) {
        switch (converter) {
            case "metersToInches": return value * COEFFICIEN_METERS_INCHES;
            case "inchesToMeters": return value / COEFFICIEN_METERS_INCHES;
            case "milesToKilometres": return value * COEFFICIEN_MILES_KILOMETERS;
            case "kilometresToMiles": return value / COEFFICIEN_MILES_KILOMETERS;
            default: return 0;
        }
    }
}
