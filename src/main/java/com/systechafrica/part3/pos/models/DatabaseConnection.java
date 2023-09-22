package com.systechafrica.part3.pos.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.CustomFormatter;

public class DatabaseConnection {
  private static final Logger LOGGER = Logger.getLogger(DatabaseConnection.class.getName());

  private static final String JDBC_URL = "jdbc:mysql://localhost:3306/javase";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "5168";

  private Connection connection;
  FileHandler fileHandler;

  public DatabaseConnection() {
    try {
      fileHandler = new FileHandler("database-item-work.txt");
      CustomFormatter formatter = new CustomFormatter();
      LOGGER.addHandler(fileHandler);
      fileHandler.setFormatter(formatter);
      // Load the MySQL JDBC driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Establish a connection to the database
      connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

      LOGGER.info("Database connection successful.");
    } catch (ClassNotFoundException e) {
      LOGGER.severe("Unable to obtain class for jdbc driver: " + e.getMessage());
    } catch (SQLException e) {
      LOGGER.severe("Database operation failure: " + e.getMessage());
    } catch (Exception e) {
      LOGGER.severe("An exception was thrown: " + e.getMessage());
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
      LOGGER.info("Table 'items' created or already exists.");
      statement.close();
    } catch (SQLException e) {
      LOGGER.severe("Error while creating table 'items': " + e.getMessage());
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
        LOGGER.severe("Error while closing the database " + e.getMessage());
      }
    }
  }
}
