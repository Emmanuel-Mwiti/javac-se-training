package com.systechafrica.part2.interfaces.simplebankingprogram.service;

import com.systechafrica.part2.interfaces.simplebankingprogram.model.Account;

public class SavingsAccount implements AccountService {
  private Account savingsAccount;

  public SavingsAccount(Account savingsAccount) {
    this.savingsAccount = savingsAccount;
  }

  @Override
  public double checkBalance(String accountNumber) {
    if (accountNumber.equals(savingsAccount.getAccountNumber())) {
      return savingsAccount.getBalance();
    } else {
      throw new IllegalArgumentException("Account not found!");
    }
  }

}
