package com.systechafrica.part2.interfaces;

public interface CalculatePerimter {
  double calculatePerimeter(double x, double y);

  // ! Following java 1.8+ you can have default implementation

  default double sum(int a, int b) {
    return 0;
  }
}
