package com.systechafrica.someExercises.simpleloosecouple.payment;

public class CreditPayment implements PaymentMethod {

  @Override
  public void processPayment() {
    System.out.println("Credit Card payment...");

  }

}
