package com.hillel.lecture_12;

public class WeightFactory {

    public double convert(double value, WeightEnum converter) throws ConverterCalculationException, ConvertorExceprion {
        if (value < 0) {
            throw new ConvertorExceprion("Value < 0!! ");
        } else if  (converter != WeightEnum.POUNDSTOKILOGRAMS && converter !=  WeightEnum.KILOGRAMSTOPOUND){
            throw new ConverterCalculationException("Type set incorrectly ");
        } else {switch (converter) {
            case KILOGRAMSTOPOUND: return value * 2.20462;
            case POUNDSTOKILOGRAMS: return value / 2.2046;
            default: return 0;
        }
        }
    }
}
