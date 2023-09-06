package com.systechafrica.part2.accessmodifiers;

public class Person {
  private String name;
  private String email;
  private boolean promoted;

  public boolean isPromoted() {
    return promoted;
  }

  public void setPromoted(boolean promoted) {
    this.promoted = promoted;
  }

  // settters and getters
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmai() {
    return this.email;
  }

  public Person(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public Person() {

  }

  public void printDetails() {
    System.out.println(getPersonalDetails());
  }

  private String getPersonalDetails() {
    return name + "" + email;
  }
}
