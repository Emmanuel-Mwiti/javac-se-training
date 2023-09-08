package com.systechafrica.part2.restaurant;

import java.util.Scanner;

import com.systechafrica.constants.Constants;

public class RestaurantMs {

  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException {
    RestaurantMs app = new RestaurantMs();

    boolean loggedIn = app.login();

    if (loggedIn) {
      System.out.println("Successiful Login, Welcome to Systech restaurant MS");
      System.out.println("LOADING...");
      Thread.sleep(400);
      app.displayMainMenu();
    } else {
      System.err.println("Maximum login attempts reached, please try again later");
    }

  }

  public boolean login() {
    int loginEntries = 0;
    boolean loggedIn = false;

    while (loginEntries < 3) {
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();

      if (password.equals(Constants.DEFAULT_PASSWORD)) {

        loggedIn = true;
        break;
      } else {
        System.out.println("Wrong password!");
        loginEntries++;
      }
    }
    return loggedIn;

  }

  public void displayMainMenu() {
    System.out.println("______________________________");
    System.out.println("SYSTECH RESTAURANT       ");

    System.out.println("DRINKS");
    System.out.println("____________________\n");
    System.out.println("1. CHAI----------------------------------15");
    System.out.println("2. ANDAZI--------------------------------10");
    System.out.println("3. TOSTI---------------------------------12");

    System.out.println("MEALS");
    System.out.println("____________________\n");
    System.out.println("4. NDENGU AND ACCOMPLISHMENTS------------15");
    System.out.println("5. BEANS AND ACCOMPLISHMENTS-------------10");
    System.out.println("6. PILAU VEG-----------------------------12");

    System.out.println("7. QUIT");
  }

  public void displayPaymentMenu() {

  }
}
