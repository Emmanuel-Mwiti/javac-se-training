package com.systechafrica.someExercises.inheritancequestion;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  String name;
  boolean contract;
  double salary;

  Employee() {
    this.name = new String("Joe");
    this.contract = new Boolean(true);// ! This one however is depreciated, should not be used in java 9
    this.salary = new Double(100);// !This one also

  }

  public String toString() {
    return name + ":" + contract + ":" + salary;
  }

  public static void main(String[] args) {
    // Employee e = new Employee();
    // e.name = "Joe";
    // e.contract = true;
    // e.salary = 100;
    // System.out.print(e);
    List<String> names = new ArrayList<>();
    names.add("Robb");
    names.add("Bran");
    names.add("Rick");
    names.add("Bran");

    if (names.remove("Bran")) {
      names.remove("Jon");
    }
    System.out.println(names);
  }
}
