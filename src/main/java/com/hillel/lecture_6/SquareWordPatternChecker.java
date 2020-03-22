package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class SquareWordPatternChecker {


    @Step
    public String applySquareWordPattern(String word) {
        String result = "";
        char temp;
        char[] wordCharArray = word.toCharArray();

        for (int i = 0; i < word.length() ; i++) {
            if (i!=0) {
                temp = wordCharArray[0];
                for (int j = 0; j < wordCharArray.length - 1; j++) {
                    wordCharArray[j] = wordCharArray[j + 1];
                }
                wordCharArray[wordCharArray.length - 1] = temp;
            }
            result = result + new String(wordCharArray);
           if (i!=word.length()-1) result = result + ", ";
        }
        return result;
    }


}
