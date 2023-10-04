package com.systechafrica.part4.utildate.funtionalprogramming;

public class CalculatorImp {
  public static void main(String[] args) {
    Calculator calculator = (a, b) -> a + b;
    System.out.println(calculator.calculator(4, 5));
  }
}
