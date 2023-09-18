package com.systechafrica.someExercises.constructors;

public class Book {
  int id;
  String name;

  public Book(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public boolean equals(Object obj) {
    boolean output = false;
    Book b = (Book) obj;
    if (this.name.equals(b)) {
      return true;
    }
    return output;
  }

  public static void main(String[] args) {
    Book b1 = new Book(101, "Java");
    Book b2 = new Book(101, "Java");
    System.out.println(b1.equals(b2));
  }

}
