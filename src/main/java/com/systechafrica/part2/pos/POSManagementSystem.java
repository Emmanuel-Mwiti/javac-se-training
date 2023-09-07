package com.systechafrica.part2.pos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class POSManagementSystem {

  private final String LOGIN_PASSWORD = "Admin123";
  Scanner scanner = new Scanner(System.in);
  private List<Item> itemsList = new ArrayList<>();

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
            app.displayItemListMenu();
            break;
          case 3:

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
    System.out.print("Item code\t");
    System.out.print("Quantity\t");
    System.out.print("Unit Price\t");
    System.out.println("Total Value\t");

    if (itemsList.isEmpty()) {
      System.out.println("No items have been choosen");
      return;
    }

    double total = 0.0;

    for (Item item : itemsList) {
      System.out.print(item.getItemCode() + "\t\t");
      System.out.print(item.getIQuantity() + "\t\t");
      System.out.print(item.getUnitPrice() + "\t\t");
      System.out.print(item.getTotalAmount() + "\t\t");
      System.out.println();
      total += item.getTotalAmount();
    }
    System.out.println("******************************");
    System.out.println("Total-\t\t" + total);
    System.out.println("******************************");
    System.out.print("Enter the amount given by the user ");
    double amountPaid = scanner.nextDouble();
    scanner.nextLine();
    double change = amountPaid - total;
    System.out.print("Change\t\t" + change);
    System.out.println("\t\t\t____");
  }

  public List<Item> addItem() {
    // List<Item> items = new ArrayList<>();
    System.out.print("Enter item code ");
    String itemCode = scanner.nextLine();
    System.out.print("Enter the quantity you want ");
    int quantity = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Enter the unit Price ");
    double unitPrice = scanner.nextDouble();
    scanner.nextLine();

    Item itemEntered = new Item(itemCode, quantity, unitPrice);
    itemsList.add(itemEntered);

    return itemsList;

  }

  public void displayReceipt() {

  }
}
