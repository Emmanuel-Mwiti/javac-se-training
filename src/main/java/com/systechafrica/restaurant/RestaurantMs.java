package com.systechafrica.restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.systechafrica.constants.Constants;
import com.systechafrica.utils.ValidateInput;

public class RestaurantMs {

  Scanner scanner = new Scanner(System.in);
  private List<Drink> drinksList = new ArrayList<>();
  private List<Meal> mealsList = new ArrayList<>();

  public static void main(String[] args) throws InterruptedException {
    RestaurantMs app = new RestaurantMs();

    boolean loggedIn = app.login();

    if (loggedIn) {
      System.out.println("Successiful Login, Welcome to Systech restaurant MS");
      System.out.println("LOADING...");
      Thread.sleep(400);

      // the second step of adding the elements to the arrayList of class Meal and
      // Drink
      boolean keepAdding = true;
      while (keepAdding) {
        app.displayMainMenu();
        System.out.print("Enter your Meal/Drink option: ");
        int optionSelected = app.scanner.nextInt();
        app.scanner.nextLine();

        // Checking option to make sure between 1 and 6, if 7 quits. The add function
        // handles options 1 to 6
        if (optionSelected == 7) {
          return;
        } else if (optionSelected >= 1 && optionSelected <= 6) {
          app.addMealOrDrinkSelected(optionSelected);
        } else {
          System.out.println("Please select a valid option (1-7).");
        }

        System.out.print("Do you want to enter another Meal/Drink option? ");
        String enterAnotherMealOrDrink = app.scanner.nextLine();
        if (!enterAnotherMealOrDrink.equalsIgnoreCase("Y")) {
          keepAdding = false;
        }

      }

      // proceed to payment when no more items needed
      if (!app.mealsList.isEmpty() || !app.drinksList.isEmpty()) {
        System.out.print("Proceed to payment: ");
        String proceedToPayment = app.scanner.nextLine();
        if (proceedToPayment.equalsIgnoreCase("Y")) {
          app.displayPaymentMenu();
        } else {
          System.out.println("Payment process aborted.");
        }
      } else {
        System.out.println("No items selected. Exiting.");
      }

    } // ends the if LoggedIn condition
    else {
      System.err.println("Maximum login attempts reached, please try again later");
    }

  }

  public boolean login() {
    int loginEntries = 0;
    boolean loggedIn = false;

    while (loginEntries < 3) {
      System.out.print("Enter your password: ");
      String password = scanner.nextLine();
      // we first verify password to contain something
      if (ValidateInput.validate(password)) {
        if (password.equals(Constants.DEFAULT_PASSWORD)) {

          loggedIn = true;
          break;
        } else {
          System.out.println("Wrong password!");
          loginEntries++;
        }
      }

    }
    return loggedIn;

  }

  public void displayMainMenu() {
    System.out.println("______________________________");
    System.out.println("SYSTECH RESTAURANT       ");

    System.out.println("DRINKS");
    System.out.println("____________________\n");
    System.out.println("1. CHAI----------------------------------15");
    System.out.println("2. ANDAZI--------------------------------10");
    System.out.println("3. TOSTI---------------------------------12");

    System.out.println("MEALS");
    System.out.println("____________________\n");
    System.out.println("4. NDENGU AND ACCOMPLISHMENTS------------15");
    System.out.println("5. BEANS AND ACCOMPLISHMENTS-------------10");
    System.out.println("6. PILAU VEG-----------------------------12");

    System.out.println("7. QUIT");
  }

  public void addMealOrDrinkSelected(int option) {

    if (option == 1 || option == 2 || option == 3) {
      // here drinks option
      // System.out.println("Welcome to the drinks");
      switch (option) {
        case 1:
          drinksList.add(new Drink("Chai", 15));
          break;
        case 2:
          drinksList.add(new Drink("Andazi", 10));
          break;
        case 3:
          drinksList.add(new Drink("Tosti", 12));
          break;
      }
    } else if (option == 4 || option == 5 || option == 6) {
      // here meals option
      // System.out.println("Welcome to the meals");
      switch (option) {
        case 4:
          mealsList.add(new Meal("Ndengu And Accomplishments", 70));
          break;
        case 5:
          mealsList.add(new Meal("Beans And Accomplishments", 70));
          break;
        case 6:
          mealsList.add(new Meal("Pilau And Vegs", 90));
          break;
      }
    } else {
      System.out.println("Please select a valid option! Should be between 1 and 6");
    }
  }

  public void displayPaymentMenu() {

    double total = 0.0;
    System.out.println("Pay Now For:");

    if (!drinksList.isEmpty()) {
      for (Drink drink : drinksList) {

        System.out.print(drink.getName() + "------------------" + drink.getPrice());
        total += drink.getPrice();
      }
      System.out.println();
    }

    if (!mealsList.isEmpty()) {
      for (Meal meal : mealsList) {
        System.out.print(meal.getName() + "------------------" + meal.getPrice());
        total += meal.getPrice();
      }
      System.out.println();
    }
    System.out.println("*******************************");
    System.out.println("Total------------------" + total);
    System.out.println("*******************************");

    System.out.print("Enter amount to pay: ");
    double amountToPay = scanner.nextDouble();
    scanner.nextLine();
    if (ValidateInput.validateAmountPaidIsGreaterThanBilled(total, amountToPay)) {
      double change = amountToPay - total;
      System.out.println("Your balance is:---------------" + change);
      System.out.println("*******************************");
    }

  }
}
