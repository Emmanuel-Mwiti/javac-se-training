package com.systechafrica.part2.examplestaticclassusage.customeexceptions;

public class CustomException extends Exception {
  // Default constructor
  public CustomException() {
    super();
  }

  // Constructor with a custom error message
  public CustomException(String message) {
    super(message);
  }

  // Static nested exception classes
  public static class SubException1 extends CustomException {
    // Constructor with a custom error message
    public SubException1(String message) {
      super(message);
    }
  }

  public static class SubException2 extends CustomException {
    // Constructor with a custom error message
    public SubException2(String message) {
      super(message);
    }
  }
}
