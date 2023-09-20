package com.systechafrica.someExercises.simpleloosecouple.payment;

public class PaymentMS {
  public void processPayment(PaymentMethod paymentMethod) {
    paymentMethod.processPayment();
  }

  public static void main(String[] args) {
    PaymentMethod creditPayment = new CreditPayment();
    PaymentMS app = new PaymentMS();
    app.processPayment(creditPayment);
  }
}
