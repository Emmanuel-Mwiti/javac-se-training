package com.systechafrica.part3.pos.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;

import com.systechafrica.part3.pos.utils.LoggerUtil;

public class DatabaseConnection {

  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/javase";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "5168";

  private Connection connection;
  FileHandler fileHandler;

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
      LoggerUtil.logSevereMessage("SQLException ");
    } catch (Exception e) {
      LoggerUtil.logSevereMessage("An exception was thrown.  ");
    }
  }

  public void createItemsTableIfNotExists() {
    try {
      Statement statement = connection.createStatement();

      // SQL statement to create the table if it doesn't exist
      String createTableSQL = "CREATE TABLE IF NOT EXISTS items ("
          + "id INT AUTO_INCREMENT PRIMARY KEY,"
          + "itemCode VARCHAR(255) NOT NULL,"
          + "quantity INT NOT NULL,"
          + "unitPrice DOUBLE NOT NULL"
          + ")";

      statement.executeUpdate(createTableSQL);
      LoggerUtil.logInfoMessage("Table 'items' created. ");
      statement.close();
    } catch (SQLException e) {
      LoggerUtil.logSevereMessage("SQLException ");
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
        LoggerUtil.logSevereMessage("SQLException ");
      }
    }
  }
}
