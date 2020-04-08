package com.hillel.lecture_11.Converters;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter implements IConverter{
    public static final double COEFFICIEN_CELSIUM_TO_FAHRENHEIT = 32.0;
    public static final double COEFFICIEN_CELSIUM_TO_KELVIN = 273.16;

    @Override
    public double convert(String converter, double value) {
        switch (converter) {
            case "celsiusToFahrenheit": return (value * 9.0/5.0) + COEFFICIEN_CELSIUM_TO_FAHRENHEIT;
            case "fahrenheitToCelsius": return (value - COEFFICIEN_CELSIUM_TO_FAHRENHEIT) * 5.0/9.0;
            case "celsiusToKelvin": return value + COEFFICIEN_CELSIUM_TO_KELVIN;
            default: return 0;
        }
    }
}
