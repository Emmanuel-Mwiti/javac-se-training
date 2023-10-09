package com.systechafrica.part4.funtionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayEvenNumbers {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
    Predicate<Integer> isEven = (x) -> x % 2 == 0;
    List<Integer> evenAndSquared = numbers.stream()
        .filter(isEven)
        .map(x -> x * x)
        .collect(Collectors.toList());
    System.out.println(evenAndSquared);
  }

  public static List<Integer> evenNumbers(List<Integer> numbers, Predicate<Integer> condition) {
    List<Integer> result = new ArrayList<>();
    for (Integer integer : numbers) {
      if (condition.test(integer)) {
        integer *= integer;
        result.add(integer);
      }

    }
    return result;
  }
}
