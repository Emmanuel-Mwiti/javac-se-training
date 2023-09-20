package com.systechafrica.part2.jdbc;

import java.sql.*;

public class MysqlDataAccess implements DataAccess {
  private Connection connection;

  public MysqlDataAccess() {
    // class.forName("com.mysql.cj.jdbc.Driver");
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {

      System.out.println(e.getMessage());
    }
  }

  @Override
  public Connection connect() {
    try {
      // Only create a new connection if it's not already established
      if (connection == null || connection.isClosed()) {
        connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/students_jpa",
            "root",
            "5168");
      }
      return connection;
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return null;
    }
  }

  @Override
  public ResultSet executeQuery(String query) {
    Statement statement;
    try {
      statement = connect().createStatement();
      ResultSet resultSet = statement.executeQuery(query);
      return resultSet;
    } catch (SQLException e) {
      // System.out.println(e.getMessage());
      e.printStackTrace();
      return null;
    }

  }

  @Override
  public int executeUpdate(String query) {

    try {
      Statement statement = connect().createStatement();
      int noOfRecordsUpdated = statement.executeUpdate(query);
      return noOfRecordsUpdated;
    } catch (SQLException e) {
      System.out.println(e.getMessage());
      return 0;
    }
  }

  @Override
  public void close() {
    try {
      if (connection != null && !connection.isClosed()) {
        connection.close();
      }
    } catch (SQLException e) {
      System.out.println(e.getMessage());
    }
  }

}
