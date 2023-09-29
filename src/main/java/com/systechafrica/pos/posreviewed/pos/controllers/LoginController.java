package com.systechafrica.pos.posreviewed.pos.controllers;

import com.systechafrica.pos.posreviewed.pos.models.User;

import java.util.Scanner;

public class LoginController {

  private Scanner scanner;
  private UserController userController;

  private static final int MAX_LOGIN_ATTEMPTS = 3;

  public LoginController(Scanner scanner, UserController userController) {
    this.scanner = scanner;
    this.userController = userController;
  }

  public boolean login() {
    int loginEntries = 0;
    boolean loggedIn = false;

    while (loginEntries < MAX_LOGIN_ATTEMPTS) {
      System.out.println("SYSTECH POS ADMINISTRATOR LOGIN PAGE: ");
      System.out.print("Enter the username: ");
      String username = scanner.nextLine();
      System.out.print("Enter the password: ");
      String password = scanner.nextLine();

      // Check if the user is registered and authenticate
      User user = userController.authenticateUser(username, password);

      if (user != null) {
        loggedIn = true;
        System.out.println("Logged in successfully!");
        break;
      } else {
        System.out.println("Wrong username or password! Please try Again...");

        loginEntries++;
      }
    }

    return loggedIn;
  }

}
