package com.systechafrica.lms.databasedao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.systechafrica.part3.pos.utils.LoggerUtil;

public class LibraryDatabaseInitializer {

  public static void createStudentsBooksTable(Connection connection) {
    String sql = "CREATE TABLE IF NOT EXISTS `students_books` (" +
        "`student_number` VARCHAR(255) NOT NULL," +
        "`isbn` VARCHAR(255) PRIMARY KEY," +
        "`title` VARCHAR(255)" +
        ");";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.execute();
    } catch (Exception e) {
      LoggerUtil.logSevereMessage("Exception occurred while trying to create table students_books");
    }
  }

  public static void createBooksTable(Connection connection) {
    String sql = "CREATE TABLE IF NOT EXISTS `books` (" +
        "`isbn` VARCHAR(255) PRIMARY KEY," +
        "`title` VARCHAR(255) NOT NULL" +
        ");";
    try (PreparedStatement statement = connection.prepareStatement(sql)) {
      statement.execute();
    } catch (Exception e) {
      LoggerUtil.logSevereMessage("Exception occurred while trying to create table Books");
    }
  }
}
