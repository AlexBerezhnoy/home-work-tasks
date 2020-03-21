package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class LetterRemovalChecker {

    @Step
    public String removeLetter(String sentence, String letterFoRemove) {
        String result = " ";
        char emptyChar = result.charAt(0);
            char[] sentenceArray = sentence.toCharArray();
            char[] letterArray = letterFoRemove.toCharArray();
        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i] == letterArray[0]) sentenceArray[i] = emptyChar;
        }
        return result;
    }
}
