package com.systechafrica.pos.posreviewed.pos.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;

import com.systechafrica.pos.posreviewed.pos.controllers.UserController;
import com.systechafrica.pos.posreviewed.pos.utils.LoggerUtil;

public class DatabaseConnection {
  private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

  // String dbUrl = dotenv.get("DB_URL");
  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/javase";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "5168";

  private Connection connection;

  public DatabaseConnection() {
    LoggerUtil.configureLogger(LOGGER);
    try {
      // Load the MySQL JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish a connection to the database
      connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

      LOGGER.info("Connected to database. ");
    } catch (ClassNotFoundException e) {
      LOGGER.severe("Class not found ");
    } catch (SQLException e) {
      LOGGER.severe("SQLException. Could not connect to the DB. ");
    } catch (Exception e) {
      LOGGER.severe("An exception was thrown. Could not connect to the DB.  ");
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
      LOGGER.info("Table 'items' created. ");
      statement.close();
    } catch (SQLException e) {
      LOGGER.severe("SQLException while creating table items ");
    }
  }

  public void createUserTableIfNotExists() {
    try {
      Statement statement = connection.createStatement();

      // SQL statement to create the table if it doesn't exist
      String createTableSQL = "CREATE TABLE IF NOT EXISTS user (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL);";

      statement.executeUpdate(createTableSQL);
      LOGGER.info("Table 'user' created. ");
      statement.close();
    } catch (SQLException e) {
      LOGGER.severe("SQLException while creating table user ");
    }
  }

  public Connection getConnection() {
    return connection;
  }

  public void closeConnection() {
    if (connection != null) {
      try {
        connection.close();
        LOGGER.info("Database connection closed.");
      } catch (SQLException e) {
        LOGGER.severe("SQLException while closing the database connection...");
      }
    }
  }

}
