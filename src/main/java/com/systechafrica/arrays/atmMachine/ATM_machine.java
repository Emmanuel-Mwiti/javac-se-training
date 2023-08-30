package com.systechafrica.arrays.atmMachine;

import java.util.Scanner;

public class ATM_machine {
  public static void main(String[] args) {
    //?Divide the project into sprints

    //  **HERE IS THE APPROACH STEP BY STEP I APPROACHED THE PROBLEM  **
    //  After Each solution, i commit the changes, therefore even the commit messages can show my approach

      //  1.  First setting up how the first login, assuming the name is Emmanuel and default password. If this is is true, directed to the login page


    final String USER_NAME = "Emmanuel";
    final String USER_PASSOWRD = "Admin123";

    System.out.println("Welcome to ATM Machine. Please enter the name and passoword to login.");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Name:");
    String username = scanner.nextLine();
    System.out.print("Password:");
    String userPassword = scanner.nextLine();

    //check if the password and user name are equal to what is provided
    if (username.equals(USER_NAME) && userPassword.equals(USER_PASSOWRD)) {
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
    }





  }
}
