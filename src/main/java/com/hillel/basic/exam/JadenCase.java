package com.hillel.basic.exam;

import java.util.Objects;

/**
 * Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After Earth (2013).
 * Jaden is also known for some of his philosophy that he delivers via Twitter.
 * When writing on Twitter, he is known for almost always capitalizing every word.
 * <p>
 * Your task is to convert strings to how they would be written by Jaden Smith.
 * The strings are actual quotes from Jaden Smith, but they are not capitalized in the same way he originally typed them.
 * <p>
 * Example:
 * <p>
 * Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
 * Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
 * <p>
 * Note that the Java version expects a return value of null for an empty string or null.
 */
public class JadenCase {

    public String toJadenCase(String phrase) {
        String result = null;
        if (Objects.isNull(phrase) || phrase.isEmpty()){}
        else if ( phrase.isEmpty()) {result = "";}
        else {
            result = "";
            char[] sentenceChar;
            String[] tempStringArray = phrase.split(" ");
            for (int i = 0; i < tempStringArray.length ; i++) {
                sentenceChar = tempStringArray[i].toCharArray();
                sentenceChar[0] = Character.toUpperCase(sentenceChar[0]);
                result = result + new String(sentenceChar);
                if (i != tempStringArray.length-1) result = result + " ";
            }
        }
        return result;
    }
}
