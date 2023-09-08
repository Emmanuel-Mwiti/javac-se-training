package com.systechafrica.pos;

public class Item {
  private String itemCode;
  private int quantity;
  private double unitPrice;

  public Item() {

  }

  public Item(String itemCode, int quantity, double unitPrice) {
    this.itemCode = itemCode;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public String getItemCode() {
    return itemCode;
  }

  public int getIQuantity() {
    return quantity;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public double getTotalAmount() {
    return quantity * unitPrice;
  }

}
