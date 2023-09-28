package com.systechafrica.pos.posreviewed.pos.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.systechafrica.pos.posreviewed.pos.models.DatabaseConnection;
import com.systechafrica.pos.posreviewed.pos.models.User;
import com.systechafrica.pos.posreviewed.pos.utils.LoggerUtil;

public class UserController {

  private DatabaseConnection databaseConnection;

  public UserController(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  public boolean createUser(User user) {
    LoggerUtil.configureLogger();
    Connection connection = databaseConnection.getConnection();
    databaseConnection.createUserTableIfNotExists();
    String insertSQL = "INSERT INTO user (username,password) VALUES(?, ?);";

    try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {// here will help release the
                                                                                        // resources automatically
                                                                                        // without using finally block
      preparedStatement.setString(1, user.getUsername());
      preparedStatement.setString(2, user.getPassword());

      int rowsAffected = preparedStatement.executeUpdate();
      LoggerUtil.logInfoMessage("Added to items table. Rows affected= " + rowsAffected);
      return rowsAffected > 0; // ? returns true if rows are bigger than 0
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("An SQL exception thrown while adding user to the database. ");
      return false;
    }
  }

  public User authenticateUser(String username, String password) {
    LoggerUtil.configureLogger();
    Connection connection = databaseConnection.getConnection();
    String selectSQL = "SELECT * FROM user WHERE username = ? AND password = ?";

    try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);

      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
        // User found, return a User object with user data
        return new User(resultSet.getString("username"), resultSet.getString("password"));
      }
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("An SQL exception occurred while authenticating user.");
    }

    return null;
  }
}
