package com.systechafrica.lms.views;

import java.util.List;

import com.systechafrica.lms.controllers.BooksController;
import com.systechafrica.lms.models.Book;

public class BookBorrowedView {

  BooksController booksController;

  public BookBorrowedView(BooksController booksController) {
    this.booksController = booksController;
  }

  public void viewBooksBorrowed() {
    List<Book> books = booksController.getBooksFromDatabase();
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
