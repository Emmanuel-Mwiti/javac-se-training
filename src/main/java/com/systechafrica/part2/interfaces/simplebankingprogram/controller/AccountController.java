package com.systechafrica.part2.interfaces.simplebankingprogram.controller;

import com.systechafrica.part2.interfaces.simplebankingprogram.service.AccountService;

public class AccountController {
  private AccountService accountService;

  public AccountController(AccountService accountService) {
    this.accountService = accountService;
  }

  public double checkBalance(String accountNumber) {
    return accountService.checkBalance(accountNumber);
  }
}
