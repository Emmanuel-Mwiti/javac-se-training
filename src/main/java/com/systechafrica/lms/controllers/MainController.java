package com.systechafrica.lms.controllers;

import java.util.Scanner;

import com.systechafrica.lms.views.BookBorrowedView;
import com.systechafrica.lms.views.BookDetailsView;
import com.systechafrica.utils.ValidateInput;

public class MainController {
  LoginController loginController;
  Scanner scanner;
  BookDetailsView bookDetailsView;
  BookBorrowedView bookBorrowedView;

  public MainController(LoginController loginController, Scanner scanner, BookDetailsView bookDetailsView,
      BookBorrowedView bookBorrowedView) {
    this.loginController = loginController;
    this.scanner = scanner;
    this.bookDetailsView = bookDetailsView;
    this.bookBorrowedView = bookBorrowedView;
  }

  public void startApplication() {

    if (loginController.login()) {
      boolean keepShowing = true;
      while (keepShowing) {
        displayMainMenu();
        System.out.print("\nchoose an option ");
        int optionChoosen = scanner.nextInt();
        scanner.nextLine();
        if (ValidateInput.isIntegerInRange1To3(optionChoosen)) {
          switch (optionChoosen) {
            case 1:
              borrowBook();
              break;
            case 2:
              bookBorrowedView.viewBooksBorrowed();
              break;
            case 3:
              System.out.println();
              break;
            case 4:
              keepShowing = false;
              break;
            default:
              System.out.println("Please select a valid option");
              break;
          }
        }
      }

    } else {
      System.out.println("Not able to login in Maximum password attempts reached. Please try again later. ");
    }

  }

  public void displayMainMenu() {
    System.out.println("-----------------------------------------------\n");
    System.out.println("      SYSTECH Library Management System     ");
    System.out.println("-------------------------------------------------");

    System.out.println("1. Borrow a Book");
    System.out.println("2. View borrowed books");
    System.out.println("3. Return a book");
    System.out.println("4. Quit");

  }

  public void borrowBook() {

    if (bookDetailsView.borrowBook()) {
      System.out.println("Book added successfully..");
      System.out.println("Do you want to add another book? Type y or n");
      String addingAnotherBook = scanner.next();
      boolean wantsToAddAnotherBook = true;
      while (wantsToAddAnotherBook) {

        if (!addingAnotherBook.equalsIgnoreCase("y")) {
          wantsToAddAnotherBook = false; // Exit the loop
        }
      }

    } else {
      System.out.println("Book could not be added!..");
    }
  }
}
