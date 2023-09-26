package com.systechafrica.lms.views;

import java.util.Scanner;

import com.systechafrica.lms.models.Student;
import com.systechafrica.lms.databasedao.LibraryDatabaseImp;
import com.systechafrica.lms.models.Book;

public class BookDetailsView {
  Scanner scanner;
  LibraryDatabaseImp libraryDatabaseImp;

  public BookDetailsView(Scanner scanner, LibraryDatabaseImp libraryDatabaseImp) {
    this.scanner = scanner;
    this.libraryDatabaseImp = libraryDatabaseImp;
  }

  public boolean borrowBook() {
    Student student = getStudentDetailsFromUser();
    Book book = getBookDetailsFromUser();

    if (student != null && book != null) {
      return libraryDatabaseImp.borrowBook(student, book);
    }

    return false;
  }

  public Student getStudentDetailsFromUser() {
    System.out.print("Student Number: ");
    String studentNumber = scanner.nextLine();
    // System.out.print("Student First Name: ");
    // String firstName = scanner.nextLine();
    // System.out.print("Student Last Name: ");
    // String lastName = scanner.nextLine();

    return new Student(studentNumber);
  }

  public Book getBookDetailsFromUser() {
    System.out.print("ISBN: ");
    String isbn = scanner.nextLine();
    System.out.print("Title: ");
    String title = scanner.nextLine();

    return new Book(isbn, title);
  }

}
