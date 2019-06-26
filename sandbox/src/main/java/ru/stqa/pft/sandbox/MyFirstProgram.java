package ru.stqa.pft.sandbox;

import static java.lang.Math.*;

public class MyFirstProgram {

   public static void main (String[] args) {

       Point p = new Point();

       double a = 2;
       p.x1 = 6;
       p.y1 = 8;
       p.x2 = 6;
       p.y2 = 3;
       double i = Math.sqrt(Math.pow((p.x1 - p.x2), a) + Math.pow((p.y1 - p.y2), a));

          System.out.println("distance между двумя точками на двумерной плоскости" + i);
   }
    public static double distance(Point p){

        return  (p.x1-p.y1)-(p.x2-p.y2);
       }

}


