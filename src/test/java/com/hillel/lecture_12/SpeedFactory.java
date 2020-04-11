package com.hillel.lecture_12;

public class SpeedFactory {
    public static final double COEFFICIEN_KILOMETERS_MILES = 0.6214;

    public double convert(double value, SpeedEnum converter) throws ConvertorExceprion, ConverterCalculationException {
        if (value < 0) {
            throw new ConvertorExceprion("Value < 0!! ");
        } else if  (converter != SpeedEnum.KMTOMI && converter != SpeedEnum.MITOKM){
            throw new ConverterCalculationException("Type set incorrectly ");
        } else {
            switch (converter) {
                case KMTOMI:
                    return value * COEFFICIEN_KILOMETERS_MILES;
                case MITOKM:
                    return value / COEFFICIEN_KILOMETERS_MILES;
                default:
                    return 0;
            }
        }
    }
}
