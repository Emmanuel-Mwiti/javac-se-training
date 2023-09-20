package com.systechafrica.part2.interfaces;

public class Square implements CalculateArea, CalculatePerimter {

  @Override
  public double calculateArea(double x, double y) {
    System.out.println(MY_NAME);
    return x * y;
  }

  @Override
  public double calculatePerimeter(double x, double y) {
    return 2 * (x + y);
  }

}
