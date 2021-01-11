package com.cg.BankAccount.DAOIMPL;

import com.cg.BankAccount.DAO.AccountDAO;
import com.cg.BankAccount.domain.Account;

public class AccountDAOIMPL implements AccountDAO {
	
	Account account=new Account();
	@Override
	public void deposit(double amount)
	{
	       account.setBalance(amount);
	}
	@Override
	public void withdraw(double amount)
	{
		
	}
	@Override
	public double getBalance()
	{
		return getBalance();
	}

}
