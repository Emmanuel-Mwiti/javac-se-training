package com.systechafrica.lms.models;

public class Student {
  private String number;
  private String firstName;
  private String lastName;

  public Student() {
  }

  public Student(String number) {
    this.number = number;
  }

  public Student(String number, String firstName, String lastName) {
    this.number = number;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "Student [number=" + number + ", firstName=" + firstName + ", lastName=" + lastName + "]";
  }

}
