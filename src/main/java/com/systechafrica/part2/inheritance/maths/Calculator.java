package com.systechafrica.part2.inheritance.maths;

public class Calculator {
  public int sum(int a, int b) {
    return a + b;

  }

  public int sum(int a, int b, int c) {
    return a + b + c;

  }

  public double sum(double a, int b, int c) {
    return a + b + c;

  }

  public int sum(long a, long b) {
    return (int) (a + b);

  }

  public long sum(long b, long a, long c) {
    return a + b + c;
  }
}
