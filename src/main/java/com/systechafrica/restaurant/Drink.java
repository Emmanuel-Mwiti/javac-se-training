package com.systechafrica.restaurant;

public class Drink {
  private String name;
  private double price;

  public Drink() {

  }

  public Drink(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }
}
