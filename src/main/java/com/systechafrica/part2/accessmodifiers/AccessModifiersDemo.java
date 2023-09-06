package com.systechafrica.part2.accessmodifiers;

import com.systechafrica.part2.accessmodifiers.lms.Book;

public class AccessModifiersDemo {

  public static void main(String[] args) {
    Person person = new Person("Emmanuel", "kiuguemmanu@gmail.com");
    // !This is not visible, it is private
    // ?person.name = "John";
    person.printDetails();
    System.out.println();

    Book book = new Book();
    // ?book.title;
    // !This one above is not accessible because of different package and uses a
    // default access modifier

  }
}
