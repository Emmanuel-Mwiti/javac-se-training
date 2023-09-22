package com.systechafrica.part3.pos;

import com.systechafrica.part3.pos.controllers.ItemController;
import com.systechafrica.part3.pos.controllers.LoginController;
import com.systechafrica.part3.pos.controllers.MainController;
import com.systechafrica.part3.pos.models.DatabaseConnection;
import com.systechafrica.part3.pos.views.MainView;
import com.systechafrica.part3.pos.views.ReceiptView;

import java.util.Scanner;

public class PointsOfSaleApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DatabaseConnection databaseConnection = new DatabaseConnection();
    ItemController itemController = new ItemController(databaseConnection);
    LoginController loginController = new LoginController(scanner);
    ReceiptView receiptView = new ReceiptView();
    MainView mainView = new MainView(scanner);

    MainController mainController = new MainController(loginController, itemController, mainView, receiptView);
    mainController.startApplication();

    scanner.close();
    databaseConnection.closeConnection();
  }
}
