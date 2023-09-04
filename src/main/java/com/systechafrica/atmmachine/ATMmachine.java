package com.systechafrica.atmmachine;

import java.util.Scanner;

public class ATMmachine {

  final String DEFAULT_PASSWORD = "Admin123";
  final double INITIAL_AMOUNT = 1000.00;
  double accountBalance = INITIAL_AMOUNT;
  final double WITHDRAWAL_CHARGES = 0.02;
  final int LOGIN_TRIALS = 3;

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    ATMmachine app = new ATMmachine();
    boolean loggedIn = app.login();
    if (loggedIn) {
      System.out.println("Successiful login");
      // display menu
      app.displayMenu();
      boolean keepShowing = true;
      while (keepShowing) {
        System.out.print("Please choose an option: ");
        int optionChoosen = app.scanner.nextInt();
        switch (optionChoosen) {
          case 1:
            app.checkBalance();
          case 2:
            app.deposit();

        }
      }

    } else {
      System.out.println("Maximum attempts reached!");
    }

  }

  public boolean login() {
    int loginEntries = 0;
    boolean loggedIn = false;

    while (loginEntries < 3) {
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();

      if (password.equals(DEFAULT_PASSWORD)) {

        loggedIn = true;
        break;
      } else {
        System.out.println("Wrong passoword!");
        loginEntries++;
      }
    }
    return loggedIn;
  }

  public void displayMenu() {
    System.out.println("******************************");
    System.out.println("********ATM SIMULATOR*********");
    System.out.println("******************************");
    System.out.println("********ATM SERVICES**********");
    System.out.println("______________________________");
    System.out.println("1. Check Balance");
    System.out.println("2. Deposit");
    System.out.println("3. Withdraw");
    System.out.println("4. Transfer Cash");
    System.out.println("5. Quit");

  }

  public void checkBalance() {
    System.out.println("Your account balance is: " + accountBalance);
  }

  public void deposit() {

  }

  public void withdraw() {
    // ?Calculate withdrawal charges
    // check withdrawal charges againist the amount in bank
    //
    // ?withdraw if withdrawal the sum of withdrawal charges and amount to withdraw
    // is less than amount in account
    // ?Return insufficient funds

  }

  public void transferMoney() {

  }

}
