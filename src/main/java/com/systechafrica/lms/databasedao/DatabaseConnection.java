package com.systechafrica.lms.databasedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.systechafrica.pos.posreviewed.pos.utils.LoggerUtil;

public class DatabaseConnection {
  private Connection connection;
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/library";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "5168";

  public DatabaseConnection() {
    try {
      // Load the MySQL JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish a connection to the database
      connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

      // LOGGER.info("Database connection successful.");
      LoggerUtil.logInfoMessage("Connected to database. ");
    } catch (ClassNotFoundException e) {
      LoggerUtil.logSevereMessage("Class not found ");
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("SQLException. Could not connect to the DB. ");
    } catch (Exception e) {
      LoggerUtil.logSevereMessage("An exception was thrown. Could not connect to the DB.  ");
    }
  }

  public Connection getConnection() {
    return connection;
  }

  public void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
        LoggerUtil.logInfoMessage("Database connection closed.");
      } catch (SQLException e) {
        LoggerUtil.logSevereMessage("SQLException while closing the database connection...");
      }
    }
  }
}
