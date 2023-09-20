package com.systechafrica.part2.interfaces;

public class CalculatorImp implements Calculator {

  @Override
  public int sum(int a, int b) {
    return a + b;
  }

  @Override
  public int sum(int a, int b, int... otherNumbers) {
    int sum = a + b;
    for (int i : otherNumbers) {
      sum += i;
    }
    return sum;
  }

}
