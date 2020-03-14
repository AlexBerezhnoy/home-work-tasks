package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class SortingChecker {

    @Step
    public int[] fromMinToMax(int[] values) {

        int[] result = values;
        int tempValue;
        for (int j = 0; j < result.length; j++) {
            for (int i = 1; i < result.length; i++) {
                if (result[i] < result[i-1]) {
                 tempValue = result[i];
                 result[i] = result[i-1];
                 result[i-1] = tempValue;
               }
            }
        }
        return result;
    }

    @Step
    public int[] fromMaxToMin(int[] values) {
        int[] result = values;
        int tempValue;
        for (int j = 0; j < result.length; j++) {
            for (int i = 1; i < result.length; i++) {
                if (result[i] > result[i-1]) {
                    tempValue = result[i-1];
                    result[i-1] = result[i];
                    result[i] = tempValue;
                }
            }
        }
        return result;
    }
}
