package com.hillel.lecture_12;


import com.hillel.lecture_11.Converters.DistanceConverter;
import com.hillel.lecture_11.Converters.SpeedConverter;
import com.hillel.lecture_11.Converters.WeightConverter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Created by alpa on 10/17/19
 */
public class ConverterTestTask {

    private TemperatureFactory temperatureFactory = new TemperatureFactory();
    private DistanceFactory distanceFactory = new DistanceFactory();
    private WeightFactory weightFactory = new WeightFactory();
    private SpeedFactory speedFactory = new SpeedFactory();

    @Test
    public void celsiusToFahrenheitTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 50.0;
        assertEquals(temperatureFactory.convert(10, TemperatureEnum.CELSIUSTOFAHRENHEIT), expectedResult);
    }

    @Test
    public void fahrenheitToCelsiusTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 10.0;
        assertEquals(temperatureFactory.convert(50, TemperatureEnum.FAHRENHEITTOCELSIUS), expectedResult);
    }

    @Test
    public void celsiusToKelvinTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 283.16;
        assertEquals(temperatureFactory.convert(10, TemperatureEnum.CELSIUSTOKELVIN), expectedResult);
    }

    @Test
    public void metersToInchesTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 196.85;
        assertEquals(distanceFactory.convert(5, DistanceEnum.METERSTOINCHES), expectedResult);
    }

    @Test
    public void inchesToMetersTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 1.27000254000508;
        assertEquals(distanceFactory.convert(50, DistanceEnum.INCHESTOMETERS), expectedResult);
    }

    @Test
    public void milesToKilometresTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 16.09;
        assertEquals(distanceFactory.convert(10, DistanceEnum.MILESTOKILOMETERS), expectedResult);
    }

    @Test
    public void kilometresToMilesTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 6.215040397762586;
        assertEquals(distanceFactory.convert(10, DistanceEnum.KILOMETERSTOMILES), expectedResult);
    }

    @Test
    public void kilogramsToPoundsTest() throws ConverterCalculationException, ConvertorExceprion {
        double expectedResult = 22.0462;
        assertEquals(weightFactory.convert(10, WeightEnum.KILOGRAMSTOPOUND), expectedResult);
    }

    @Test
    public void poundsToKilogramsTest() throws ConverterCalculationException, ConvertorExceprion {
        double expectedResult = 11.339925610087997;
        assertEquals(weightFactory.convert(25, WeightEnum.POUNDSTOKILOGRAMS), expectedResult);
    }

    @Test
    public void speedKmToMiTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 6.2139999999999995;
        assertEquals(speedFactory.convert(10, SpeedEnum.KMTOMI), expectedResult);
    }

    @Test
    public void speedMiToKmTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 16.0926939169617;
        assertEquals(speedFactory.convert(10, SpeedEnum.MITOKM), expectedResult);
    }

    @Test
    public void speedMinusTest() throws ConvertorExceprion, ConverterCalculationException {
        double expectedResult = 0;
        assertEquals(speedFactory.convert(-1, SpeedEnum.MITOKM), expectedResult);
    }
}