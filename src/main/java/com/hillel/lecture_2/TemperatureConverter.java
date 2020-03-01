package com.hillel.lecture_2;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/17/19
 */
public class TemperatureConverter {

    @Step
    public double celsiusToFahrenheit(double celsius) {
//       TODO implements result Convert Celsius to Fahrenheit
        double result = (celsius * 9.0/5.0) + 32.0;

        return result;
    }

    @Step
    public double fahrenheitToCelsius(double fahrenheit) {
//        TODO implements result convert Fahrenheit to Celsius
        double result = (fahrenheit - 32.0) * 5.0/9.0;
        return result;
    }

    @Step
    public double celsiusToKelvin(double celsius) {
//        TODO implements result convert Celsius to Kelvin
        double result =  celsius + 273.16;
        return result;
    }
}
