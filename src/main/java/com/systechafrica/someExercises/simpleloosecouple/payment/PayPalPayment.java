package com.systechafrica.someExercises.simpleloosecouple.payment;

public class PayPalPayment implements PaymentMethod {

  @Override
  public void processPayment() {
    System.out.println("PayPal payment...");

  }

}
