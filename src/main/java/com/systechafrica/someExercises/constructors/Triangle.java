package com.systechafrica.someExercises.constructors;

public class Triangle {
  static double area;

  public static void main(String[] args) {
    double p, b, h;
    boolean x = true;
    if (x) {
      b = 3;
      h = 4;
      p = 0.5;
    }
    // area = p * b * h; //!This line does not compile
    System.out.println("area is " + area);
  }

}
