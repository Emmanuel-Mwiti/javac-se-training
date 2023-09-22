package com.systechafrica.part3.pos.controllers;

import com.systechafrica.constants.Constants;

import java.util.Scanner;

public class LoginController {

  private Scanner scanner;
  // private DatabaseConnection databaseConnection;
  private static final int MAX_LOGIN_ATTEMPTS = 3;

  public LoginController(Scanner scanner) {
    this.scanner = scanner;
  }

  public boolean login() {
    int loginEntries = 0;
    boolean loggedIn = false;

    while (loginEntries < MAX_LOGIN_ATTEMPTS) {
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();

      if (com.systechafrica.utils.ValidateInput.validate(password)) {
        if (password.equals(Constants.DEFAULT_PASSWORD)) {
          loggedIn = true;
          break;
        } else {
          System.out.println("Wrong password!");
          loginEntries++;
        }
      }
    }
    return loggedIn;
  }
}
