package com.systechafrica.lms.models;

public class StudentBook {
  private String studentNumber;
  private String bookIsbn;
  private String title;

  public StudentBook() {
  }

  public StudentBook(String studentNumber, String bookIsbn, String title) {
    this.studentNumber = studentNumber;
    this.bookIsbn = bookIsbn;
    this.title = title;
  }

  public String getStudentNumber() {
    return studentNumber;
  }

  public void setStudentNumber(String studentNumber) {
    this.studentNumber = studentNumber;
  }

  public String getBookIsbn() {
    return bookIsbn;
  }

  public void setBookIsbn(String bookIsbn) {
    this.bookIsbn = bookIsbn;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
