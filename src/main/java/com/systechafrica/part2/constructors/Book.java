package com.systechafrica.part2.constructors;

public class Book {
  public Book(int isbn, String title, boolean isAvailable) {
    this.isbn = isbn;
    this.title = title;
    this.isAvailable = isAvailable;
  }

  private int isbn;
  private String title;
  private boolean isAvailable;

  public int getIsbn() {
    return isbn;
  }

  public void setIsbn(int isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isAvailable() {
    return isAvailable;
  }

  public void setAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  @Override
  public boolean equals(Object obj) {
    Book newObjBook = (Book) obj;
    if (newObjBook.isbn == getIsbn()) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public int hashCode() {
    return getIsbn();
  }

}
