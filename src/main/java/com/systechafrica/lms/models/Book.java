package com.systechafrica.lms.models;

public class Book {
  private String isbnNumber;
  private String title;
  private String details;

  public Book(String isbnNumber, String title) {
    this.isbnNumber = isbnNumber;
    this.title = title;
  }

  public String getIsbnNumber() {
    return isbnNumber;
  }

  public void setIsbnNumber(String isbnNumber) {
    this.isbnNumber = isbnNumber;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

}
