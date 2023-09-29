package com.systechafrica.utils;

public class ValidateInput {

  public static final boolean validate(String input) {
    if (input != null && input.trim().length() > 0) {
      return true;
    }
    System.out.println("Input should not be empty!!");
    return false;
  }

  public static final boolean validateAmountPaidIsGreaterThanBilled(double amountBilled, double amountPaid) {
    if (amountBilled > amountPaid) {
      System.out.println("Insufficient money paid!! Your total billing is: " + amountBilled);
      return false;
    } else {
      return true;
    }
  }

  public static final boolean isIntegerInRange1To3(int input) {
    try {
      if (input >= 1 && input <= 4) {
        return true;
      } else {
        System.err.println("Input is an integer, but it must be between 1 and 4 for the four options above!.");
      }
    } catch (NumberFormatException e) {
      System.out.println(e + "Input is not a valid integer.");
    }
    return false;
  }

  public static final boolean isIntegerInRange1To7(int input) {
    try {
      if (input >= 1 && input <= 7) {
        return true;
      } else {
        System.err.println("Input is an integer, but it must be between 1 and 7 for the seven options above!.");
      }
    } catch (NumberFormatException e) {
      System.out.println("Input is not a valid integer.");
    }
    return false;
  }

}