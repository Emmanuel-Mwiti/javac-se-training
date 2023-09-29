package com.systechafrica.pos.posreviewed.pos.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import com.systechafrica.pos.posreviewed.pos.models.DatabaseConnection;
import com.systechafrica.pos.posreviewed.pos.models.User;
import com.systechafrica.pos.posreviewed.pos.utils.LoggerUtil;

public class UserController {
  private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

  private DatabaseConnection databaseConnection;

  public UserController(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  public User authenticateUser(String username, String password) {
    LoggerUtil.configureLogger(LOGGER);
    Connection connection = databaseConnection.getConnection();
    String selectSQL = "SELECT * FROM user WHERE username = ? AND password = ?";

    try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
      preparedStatement.setString(1, username);
      preparedStatement.setString(2, password);

      ResultSet resultSet = preparedStatement.executeQuery();

      if (resultSet.next()) {
        // ? User found, return a User object with user data
        return new User(resultSet.getString("username"), resultSet.getString("password"));
      }
    } catch (SQLException e) {
      LOGGER.severe("An SQL exception occurred while authenticating user.");
    }

    return null;
  }
}
