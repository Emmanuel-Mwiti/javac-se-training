package com.systechafrica.pos.posreviewed.pos.views;

import java.util.IllegalFormatException;
import java.util.Scanner;

import com.systechafrica.pos.posreviewed.pos.exceptions.InvalidInputException;
import com.systechafrica.pos.posreviewed.pos.models.Item;
import com.systechafrica.pos.posreviewed.pos.models.User;
import com.systechafrica.pos.posreviewed.pos.utils.LoggerUtil;

public class MainView {
  private Scanner scanner;

  public MainView(Scanner scanner) {
    this.scanner = scanner;
  }

  public Item getItemDetailsFromUser() {
    LoggerUtil.configureLogger();
    try {
      System.out.print("Enter item code: ");
      String itemCode = scanner.nextLine();

      System.out.print("Enter quantity: ");
      int quantity = Integer.parseInt(scanner.nextLine());
      validateQuantity(quantity);

      System.out.print("Enter unit price: ");
      double unitPrice = Double.parseDouble(scanner.nextLine());
      validatePrice(unitPrice);

      LoggerUtil.logInfoMessage("Got items from the user");
      return new Item(itemCode, quantity, unitPrice);
    } catch (NumberFormatException e) {
      LoggerUtil.logSevereMessage("invalid input. Please enter a valid number.");
      return null;
    } catch (InvalidInputException e) {
      LoggerUtil.logSevereMessage("Invalid input Exception.");
      return null;
    }
  }

  public User getUserDetails() {
    try {
      System.out.print("Enter Username: ");
      String userName = scanner.nextLine();
      validateUsername(userName);

      System.out.print("Enter Password: ");
      String password = scanner.nextLine();
      validatePassword(password);

      return new User(userName, password);
    } catch (InvalidInputException e) {
      // e.printStackTrace();
      LoggerUtil.logSevereMessage("Invalid username or password! ");
      return null;
    }
  }

  public double getAmountPaidFromUser() {
    try {
      System.out.print("Enter the amount paid by the user: ");
      return Double.parseDouble(scanner.nextLine());
    } catch (NumberFormatException e) {
      System.out.println("Invalid input. Please enter a valid number.");
      return getAmountPaidFromUser(); // ? Give the user another chance to enter
    }
  }

  private void validateQuantity(int quantity) throws InvalidInputException {
    if (quantity <= 0) {
      throw new InvalidInputException("Quantity must be greater than zero.");
    }
  }

  private void validatePrice(double price) throws InvalidInputException {
    if (price <= 0.0) {
      throw new InvalidInputException("Price must be greater than zero.");
    }
  }

  private void validateUsername(String username) throws InvalidInputException {
    if (username.trim().length() < 1) {
      throw new InvalidInputException("Username cannot be empty!.");
    }
  }

  private void validatePassword(String password) throws InvalidInputException {
    if (password.trim().length() < 1) {
      throw new InvalidInputException("Password cannot be empty! ");
    }
  }
}
