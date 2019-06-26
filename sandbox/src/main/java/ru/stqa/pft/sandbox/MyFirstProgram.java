package ru.stqa.pft.sandbox;

import static java.lang.Math.*;

public class MyFirstProgram {

    public static void main (String[] args) {

        double a=2;
        double x1=6;
        double y1=8;
        double x2=6;
        double y2=3;
        double q=x1-x2;
        double w=y1-y2;

        System.out.println("расст. между двумя точками на двумерной плоскости " + Math.sqrt(Math.pow(q,a)+ Math.pow(w,a)));



    }

}


