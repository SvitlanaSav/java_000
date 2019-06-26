package ru.stqa.pft.sandbox;

import static java.lang.Math.*;

public class MyFirstProgram {

   public static void main (String[] args) {

       Point p = new Point(6,8,6,3);

       System.out.println("расстояние между двумя точками на двумерной плоскости" + p.distance());
   }


}


