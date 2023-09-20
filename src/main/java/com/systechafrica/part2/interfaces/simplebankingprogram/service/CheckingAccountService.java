package com.systechafrica.part2.interfaces.simplebankingprogram.service;

import com.systechafrica.part2.interfaces.simplebankingprogram.model.Account;

public class CheckingAccountService implements AccountService {
  private Account checkingAccount;

  public CheckingAccountService(Account checkingAccount) {
    this.checkingAccount = checkingAccount;
  }

  @Override
  public double checkBalance(String accountNumber) {
    if (accountNumber.equals(checkingAccount.getAccountNumber())) {
      return checkingAccount.getBalance();
    } else {
      throw new IllegalArgumentException("Account Not found!");
    }

  }

}
