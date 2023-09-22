package com.systechafrica.part3.jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import com.systechafrica.part3.logging.CustomFormatter;

public class DatabaseAccessDemo {
  private static final Logger LOGGER = Logger.getLogger(DatabaseAccessDemo.class.getName());

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FileHandler fileHandler;
    try {
      fileHandler = new FileHandler("working-with-database.txt");
      CustomFormatter formatter = new CustomFormatter();
      LOGGER.addHandler(fileHandler);
      fileHandler.setFormatter(formatter);

      // ? 1. Update the yml file
      // ? 2. Load the jdbc driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // ? 3. Create a connection
      String urlConnection = "jdbc:Mysql://localhost:3306/javase";
      String user = "root";
      String password = "5168";
      Connection connection = DriverManager.getConnection(urlConnection, user, password);

      // ?4. Create Statement
      Statement statement = connection.createStatement();

      String createTasksTable = "CREATE TABLE IF NOT EXISTS tasks (task_id INT AUTO_INCREMENT PRIMARY KEY,title VARCHAR(255) NOT NULL,start_date DATE,due_date DATE,status TINYINT NOT NULL,priority TINYINT NOT NULL,description TEXT,created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP)  ENGINE=INNODB;";

      // Execute statements
      int updateStatus = statement.executeUpdate(createTasksTable);
      LOGGER.info("Update status= " + updateStatus);

      // Execute insert statement
      // String insertQuery = "insert into tasks
      // (title,start_date,due_date,status,priority,description)values('Add driver to
      // the pom.xml','2023-09-22','2023-09-25',0,1,'updating drivers to the class
      // path');";
      // int noOfRowsAffected = statement.executeUpdate(insertQuery);
      // LOGGER.info("Number of rows affected= " + noOfRowsAffected);

      String insertQuery = "insert into tasks (title,start_date,due_date,status,priority,description)values(?,?,?,?,?,?);";
      // int noOfRowsAffected = statement.executeUpdate(insertQuery);
      PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
      // Read the the Tasks

      Task task = getTaskFromUser(scanner);
      preparedStatement.setString(1, task.getTitle());
      preparedStatement.setString(2, task.getStartDate().toString());
      preparedStatement.setString(3, task.getDueDate().toString());
      preparedStatement.setInt(4, task.getTaskStatus());
      preparedStatement.setInt(5, task.getPriority());
      preparedStatement.setString(6, task.getDescription());
      int noOfRows = preparedStatement.executeUpdate();
      LOGGER.info("Number of Rows=" + noOfRows);
      // Execute selection

      String selectQuery = "SELECT * from tasks;";

      ResultSet resultSet = statement.executeQuery(selectQuery);
      while (resultSet.next()) {
        // task_id,title,start_date,due_date,status,priority,description
        int id = resultSet.getInt("task_id");
        String title = resultSet.getString("title");
        LocalDate startDate = LocalDate.parse(resultSet.getString("start_date"));
        LocalDate dueDate = LocalDate.parse(resultSet.getString("due_date"));
        int status = resultSet.getInt("status");
        int priority = resultSet.getInt("priority");
        String description = resultSet.getString("description");

        // map to object
        Task dbTask = new Task(id, title, startDate, dueDate, status, priority, description);

        System.out.println(dbTask);

      }
    } catch (SecurityException e) {
      LOGGER.severe("Unable to obtain security permissions for the log file: " + e.getMessage());
    } catch (IOException e) {
      LOGGER.severe("Unable to obtain read/write permissions for the log file: " + e.getMessage());
    } catch (ClassNotFoundException e) {
      LOGGER.severe("Unable to obtain class for jdbc driver: " + e.getMessage());
    } catch (SQLException e) {
      LOGGER.severe("Database operation failure: " + e.getMessage());
    }
  }

  private static Task getTaskFromUser(Scanner scanner) {
    // read inputs
    // title,start_date,due_date,status,priority,description
    System.out.println("Enter task title: ");
    String title = scanner.nextLine();

    System.out.println("Enter task start date(YYYY-MM-DD): ");
    LocalDate startDate = LocalDate.parse(scanner.nextLine());

    System.out.println("Enter task start date(YYYY-MM-DD): ");
    LocalDate dueDate = LocalDate.parse(scanner.nextLine());

    System.out.println("Enter task task status (0/1): ");
    int taskStatus = scanner.nextInt();

    System.out.println("Enter task task priority: ");
    scanner.nextLine();
    int priority = scanner.nextInt();

    System.out.println("Enter task description: ");
    scanner.nextLine();
    String description = scanner.nextLine();

    Task task = new Task(title, startDate, dueDate, taskStatus, priority, description);
    return task;
  }
}
