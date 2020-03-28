package c.h.lecture_8;

public class App {
    public static void main(String[] args) {
        double expectedSumResult = 0.95;
        double expectedSubResult = 0.55;
        double expectedMultiResult = 2.25;
        double expectedDivResult = 0.25;
        double term = 0.2;
        double subtrahend = 0.2;
        double factor = 3;
        double divider = 3;

        FractionNumber fractionNumber = new FractionNumber(3,4);
        System.out.println("Fraction Number object is  "+fractionNumber.toString() + '\n');
        double actualResult = fractionNumber.addition(term);
        validationResult(expectedSumResult,actualResult);
        actualResult = fractionNumber.subtraction(subtrahend);
        validationResult(expectedSubResult,actualResult);
        actualResult = fractionNumber.multiplication(factor);
        validationResult(expectedMultiResult,actualResult);
        actualResult = fractionNumber.division(divider);
        validationResult(expectedDivResult,actualResult);
    }


    public static void validationResult (double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("The result is correct" + '\n');
        } else {
            System.out.println("Actual result :" + actualResult);
            System.out.println("Expected result :" + expectedResult);
            System.out.println("The result isn't correct!!!" + '\n');
        }
    }
}
