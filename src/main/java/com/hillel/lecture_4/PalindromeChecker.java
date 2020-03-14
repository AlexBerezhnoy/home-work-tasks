package com.hillel.lecture_4;

import io.qameta.allure.Step;

/**
 * Created by alpa on 10/25/19
 */
public class PalindromeChecker {

    @Step
    public boolean isPalindrome(String value) {

        boolean result = false;
        for (int i = 0; i < value.length()/2; i++) {
           if (value.charAt(i) == value.charAt(value.length()-i-1))  result = true;
           else {result = false; break;}
        }
        return result;
    }

}
