package com.hillel.lecture_4;


import java.text.DecimalFormat;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        int x = 0;

        while (x <= 360) {
            if (x == 360) printResult(360 - x);
            else  printResult (x);
            x = x + 10;
        }
    }

    public static void printResult (int x) {
        DecimalFormat df = new DecimalFormat("###.######");
        System.out.println("Sin(" + x + ") = " + df.format(Math.sin(x*Math.PI/180)));
    };

}
