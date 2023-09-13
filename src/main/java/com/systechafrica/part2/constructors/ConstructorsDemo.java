package com.systechafrica.part2.constructors;

public class ConstructorsDemo {
  public static void main(String[] args) {
    Book b1 = new Book(2023, "Programmer one", true);
    Book b2 = new Book(2023, "Programmer one", true);

    // !Below statement compares the reference variables and therefore prints false
    System.out.println(b1.equals(b2));
    // ?After creating out custom method that overrides the Object class which is
    // ? parent class
    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());
  }

}
