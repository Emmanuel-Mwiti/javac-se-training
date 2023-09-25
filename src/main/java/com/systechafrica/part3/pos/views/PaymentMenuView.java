package com.systechafrica.part3.pos.views;

import java.util.List;

import com.systechafrica.part3.pos.models.Item;

public class PaymentMenuView {
  public static void displayPaymentMenu(List<Item> items) {

    System.out.println("Item code\tQuantity\tUnit Price\tTotal Value");

    double total = 0.0; // Initialize a variable to keep track of the total

    for (Item item : items) {
      System.out.print(item.getItemCode() + "\t\t");
      System.out.print(item.getQuantity() + "\t\t");
      System.out.print(item.getUnitPrice() + "\t\t");
      System.out.print(item.getTotalAmount() + "\t\t");
      System.out.println();

      total += item.getTotalAmount();
    }

    System.out.println("******************************");
    System.out.print("Total=\t\t");
    System.out.println(total);
    System.out.println("******************************");
  }

}
