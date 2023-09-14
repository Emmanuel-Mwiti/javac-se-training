package com.systechafrica.part2.examplestaticclassusage.builderclasses;

// ComplexObject class with a static nested Builder class
public class ComplexObject {
  private int property1;
  private String property2;
  private boolean property3;

  // Private constructor to prevent direct instantiation
  private ComplexObject() {
    // Initialize default values or complex setup logic here
  }

  // Getter methods for properties (optional)

  public int getProperty1() {
    return property1;
  }

  public String getProperty2() {
    return property2;
  }

  public boolean isProperty3() {
    return property3;
  }

  // Builder class for constructing ComplexObject instances
  public static class Builder {
    private ComplexObject instance = new ComplexObject();

    // Static method to create a new Builder instance
    public static Builder newBuilder() {
      return new Builder();
    }

    // Method to set property1 and return the Builder for method chaining
    public Builder setProperty1(int value) {
      instance.property1 = value;
      return this;
    }

    // Method to set property2 and return the Builder for method chaining
    public Builder setProperty2(String value) {
      instance.property2 = value;
      return this;
    }

    // Method to set property3 and return the Builder for method chaining
    public Builder setProperty3(boolean value) {
      instance.property3 = value;
      return this;
    }

    // Build method to create the final ComplexObject instance
    public ComplexObject build() {
      // You can add validation logic here if needed
      return instance;
    }
  }
}
