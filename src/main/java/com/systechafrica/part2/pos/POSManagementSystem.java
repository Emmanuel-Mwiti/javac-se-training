package com.systechafrica.part2.pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSManagementSystem {

  private final String LOGIN_PASSWORD = "Admin123";
  Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws InterruptedException {

    POSManagementSystem app = new POSManagementSystem();
    boolean loggedIn = app.login();

    if (loggedIn) {
      System.out.println("Successiful Login, Welcome...");
      boolean keepShowing = true;
      while (keepShowing) {
        // display menu
        System.out.println("LOADING...");
        Thread.sleep(400);

        app.displayMainMenu();
        System.out.print("\nchoose an option ");
        int optionChoosen = app.scanner.nextInt();
        app.scanner.nextLine();

        switch (optionChoosen) {
          case 1:
            app.addItem();
            boolean keepAdding = true;
            while (keepAdding) {
              System.out.println("Do you want to add another item? Type y or n");
              String wantsToAddAnotherItem = app.scanner.nextLine();
              if (wantsToAddAnotherItem.equals("y")) {
                app.addItem();
              } else {
                keepAdding = false;
              }
            }
            break;
          case 2:

        }
      }

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
    System.out.println("______________________________");
    System.out.println("      SYSTECH POS SYSTEM      ");
    System.out.println("______________________________");

    System.out.println("1. ADD ITEM");
    System.out.println("2. MAKE PAYMENT");
    System.out.println("3. DISPAY RECEIPT");

  }

  public void displayItemListMenu() {

  }

  public List<Item> addItem() {
    List<Item> items = new ArrayList<>();
    System.out.print("Enter item code ");
    String itemCode = scanner.nextLine();
    System.out.print("Enter the quantity you want ");
    int quantity = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter the unit Price ");
    double unitPrice = scanner.nextDouble();
    scanner.nextLine();

    Item itemEntered = new Item(itemCode, quantity, unitPrice);
    items.add(itemEntered);

    return items;

  }

  public void displayReceipt() {

  }
}
