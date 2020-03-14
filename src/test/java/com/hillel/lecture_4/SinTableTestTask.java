package com.hillel.lecture_4;


import java.text.DecimalFormat;

/**
 * Написать программу, которая печатает табличку значений sin(x), где x это каждые 10 градусов от 0 до 360
 */
public class SinTableTestTask {
    public static void main(String[] args) {
        int x = 0;
        DecimalFormat df = new DecimalFormat("###.######");
        while (x <= 360) {
            if (x == 360)
                System.out.println("Sin(" + x + ") = " + df.format(Math.sin((360-x)*Math.PI/180)));
            else  System.out.println("Sin(" + x + ") = " + df.format(Math.sin(x*Math.PI/180)));
            x = x + 10;
        }
    }
}
