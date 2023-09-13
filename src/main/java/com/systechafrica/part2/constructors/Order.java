package com.systechafrica.part2.constructors;

public class Order {

  public Order(String isbn, String name, boolean isAvailable) {
    this.isbn = isbn;
    this.name = name;
    this.isAvailable = isAvailable;
  }

  private String isbn;
  private String name;
  private boolean isAvailable;

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

}
