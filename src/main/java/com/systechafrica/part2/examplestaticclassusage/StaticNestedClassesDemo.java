package com.systechafrica.part2.examplestaticclassusage;

import com.systechafrica.part2.examplestaticclassusage.builderclasses.ComplexObject;
import com.systechafrica.part2.examplestaticclassusage.customeexceptions.CustomException;
import com.systechafrica.part2.examplestaticclassusage.enums.Configuration.LogLevel;
import com.systechafrica.part2.examplestaticclassusage.utilities.MathUtils;

public class StaticNestedClassesDemo {
  public static void main(String[] args) {
    StaticNestedClassesDemo app = new StaticNestedClassesDemo();
    // app.mathsUtils();
    // app.buidlerClasses();
    // app.enumDemo();
    app.customeexceptions();

  }

  public void mathsUtils() {
    MathUtils instanceOfMathUtils = new MathUtils();
    MathUtils.Constants instanceOfConstants = new MathUtils.Constants();

    // ? Utils call. Using nested classes
    System.out.println(MathUtils.Constants.PI);
    System.out.println(MathUtils.add(10, 2));
    instanceOfMathUtils.printSomething();
    instanceOfConstants.printSomethingInsideConstantsNestedClass();
  }

  public void buidlerClasses() {

    // Create a ComplexObject instance using the Builder

    ComplexObject complexObject = ComplexObject.Builder
        .newBuilder() // Start building a new instance
        .setProperty1(42) // Set property1
        .setProperty2("Hello") // Set property2
        .setProperty3(true) // Set property3
        .build(); // Build the final instance

    // Access the properties of the constructed object

    int property1Value = complexObject.getProperty1();
    String property2Value = complexObject.getProperty2();
    boolean property3Value = complexObject.isProperty3();

    // Print the values

    System.out.println("Property1: " + property1Value);
    System.out.println("Property2: " + property2Value);
    System.out.println("Property3: " + property3Value);
  }

  public void enumDemo() {

    // Access and use the LogLevel enum
    LogLevel logLevel = LogLevel.INFO; // Set the log level to DEBUG
    // You can use a switch statement to handle different log levels
    switch (logLevel) {
      case DEBUG:
        System.out.println("Debugging information");
        break;
      case INFO:
        System.out.println("Information message");
        break;
      case WARNING:
        System.out.println("Warning message");
        break;
      case ERROR:
        System.out.println("Error message");
        break;
      default:
        System.out.println("Unknown log level");
        break;
    }
  }

  public void customeexceptions() {
    try {
      // Simulate an error condition
      int result = divide(10, 0);
      System.out.println("Result: " + result);
    } catch (CustomException.SubException1 ex1) {
      System.out.println("Caught SubException1: " + ex1.getMessage());
    } catch (CustomException.SubException2 ex2) {
      System.out.println("Caught SubException2: " + ex2.getMessage());
    } catch (CustomException ex) {
      System.out.println("Caught CustomException: " + ex.getMessage());
    }
  }

  public static int divide(int dividend, int divisor) throws CustomException {
    try {
      if (divisor == 0) {
        throw new CustomException.SubException1("Division by zero");
      }
      return dividend / divisor;
    } catch (ArithmeticException e) {
      throw new CustomException.SubException2("Arithmetic Exception: " + e.getMessage());
    }
  }

}
