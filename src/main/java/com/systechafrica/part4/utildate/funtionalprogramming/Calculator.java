package com.systechafrica.part4.utildate.funtionalprogramming;

@FunctionalInterface
public interface Calculator {
  abstract int calculator(int a, int b);

  default int sum(int c, int d) {
    return c + d;
  }

  static int calculatorArea(int length, int width) {
    return length * width;
  }
}
