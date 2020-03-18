package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {
    public static final double COEFFICIEN_CELSIUM_TO_FAHRENHEIT = 32.0;
    public static final double COEFFICIEN_CELSIUM_TO_KELVIN = 273.16;

    @Step
    public double celsiusToFahrenheit(double celsius) {
        double result = (celsius * 9.0/5.0) + COEFFICIEN_CELSIUM_TO_FAHRENHEIT;
        return result;
    }

    @Step
    public double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - COEFFICIEN_CELSIUM_TO_FAHRENHEIT) * 5.0/9.0;
        return result;
    }

    @Step
    public double celsiusToKelvin(double celsius) {
        double result =  celsius + COEFFICIEN_CELSIUM_TO_KELVIN;
        return result;
    }
}
