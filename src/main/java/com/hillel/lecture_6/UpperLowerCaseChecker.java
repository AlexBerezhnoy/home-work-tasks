package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class UpperLowerCaseChecker {


    @Step
    public String toUpperCase(String word) {

        String result = "";
        result = word.toUpperCase();
        return result;
    }

    @Step
    public String toLowerCase(String word) {

        String result = "";
        result = word.toLowerCase();
        return result;
    }

    @Step
    public String eachSentenceToUpperCase(String sentence) {
        char[] sentenceChar;
        String result = "";
        String[] tempStringArray = sentence.split(".");
        for (int i = 0; i <tempStringArray.length ; i++) {
            sentenceChar = tempStringArray[i].toCharArray();
            sentenceChar[0] = Character.toUpperCase(sentenceChar[0]);
            result = result + new String(sentenceChar);
        }

        return result;
    }

    @Step
    public String eachLetterToUpperCase(String sentence) {
        char[] sentenceChar;
        String result = "";
        String[] tempStringArray = sentence.split(" ");
        for (int i = 0; i < tempStringArray.length ; i++) {
            sentenceChar = tempStringArray[i].toCharArray();
            sentenceChar[0] = Character.toUpperCase(sentenceChar[0]);
            result = result + new String(sentenceChar);
            if (i != tempStringArray.length-1) result = result + " ";
        }

        return result;
    }
}
