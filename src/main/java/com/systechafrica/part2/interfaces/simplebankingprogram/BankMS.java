package com.systechafrica.part2.interfaces.simplebankingprogram;

import com.systechafrica.part2.interfaces.simplebankingprogram.controller.AccountController;
import com.systechafrica.part2.interfaces.simplebankingprogram.model.Account;
import com.systechafrica.part2.interfaces.simplebankingprogram.service.AccountService;
import com.systechafrica.part2.interfaces.simplebankingprogram.service.CheckingAccountService;
import com.systechafrica.part2.interfaces.simplebankingprogram.service.SavingsAccount;

public class BankMS {
  public static void main(String[] args) {
    // Create account instances
    Account savingsAccount = new Account("SAV-123", 1000.0);
    Account checkingAccount = new Account("CHK-456", 500.0);

    // Create service instances with corresponding accounts
    AccountService savingsAccountService = new SavingsAccount(savingsAccount);
    AccountService checkingAccountService = new CheckingAccountService(checkingAccount);

    // Create controller instances with the corresponding services
    AccountController savingsAccountController = new AccountController(savingsAccountService);
    AccountController checkingAccountController = new AccountController(checkingAccountService);

    // Check balances
    double savingsBalance = savingsAccountController.checkBalance("SAV-123");
    double checkingBalance = checkingAccountController.checkBalance("CHK-456");

    System.out.println("Savings Account Balance: $" + savingsBalance);
    System.out.println("Checking Account Balance: $" + checkingBalance);
  }
}
