package com.systechafrica.pos.posreviewed.pos.controllers;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.systechafrica.pos.posreviewed.pos.models.Item;
import com.systechafrica.pos.posreviewed.pos.utils.LoggerUtil;
import com.systechafrica.pos.posreviewed.pos.views.MainView;
import com.systechafrica.pos.posreviewed.pos.views.PaymentMenuView;
import com.systechafrica.pos.posreviewed.pos.views.ReceiptView;
import com.systechafrica.utils.ValidateInput;

public class MainController {
  private static final Logger LOGGER = Logger.getLogger(MainController.class.getName());

  // injecting dependencies here to avoid tight coupling
  private Scanner scanner;
  private LoginController loginController;
  private ItemController itemController;
  private MainView mainView;
  private PaymentMenuView paymentMenuView;
  private ReceiptView receiptView;
  private double balance;
  boolean paymentMade;

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
    LoggerUtil.configureLogger(LOGGER);
    boolean loggedIn = loginController.login();

    if (loggedIn) {
      boolean keepShowing = true;
      while (keepShowing) {
        displayWelcomeMessage();
        displayMainMenu();
        int optionChoosen = validateUserOptionIfInteger();
        switch (optionChoosen) {
          case 1:
            addItem();
            keepAdding();
            break;
          case 2:
            makePayment();
            paymentMade = true;
            break;
          case 3:
            if (paymentMade) {
              displayReceipt();
            } else {
              System.out.println("Please pay First before printing the receipt!! ");
            }
            break;
          case 4:
            keepShowing = false;
            break;
          default:
            System.out.println("Please select a valid option");
            break;
        }
      }
    } else {
      System.out.println("Maximum login attempts reached. Please try again later.");
    }
  }

  private void displayWelcomeMessage() {
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

  private void addItem() {
    Item newItem = mainView.getItemDetailsFromUser();

    // Add the item to the database using the ItemController
    boolean itemAdded = itemController.addItem(newItem);

    if (itemAdded) {
      System.out.println("Item added successfully.");
    } else {
      System.out.println("Failed to add item to the database.");
    }
  }

  private void keepAdding() {
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
        LOGGER.severe("Failed, a value that is not compatible to \"y\"! ");
      }

    }
  }

  private double calculateTotalAmount(List<Item> items) {
    double totalAmount = 0.0;
    for (Item item : items) {
      totalAmount += item.getTotalAmount();
    }
    return totalAmount;
  }

  private void makePayment() {
    List<Item> items = itemController.getItemsFromDatabase();
    if (items.isEmpty()) {
      System.out.println("Add items selected from the user first!..");
    } else {
      PaymentMenuView.displayPaymentMenu(items);
      double amountPaid = mainView.getAmountPaidFromUser();
      double totalAmount = calculateTotalAmount(items);
      if (!ValidateInput.validateAmountPaidIsGreaterThanBilled(totalAmount, amountPaid)) {
        makePayment();// Give the user another chance
      } else {
        balance = amountPaid - totalAmount;
        System.out.println("User's balance is: " + balance);
      }
    }

  }

  private void displayReceipt() {
    List<Item> ReceiptItems = itemController.getItemsFromDatabase();
    if (ReceiptItems.isEmpty()) {
      System.out.println("No items available...");
    } else
      receiptView.displayReceipt(ReceiptItems, balance);
    itemController.deleteItemsFromItems(ReceiptItems); // Clears the database once the user has printed the receipts
  }

  private int validateUserOptionIfInteger() {
    int optionChoosen;

    while (true) {
      System.out.print("\nChoose an option: ");
      try {
        optionChoosen = Integer.parseInt(scanner.nextLine());
        if (ValidateInput.isIntegerInRange1To3(optionChoosen)) {
          break; // Valid input, exit the loop
        } else {
          System.err.println("Invalid input. Please choose an option between 1 and 4.");
        }
      } catch (NumberFormatException e) {
        System.err.println("Invalid input. Please enter a valid integer.");
      }
    }
    return optionChoosen;
  }

}
