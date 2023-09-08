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
      System.out.println("Insufficient money paid!!");
      return false;
    } else {
      return true;
    }
  }

}