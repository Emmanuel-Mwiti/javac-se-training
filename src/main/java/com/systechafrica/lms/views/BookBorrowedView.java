package com.systechafrica.lms.views;

import java.util.List;

import com.systechafrica.lms.databasedao.LibraryDatabaseImp;
import com.systechafrica.lms.models.Book;

public class BookBorrowedView {

  LibraryDatabaseImp libraryDatabaseImp;

  public BookBorrowedView(LibraryDatabaseImp libraryDatabaseImp) {
    this.libraryDatabaseImp = libraryDatabaseImp;
  }

  public void viewBooksBorrowed() {
    List<Book> books = libraryDatabaseImp.getBorrowedBooks();
    System.out.println("****************************************************");
    System.out.println("HERE IS A LIST OF THE BOOKS BORROWED.");
    System.out.println("****************************************************");
    System.out.print("ISBN");
    System.out.print("\t\t");
    System.out.print("Title\n");
    for (Book book : books) {
      System.out.print(book.getIsbnNumber());
      System.out.print("\t\t");
      System.out.print(book.getTitle());
      System.out.println();
    }

  }
}
