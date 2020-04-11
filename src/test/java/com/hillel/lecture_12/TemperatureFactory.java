package com.hillel.lecture_12;

public class TemperatureFactory {
    public static final double COEFFICIEN_CELSIUM_TO_FAHRENHEIT = 32.0;
    public static final double COEFFICIEN_CELSIUM_TO_KELVIN = 273.16;

    public double convert(double value, TemperatureEnum converter) throws ConvertorExceprion, ConverterCalculationException {
        if (value < 0) {
            throw new ConvertorExceprion("Value < 0!! ");
        } else if (converter != TemperatureEnum.CELSIUSTOKELVIN&&
                converter !=  TemperatureEnum.FAHRENHEITTOCELSIUS&&
                converter !=  TemperatureEnum.CELSIUSTOFAHRENHEIT)
        {
            throw new ConverterCalculationException("Type set incorrectly ");
        } else {switch (converter) {
            case CELSIUSTOFAHRENHEIT: return (value * 9.0/5.0) + COEFFICIEN_CELSIUM_TO_FAHRENHEIT;
            case FAHRENHEITTOCELSIUS: return (value - COEFFICIEN_CELSIUM_TO_FAHRENHEIT) * 5.0/9.0;
            case CELSIUSTOKELVIN: return value + COEFFICIEN_CELSIUM_TO_KELVIN;
            default: return 0;
        }
        }
    }
}
