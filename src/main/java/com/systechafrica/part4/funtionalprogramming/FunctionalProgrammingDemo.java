package com.systechafrica.part4.funtionalprogramming;

import java.util.List;
import java.util.stream.Stream;

public class FunctionalProgrammingDemo {
  public static void main(String[] args) {
    FunctionalProgrammingDemo app = new FunctionalProgrammingDemo();
    // app.functions();
    // app.lambdaFunction();
    // app.normalLambdaExpression();
    app.methodChaining();

  }

  private void methodChaining() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
    numbers.stream()
        .filter(number -> number % 2 == 0)
        .map(number -> number * number)
        .forEach(System.out::println);
  }

  private void normalLambdaExpression() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
    Stream<Integer> evenNumbers = numbers.stream().filter((number) -> number % 2 == 0);
    Stream<Integer> squaredNumbers = evenNumbers.map((number) -> number * number);
    squaredNumbers.forEach(System.out::println);
  }

  private void lambdaFunction() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
    // numbers.forEach(number->System.out.println(number));
    numbers.forEach(System.out::println);
  }

  private void functions() {
    Calculator calculator = (a, b, numbers) -> {
      int sum = a + b;
      for (int number : numbers) {
        sum += number;
      }
      return sum;
    };
    System.out.println(calculator.calculator(8, 8, 8));
  }

}
