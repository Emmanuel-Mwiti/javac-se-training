package com.systechafrica.pos.posreviewed.pos;

import java.util.Scanner;

import com.systechafrica.pos.posreviewed.pos.controllers.ItemController;
import com.systechafrica.pos.posreviewed.pos.controllers.LoginController;
import com.systechafrica.pos.posreviewed.pos.controllers.MainController;
import com.systechafrica.pos.posreviewed.pos.models.DatabaseConnection;
import com.systechafrica.pos.posreviewed.pos.views.MainView;
import com.systechafrica.pos.posreviewed.pos.views.PaymentMenuView;
import com.systechafrica.pos.posreviewed.pos.views.ReceiptView;

public class PointsOfSaleApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DatabaseConnection databaseConnection = new DatabaseConnection();
    ItemController itemController = new ItemController(databaseConnection);
    LoginController loginController = new LoginController(scanner);
    ReceiptView receiptView = new ReceiptView();
    MainView mainView = new MainView(scanner);
    PaymentMenuView paymentMenuView = new PaymentMenuView();

    MainController mainController = new MainController(loginController, itemController, mainView, receiptView, scanner,
        paymentMenuView);
    mainController.startApplication();

    scanner.close();
    databaseConnection.closeConnection();
  }
}
