package com.systechafrica.part2.examplestaticclassusage.utilities;

public class MathUtils {
  // Static nested class for constants
  public static class Constants {
    public static final double PI = 3.14159265359;

    public void printSomethingInsideConstantsNestedClass() {
      System.out.println("Inside the MathUtilsClass and nested Constants class");
    }
  }

  // Static utility methods
  public static int add(int a, int b) {
    return a + b;
  }

  public void printSomething() {
    System.out.println("Inside the MathUtilsClass");
  }

}
