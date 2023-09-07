package com.systechafrica.part2.pos;

import java.util.Scanner;

public class POSManagementSystem {

  private final String LOGIN_PASSWORD = "Admin123";
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    POSManagementSystem app = new POSManagementSystem();
    boolean loggedIn = app.login();

    if (loggedIn) {
      System.out.println("Successiful Login, Welcome...");
    } else {
      System.out.println("Maximum login Attempts reached, please try again Later!");
    }
  }

  public boolean login() {
    int loginEntries = 0;
    boolean loggedIn = false;

    while (loginEntries < 3) {
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();

      if (password.equals(LOGIN_PASSWORD)) {

        loggedIn = true;
        break;
      } else {
        System.out.println("Wrong passoword!");
        loginEntries++;
      }
    }
    return loggedIn;
  }

  public void displayMainMenu() {

  }

  public void displayItemListMenu() {

  }

  public void addItem() {

  }

  public void displayReceipt() {

  }
}
