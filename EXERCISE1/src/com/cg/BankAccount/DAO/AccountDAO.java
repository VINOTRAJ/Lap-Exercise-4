package com.cg.BankAccount.DAO;

public  interface AccountDAO {
	
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
	

}
