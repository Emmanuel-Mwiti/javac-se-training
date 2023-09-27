package com.systechafrica.lms;

import java.util.Scanner;

import com.systechafrica.lms.controllers.BookController;
import com.systechafrica.lms.controllers.LoginController;
import com.systechafrica.lms.controllers.MainController;
import com.systechafrica.lms.databasedao.DatabaseConnection;
import com.systechafrica.lms.databasedao.LibraryDatabaseImp;
import com.systechafrica.lms.views.BookBorrowedView;
import com.systechafrica.lms.views.BookDetailsView;

public class LibraryMS {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    LoginController loginController = new LoginController(scanner);
    DatabaseConnection databaseConnection = new DatabaseConnection();
    LibraryDatabaseImp libraryDatabaseImp = new LibraryDatabaseImp(databaseConnection);
    BookDetailsView bookDetailsView = new BookDetailsView(scanner, libraryDatabaseImp);
    BookController booksController = new BookController(databaseConnection);
    BookBorrowedView bookBorrowedView = new BookBorrowedView(booksController);
    MainController mainController = new MainController(loginController, scanner, bookDetailsView, bookBorrowedView);

    mainController.startApplication();

    scanner.close();
  }
}
