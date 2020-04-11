package com.hillel.lecture_12;

public class DistanceFactory {

    public static final double COEFFICIEN_METERS_INCHES = 39.37;
    public static final double COEFFICIEN_MILES_KILOMETERS = 1.609;

    public double convert(double value, DistanceEnum converter) throws ConvertorExceprion, ConverterCalculationException {
        if (value < 0) {
            throw new ConvertorExceprion("Value < 0!! ");
        } else if  (converter != DistanceEnum.KILOMETERSTOMILES&&
                converter !=  DistanceEnum.MILESTOKILOMETERS&&
                converter !=  DistanceEnum.METERSTOINCHES&&
                converter !=  DistanceEnum.INCHESTOMETERS)
        {
            throw new ConverterCalculationException("Type set incorrectly ");
        } else {
        switch (converter) {
            case METERSTOINCHES: return value * COEFFICIEN_METERS_INCHES;
            case INCHESTOMETERS: return value / COEFFICIEN_METERS_INCHES;
            case MILESTOKILOMETERS: return value * COEFFICIEN_MILES_KILOMETERS;
            case KILOMETERSTOMILES: return value / COEFFICIEN_MILES_KILOMETERS;
            default: return 0;
        }
        }
    }
}
