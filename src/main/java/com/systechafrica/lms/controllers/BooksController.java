package com.systechafrica.lms.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.systechafrica.lms.databasedao.DatabaseConnection;
import com.systechafrica.lms.models.Book;
import com.systechafrica.lms.utils.LoggerUtil;

public class BooksController {

  DatabaseConnection databaseConnection;

  public BooksController(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  public List<Book> getBooksFromDatabase() {
    List<Book> booksList = new ArrayList<>();

    Connection connection = databaseConnection.getConnection();
    String selectBooksQuery = "SELECT * FROM books";
    try (PreparedStatement preparedStatement = connection.prepareStatement(selectBooksQuery)) {

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        String isbnNumber = resultSet.getString("isbn");
        String title = resultSet.getString("title");

        Book book = new Book(isbnNumber, title);
        booksList.add(book);
        LoggerUtil.logInfoMessage("Select from books table ");
      }
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("SQL Exception while selecting items.");
    }
    return booksList;

  }
}
