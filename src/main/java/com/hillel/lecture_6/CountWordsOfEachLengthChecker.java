package com.hillel.lecture_6;

import io.qameta.allure.Step;

/**
 * Created by alpa on 11/2/19
 */
public class CountWordsOfEachLengthChecker {

    @Step
    public int countNumberOfWorldWithLength(String sentence, int wordLength) {


        int result = 0;
        String[] sentenceArray = sentence.split(" ");
        for (int i = 0; i < sentenceArray.length; i++) {
            if ((sentenceArray[i].length() == wordLength) || (sentenceArray[i].endsWith(".") &&(sentenceArray[i].length()-1 == wordLength)))
                result++;
            }
        return result;
    }


}
