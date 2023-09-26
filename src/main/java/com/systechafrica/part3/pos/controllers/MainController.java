package com.systechafrica.part3.pos.controllers;

import java.util.List;
import java.util.Scanner;

import com.systechafrica.part3.pos.models.Item;
import com.systechafrica.part3.pos.views.MainView;
import com.systechafrica.part3.pos.views.PaymentMenuView;
import com.systechafrica.part3.pos.views.ReceiptView;
import com.systechafrica.utils.ValidateInput;

public class MainController {

  private Scanner scanner;
  private LoginController loginController;
  private ItemController itemController;
  private MainView mainView;
  private PaymentMenuView paymentMenuView;
  private ReceiptView receiptView;
  private double balance;

  public MainController(LoginController loginController, ItemController itemController, MainView mainView,
      ReceiptView receiptView, Scanner scanner, PaymentMenuView paymentMenuView) {
    this.loginController = loginController;
    this.itemController = itemController;
    this.mainView = mainView;
    this.receiptView = receiptView;
    this.scanner = scanner;
    this.paymentMenuView = paymentMenuView;
  }

  public void startApplication() {
    boolean loggedIn = loginController.login();

    if (loggedIn) {
      boolean keepShowing = true;
      while (keepShowing) {
        displayWelcomeMessage();
        displayMainMenu();
        System.out.print("\nchoose an option ");
        int optionChoosen = scanner.nextInt();
        scanner.nextLine();
        if (ValidateInput.isIntegerInRange1To3(optionChoosen)) {
          switch (optionChoosen) {
            case 1:
              addItem();
              keepAdding();
              break;
            case 2:
              makePayment();
              break;
            case 3:
              List<Item> ReceiptItems = itemController.getItemsFromDatabase();
              if (ReceiptItems.isEmpty()) {
                System.out.println("No items available...");
              } else
                receiptView.displayReceipt(ReceiptItems, balance);

              break;
            case 4:
              keepShowing = false;
              break;
            default:
              System.out.println("Please select a valid option");
              break;
          }
        }
      }
    } else {
      System.out.println("Maximum login attempts reached. Please try again later.");
    }
  }

  public void displayWelcomeMessage() {
    System.out.println("Welcome to the SYSTECH Point of Sale System!");
  }

  public void displayMainMenu() {
    System.out.println("______________________________");
    System.out.println("      SYSTECH POS SYSTEM      ");
    System.out.println("______________________________");

    System.out.println("1. ADD ITEM");
    System.out.println("2. MAKE PAYMENT");
    System.out.println("3. DISPAY RECEIPT");
    System.out.println("4. QUIT");

  }

  public void addItem() {
    Item newItem = mainView.getItemDetailsFromUser();

    // Add the item to the database using the ItemController
    boolean itemAdded = itemController.addItem(newItem);

    if (itemAdded) {
      System.out.println("Item added successfully.");
    } else {
      System.out.println("Failed to add item to the database.");
    }
  }

  public boolean keepAdding() {
    boolean keepAdding = true;
    while (keepAdding) {
      try {
        System.out.println("Do you want to add another item? Type y or n");
        String wantsToAddAnotherItem = scanner.nextLine();
        if (wantsToAddAnotherItem.equalsIgnoreCase("y")) {
          addItem();
        } else {
          keepAdding = false;
        }
      } catch (IllegalArgumentException e) {
      }

    }
    return keepAdding;
  }

  private double calculateTotalAmount(List<Item> items) {
    double totalAmount = 0.0;
    for (Item item : items) {
      totalAmount += item.getTotalAmount();
    }
    return totalAmount;
  }

  public double makePayment() {
    List<Item> items = itemController.getItemsFromDatabase();
    PaymentMenuView.displayPaymentMenu(items);
    double amountPaid = mainView.getAmountPaidFromUser();
    double totalAmount = calculateTotalAmount(items);
    if (!ValidateInput.validateAmountPaidIsGreaterThanBilled(totalAmount, amountPaid)) {
      return 0;
    } else {
      balance = amountPaid - totalAmount;
      System.out.println("User's balance is: " + balance);
      return balance;
    }

  }

}
