package com.systechafrica.part3.pos.views;

import java.util.Scanner;
import com.systechafrica.part3.pos.models.Item;
import com.systechafrica.part3.pos.exceptions.InvalidInputException;

public class MainView {
  private Scanner scanner;

  public MainView(Scanner scanner) {
    this.scanner = scanner;
  }

  public Item getItemDetailsFromUser() {
    try {
      System.out.print("Enter item code: ");
      String itemCode = scanner.nextLine();

      System.out.print("Enter quantity: ");
      int quantity = Integer.parseInt(scanner.nextLine());
      validateQuantity(quantity);

      System.out.print("Enter unit price: ");
      double unitPrice = Double.parseDouble(scanner.nextLine());
      validatePrice(unitPrice);

      return new Item(itemCode, quantity, unitPrice);
    } catch (NumberFormatException e) {
      System.out.println("Invalid input. Please enter a valid number.");
      return null;
    } catch (InvalidInputException e) {
      System.out.println(e.getMessage());
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
}
