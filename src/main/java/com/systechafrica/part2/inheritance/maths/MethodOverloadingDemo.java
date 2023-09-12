package com.systechafrica.part2.inheritance.maths;

public class MethodOverloadingDemo {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    calculator.sum(1.4, 0, 15);
    calculator.sum(50, 30, 80);
    // !Here the method can take different data types, return type, access modifier
    // ! and sequence of arguments
  }
}
