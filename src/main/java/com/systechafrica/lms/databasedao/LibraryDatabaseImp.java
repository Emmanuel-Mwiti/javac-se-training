package com.systechafrica.lms.databasedao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.systechafrica.lms.models.Book;
import com.systechafrica.lms.models.Student;
import com.systechafrica.lms.utils.LoggerUtil;

public class LibraryDatabaseImp implements LibraryDatabase {
  DatabaseConnection databaseConnection;

  public LibraryDatabaseImp(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  @Override
  public boolean borrowBook(Student student, Book book) {
    Connection connection = databaseConnection.getConnection();

    LibraryDatabaseInitializer.createStudentsBooksTable(connection);
    LibraryDatabaseInitializer.createBooksTable(connection);

    String insertStudentsBooksQuery = "INSERT INTO students_books (student_number, isbn, title) VALUES (?, ?, ?);";
    int studentsBooksAffectedRows = 0;

    try (PreparedStatement studentsBooksStatement = connection.prepareStatement(insertStudentsBooksQuery)) {
      studentsBooksStatement.setString(1, student.getNumber());
      studentsBooksStatement.setString(2, book.getIsbnNumber());
      studentsBooksStatement.setString(3, book.getTitle());
      studentsBooksAffectedRows = studentsBooksStatement.executeUpdate();
    } catch (SQLException e) {
      System.out.println("Could not be able to add the book!");
    }

    // Insert into books table
    String insertBooksQuery = "INSERT INTO books (isbn, title) VALUES (?, ?);";
    int booksAffectedRows = 0;

    try (PreparedStatement booksStatement = connection.prepareStatement(insertBooksQuery)) {
      booksStatement.setString(1, book.getIsbnNumber());
      booksStatement.setString(2, book.getTitle());
      booksAffectedRows = booksStatement.executeUpdate();
      // System.out.println("No of rows affect: " + booksAffectedRows);
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("Unable to insert into the the tables! ");
      e.printStackTrace();
    }

    // Check if both insertions were successful
    return studentsBooksAffectedRows > 0 && booksAffectedRows > 0;
  }

  @Override
  public boolean returnBook(Student student, Book book) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'returnBook'");
  }

  @Override
  public List<Book> getBorrowedBooks() {
    List<Book> booksList = new ArrayList<>();

    Connection connection = databaseConnection.getConnection();
    String selectBooksQuery = "SELECT * FROM books";
    try (PreparedStatement preparedStatement = connection.prepareStatement(selectBooksQuery)) {

      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        String isbnNumber = resultSet.getString("isbn");
        String title = resultSet.getString("title");

        booksList.add(new Book(isbnNumber, title));
        LoggerUtil.logInfoMessage("Select from books table ");
      }
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("SQL Exception while selecting items.");
    }
    return booksList;
  }

}
