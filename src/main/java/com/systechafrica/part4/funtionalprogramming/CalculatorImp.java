package com.systechafrica.part4.funtionalprogramming;

public class CalculatorImp {
  public static void main(String[] args) {
    Calculator calculator = (a, b,numbers) -> a + b;
    System.out.println(calculator.calculator(4, 5));
  }
}
