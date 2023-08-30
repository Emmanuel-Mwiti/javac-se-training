package com.systechafrica.atmMachine;

import java.util.Scanner;

public class ATM_machine {
  public static void main(String[] args) {
    //?Divide the project into sprints

    //  **HERE IS THE APPROACH STEP BY STEP I APPROACHED THE PROBLEM  **
    //  After Each solution, i commit the changes, therefore even the commit messages can show my approach. Approached the problem dividing it into sprints.

    //  1.  First setting up how the first login, assuming the name is Emmanuel and default password. If this is is true, directed to the login page
    //  2. Checking the number of login attempts to make sure they are not more than three. Here, i introduced a variable called loginTrial, and encopass the test login, and increment the login up to three. Also introduce a while loop to check login trials to be 3 after which we exist
    //  3. Step 3 is now to get a way to display to user login failed after the three attempts, or else and incase even after 2nd attempt is successiful, we get to the welcome page
    //  4. Next sprint now is to work with the users who have successifully logged in
            // i.) Checking Balance- define it default to 1000, balance can have cents hence define instance variable balance to double and initialize it to 1000
            // ii.) Deposits
            // iii.) Withdraw
            // iv.) transfer and print receipt
  // While working here, i realized i should have globally created scanner object, small modifications.
  // The use switch control to define the above ATM menu.
  //  5. Now after all the logistics, the system should not be existing after each option, it should be taking us to the main menu.So, i will encompass the whole ATM menu under true evaluation such that it evaluates true. Also, it should reload the main option, therefore, i will remove it from the place of checking user and password to the first welcome message. Few Modifications also to only print login successiful once.


    final String USER_NAME = "Emmanuel";
    final String USER_PASSOWRD = "Admin123";
    int loginTrial = 0; //initialize login trial to zero to increase it subsequently once login fails
    double accountBalance = 1000;
    Scanner scanner = new Scanner(System.in);

    

    while (loginTrial < 3) {
      System.out.println("Welcome to ATM Machine. Please enter the name and password to login.");
      

      System.out.print("Name:");
      String username = scanner.nextLine();
      System.out.print("Password:");
      String userPassword = scanner.nextLine();
      //check if the password and user name are equal to what is provided
      if (username.equals(USER_NAME) && userPassword.equals(USER_PASSOWRD)) {
        System.out.println("Login successiful");
        break; //when return true, it exists the control and goes to the next execution
      } else {
        System.out.println("Login was unsuccessful, Either password or username is incorrect. Trry again");
        loginTrial++;
      }
    }
    if (loginTrial == 3) {
      System.err.println("You have exhausted your login attempts, the system will now stop!");
    }

    while (true) {

      System.out.println("***************");
        System.out.println("ATM SIMULATOR");
        System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
        System.out.println("ATM SERVICES\n");
        System.out.println("__________________");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Transfer Cash");
        System.out.println("5. Quit");
        System.out.println("\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
      
     System.out.println("Please choose an option from the above options");
     int option_choosen = scanner.nextInt();

    switch (option_choosen) {
      case 1:
        System.out.println("Your account balance is ksh. " + accountBalance);
        break;
      case 2:
        System.out.print("Enter the amount you want to deposit ");
        double amountToDeposit = scanner.nextDouble();
        accountBalance+=amountToDeposit;
        System.out.print("Your new account balance is ksh. "+accountBalance);
        break;
      case 3:
        System.out.print("Enter the amount you want to withdraw ");
        double amountToWithdraw = scanner.nextDouble();
        //calculate withdraw charges for the inputted amount given the formulae
        double withdrawCharges = amountToWithdraw * 0.02;
        // Then, check if the withdraw charges plus the withdraw amount is greater than accountBalance, gives insufficient balance
        if (amountToWithdraw + withdrawCharges > accountBalance) {
          System.out.print("You have insufficient funds. Your balance is ksh. " + accountBalance);
        }
        else {
          accountBalance -= (amountToWithdraw + withdrawCharges);
          System.out.print(
            "You have successify withdrawn ksh. " + amountToWithdraw +
            ". New Balance is ksh. " + accountBalance
            );
        }
        
        break;
      case 4:
      case 5:
        break;
      default:
        System.out.print("Invalid option. Please enter a valid option! ");
        break;
    }
    }


      
    }

    



  }
