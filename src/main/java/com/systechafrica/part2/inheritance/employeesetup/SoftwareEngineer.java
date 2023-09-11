package com.systechafrica.part2.inheritance.employeesetup;

public class SoftwareEngineer extends Employee {

  private String title;

  public SoftwareEngineer(String employeeNumber, String employeeName, String employeeAdress, String title) {
    super(employeeNumber, employeeName, employeeAdress);
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Name" + super.getEmployeeName() + ", number " + getEmployeeNumber() + " of Address" + getEmployeeAdress()
        + " and the title" + this.title;
  }

}
