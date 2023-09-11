package com.systechafrica.part2.inheritance.employeesetup;

public class Employee {

  private String employeeNumber;
  private String employeeName;
  private String employeeAdress;

  public Employee(String employeeNumber, String employeeName, String employeeAdress) {
    this.employeeNumber = employeeNumber;
    this.employeeName = employeeName;
    this.employeeAdress = employeeAdress;
  }

  public String getEmployeeNumber() {
    return employeeNumber;
  }

  public void setEmployeeNumber(String employeeNumber) {
    this.employeeNumber = employeeNumber;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public String getEmployeeAdress() {
    return employeeAdress;
  }

  public void setEmployeeAdress(String employeeAdress) {
    this.employeeAdress = employeeAdress;
  }

  @Override
  public String toString() {
    return "Name" + employeeName + ", number " + employeeName + " of Address" + employeeAdress;
  }

}
