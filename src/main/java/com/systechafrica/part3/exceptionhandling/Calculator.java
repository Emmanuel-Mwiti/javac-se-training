package com.systechafrica.part3.exceptionhandling;

public class Calculator {
  public double divide(int a, int b) {
    double result = 0.0;
    try {
      result = a / b;
      return result;

    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
      return 0;

    }

  }

  public int sum(int a, int b) throws MyCustomException {
    throw new MyCustomException("Not implemented");
  }
}
