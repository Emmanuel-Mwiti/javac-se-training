package com.systechafrica.part3.pos.controllers;

import com.systechafrica.part3.pos.models.DatabaseConnection;
import com.systechafrica.part3.pos.models.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemController {

  private DatabaseConnection databaseConnection;

  public ItemController(DatabaseConnection databaseConnection) {
    this.databaseConnection = databaseConnection;
  }

  public boolean addItem(Item item) {
    Connection connection = databaseConnection.getConnection();
    databaseConnection.createItemsTableIfNotExists();
    String insertSQL = "INSERT INTO items (itemCode, quantity, unitPrice) VALUES (?, ?, ?)";

    try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {// here will help release the
                                                                                        // resources automatically
                                                                                        // without using finally block
      preparedStatement.setString(1, item.getItemCode());
      preparedStatement.setInt(2, item.getQuantity());
      preparedStatement.setDouble(3, item.getUnitPrice());

      int rowsAffected = preparedStatement.executeUpdate();
      return rowsAffected > 0; // ? returns true if rows are bigger than 0
    } catch (SQLException e) {
      e.printStackTrace();
      return false;
    }
  }

  public List<Item> getItemsFromDatabase() {
    List<Item> itemList = new ArrayList<>();

    Connection connection = databaseConnection.getConnection();
    String selectItemsQuery = "SELECT * FROM items";
    try (PreparedStatement preparedStatement = connection.prepareStatement(selectItemsQuery)) {
      ResultSet resultSet = preparedStatement.executeQuery();
      while (resultSet.next()) {
        String itemCode = resultSet.getString("itemCode");
        int quantity = resultSet.getInt("quantity");
        double unitPrice = resultSet.getDouble("unitPrice");

        Item item = new Item(itemCode, quantity, unitPrice);
        itemList.add(item);
      }
    } catch (SQLException e) {
      System.out.println();
    }
    return itemList;
  }

}
