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
      System.out.println("Login Page");
      System.out.print("Enter your username: ");
      String username = scanner.nextLine();
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();

      // Check if the user is registered and authenticate
      User user = userController.authenticateUser(username, password);

      if (user != null) {
        loggedIn = true;
        System.out.println("Logged in successfully!");
        break;
      } else {
        System.out.println("Wrong username or password!");
        System.out.print("Do you want to register? (yes/no): ");
        String registerChoice = scanner.nextLine().toLowerCase();

        if (registerChoice.equals("yes")) {
          // Allow the user to register
          register();
        }

        loginEntries++;
      }
    }

    return loggedIn;
  }

  private void register() {
    System.out.println("Registration Page");
    System.out.print("Enter your desired username: ");
    String username = scanner.nextLine();
    System.out.print("Enter your password: ");
    String password = scanner.nextLine();

    User newUser = new User(username, password);

    if (userController.createUser(newUser)) {
      System.out.println("Registration successful!");
    } else {
      System.out.println("Registration failed. Please try again.");
    }
  }
}
