package com.systechafrica.atmmachine;

import java.util.Scanner;

public class ATMmachine {

  final String DEFAULT_PASSWORD = "Admin123";
  final double INITIAL_AMOUNT = 1000.00;
  double accountBalance = INITIAL_AMOUNT;
  final double WITHDRAWAL_CHARGES = 0.02;
  final int LOGIN_TRIALS = 3;
  final String TRANSFER_TO_NUMBER_FORMAT = "^[0-9]{8,16}$";

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    ATMmachine app = new ATMmachine();
    boolean loggedIn = app.login();
    if (loggedIn) {
      System.out.println("Successiful login");
      boolean keepShowing = true;
      while (keepShowing) {
        // display menu
        app.displayMenu();

        // !check if the number entered by the user is an integer
        try {
          System.out.print("Please choose an option: ");
          int optionChoosen = app.scanner.nextInt();
          if (optionChoosen <= 5) {
            switch (optionChoosen) {
              case 1:
                app.checkBalance();
                break;
              case 2:
                app.deposit();
                break;
              case 3:
                app.withdraw();
                break;
              case 4:
                app.transferMoney();
                break;
              case 5:
                keepShowing = false;
                break;
              default:
                System.out.println("Please select an option!");
                break;

            }
          } else {
            System.out.println("Choose an option between 1 and 5!");
          }

        } catch (Exception e) {
          app.scanner.nextLine(); // ! this is to clear the \n character that is retained when using scanner with
                                  // nextInt()
          System.out.println("Invalid options! Please enter a valid option! Only integers are accepted!");
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

    System.out.print("Enter the amount you want to deposit: ");
    double amountToDeposit = scanner.nextDouble();
    if (amountToDeposit < 0) {
      System.out.println("Please enter a valid amount!: ");
    } else {
      accountBalance += amountToDeposit;
      System.out.println(
          "You have successifully deposited sh. " + amountToDeposit + ". New balance is sh. " + accountBalance);
    }

  }

  public void withdraw() {
    System.out.print("Enter the amount you want to withdraw: ");
    double amountToWithdraw = scanner.nextDouble();
    // ?Calculate withdrawal charges
    double totalWithdrawalCharges = amountToWithdraw * WITHDRAWAL_CHARGES;
    // check withdrawal charges againist the amount in bank
    if (accountBalance > (amountToWithdraw + totalWithdrawalCharges)) {
      accountBalance -= (amountToWithdraw + totalWithdrawalCharges);
      System.out.println("You have successifully withdrawn sh. " + amountToWithdraw + ". Withdrawal charges is sh. "
          + totalWithdrawalCharges + ". New balance is sh. " + accountBalance);
    } else {
      System.out.println("Insufficient funds! Your balance is sh. : " + accountBalance);
    }
    // ?withdraw if withdrawal the sum of withdrawal charges and amount to withdraw
    // is less than amount in account
    // ?Return insufficient funds

  }

  public void transferMoney() {

    System.out.print("Enter number to transfer to: ");
    String numberToTransferTo = scanner.nextLine();
    // ?number to transfer to, should be a number Matches any digit (0-9) and should
    // be between 8 and 16 digits in length

    // if (numberToTransferTo.equals(TRANSFER_TO_NUMBER_FORMAT)) {
    // ? Ask amount of money to transfer
    System.out.print("Enter the amount you want to Transfer: ");
    double amountToTransfer = scanner.nextDouble();
    if (amountToTransfer > 0) {
      double totalTransferCharges = amountToTransfer * WITHDRAWAL_CHARGES;
      if (accountBalance > (totalTransferCharges + amountToTransfer)) {
        // ?Calculate the remaining account balance
        accountBalance -= (totalTransferCharges + amountToTransfer);
        System.out.println("You have successifully transferred sh. " + amountToTransfer + "to account number "
            + numberToTransferTo + ". Your new account balance is sh. " + accountBalance);
      } else {
        System.out.println("Insufficient funds! Your account balance is sh. " + accountBalance);
      }
    } else {
      System.out.println("Please enter a valid amount to transfer! ");
    }
    // } else {
    // System.out.println("Invalid number format! ");
    // }

  }

}
