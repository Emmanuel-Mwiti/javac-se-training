package com.systechafrica.part3.pos.views;

import java.util.Scanner;

import com.systechafrica.part3.pos.models.Item;

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

      System.out.print("Enter unit price: ");
      double unitPrice = Double.parseDouble(scanner.nextLine());

      return new Item(itemCode, quantity, unitPrice);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      return null;

    }
  }

  public double getAmountPaidFromUser() {
    System.out.print("Enter the amount paid by the user: ");
    return Double.parseDouble(scanner.nextLine());
  }
}
