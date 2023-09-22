package com.systechafrica.part3.pos.models;

public class Item {
  private String id;
  private String itemCode;
  private int quantity;
  private double unitPrice;

  public Item(String itemCode, int quantity, double unitPrice) {
    this.itemCode = itemCode;
    this.quantity = quantity;
    this.unitPrice = unitPrice;
  }

  public Item() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getItemCode() {
    return itemCode;
  }

  public void setItemCode(String itemCode) {
    this.itemCode = itemCode;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public double getTotalAmount() {
    return quantity * unitPrice;
  }

  @Override
  public String toString() {
    return "Item [id=" + id + ", itemCode=" + itemCode + ", quantity=" + quantity + ", unitPrice=" + unitPrice + "]";
  }
}
