package com.hillel.lecture_11;


import com.hillel.lecture_11.Converters.DistanceConverter;
import com.hillel.lecture_11.Converters.SpeedConverter;
import com.hillel.lecture_11.Converters.TemperatureConverter;
import com.hillel.lecture_11.Converters.WeightConverter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterTestTask {

    private TemperatureConverter temperatureConverter = new TemperatureConverter();
    private DistanceConverter distanceConverter = new DistanceConverter();
    private WeightConverter weightConverter = new WeightConverter();
    private SpeedConverter speedConverter = new SpeedConverter();

    @Test
    public void celsiusToFahrenheitTest() {
        double expectedResult = 50.0;
        assertEquals(temperatureConverter.convert("celsiusToFahrenheit",10), expectedResult);
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        double expectedResult = 10.0;
        assertEquals(temperatureConverter.convert("fahrenheitToCelsius",50), expectedResult);
    }

    @Test
    public void celsiusToKelvinTest() {
        double expectedResult = 283.16;
        assertEquals(temperatureConverter.convert("celsiusToKelvin",10), expectedResult);
    }

    @Test
    public void metersToInchesTest() {
        double expectedResult = 196.85;
        assertEquals(distanceConverter.convert("metersToInches", 5), expectedResult);
    }

    @Test
    public void inchesToMetersTest() {
        double expectedResult = 1.27000254000508;
        assertEquals(distanceConverter.convert("inchesToMeters", 50), expectedResult);
    }

    @Test
    public void milesToKilometresTest() {
        double expectedResult = 16.09;
        assertEquals(distanceConverter.convert("milesToKilometres", 10), expectedResult);
    }

    @Test
    public void kilometresToMilesTest() {
        double expectedResult = 6.215040397762586;
        assertEquals(distanceConverter.convert("kilometresToMiles",10), expectedResult);
    }

    @Test
    public void kilogramsToPoundsTest() {
        double expectedResult = 22.0462;
        assertEquals(weightConverter.convert("kilogramsToPounds",10), expectedResult);
    }

    @Test
    public void poundsToKilogramsTest() {
        double expectedResult = 11.339925610087997;
        assertEquals(weightConverter.convert("poundsToKilograms",25), expectedResult);
    }

    @Test
    public void speedKmToMiTest() {
        double expectedResult = 6.2139999999999995;
        assertEquals(speedConverter.convert("speedKmToMi",10), expectedResult);
    }

    @Test
    public void speedMiToKmTest() {
        double expectedResult = 16.0926939169617;
        assertEquals(speedConverter.convert("speedMiToKm",10), expectedResult);
    }
}