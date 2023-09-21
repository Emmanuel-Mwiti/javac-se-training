package com.systechafrica.part3.exceptionhandling;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {

    ExceptionHandlingDemo app = new ExceptionHandlingDemo();
    Calculator calculator = new Calculator();
    double divide = calculator.divide(6, 0);
    System.out.println(divide);
    try {
      calculator.sum(2, 2);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void workingWithException() {

  }
}
