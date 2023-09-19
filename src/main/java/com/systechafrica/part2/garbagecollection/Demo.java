package com.systechafrica.part2.garbagecollection;

public class Demo {
  public static void main(String[] args) {
    Person emmanuelPerson = new Person("Emmanuel", 23);
    Person jonathan = new Person("Jonathan", 21);
    Person aPerson = new Person("John", 24);

    System.out.println(emmanuelPerson);
    System.out.println(jonathan);
    System.out.println(aPerson);

    emmanuelPerson = aPerson;
    jonathan = null;
    System.out.println(emmanuelPerson);
    jonathan = new Person("Jonathan", 21);
    System.out.println(jonathan);

  }

}
