package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/26/19
 */
public class ReverseStringChecker {

    @Step
    public String getReversString(String value) {


        String result = "";
        for (int i = 0; i < value.length(); i++) {
            result = result + value.charAt(value.length()-i-1);
        }

        return result;
    }

}
