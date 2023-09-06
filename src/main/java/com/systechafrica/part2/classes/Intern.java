package com.systechafrica.part2.classes;

import java.util.logging.Logger;

public class Intern {

  private static final Logger LOGGER = Logger.getLogger(Intern.class.getName());
  String name;
  String phoneNumber;
  String email;

  public Intern() {

  }

  public Intern(String name, String phoneNumber, String email) {
    this.name = name;
    this.email = email;
    this.phoneNumber = phoneNumber;
  }

  public void attendClass() {
    // LOGGER.info("Attend classes..");
    System.out.println("Intern Attends all the classes...");

  }

  public void doAssignment() {
    // LOGGER.info("Do assignments..");
    System.out.println("Intern does the Assignment");
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }
}
