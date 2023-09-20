package com.systechafrica.part2.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {
  public static void main(String[] args) {

    DataAccess mysqlAccess = new MysqlDataAccess();
    mysqlAccess.connect();
    ResultSet studentResultSet = mysqlAccess.executeQuery("select * from student");
    try {
      while (studentResultSet.next()) {
        int studentAge = studentResultSet.getInt("age");
        int studentId = studentResultSet.getInt("id");
        String studentEmail = studentResultSet.getString("email");
        System.out.println("Age: " + studentAge + " Id: " + studentId + " Email: " + studentEmail);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
