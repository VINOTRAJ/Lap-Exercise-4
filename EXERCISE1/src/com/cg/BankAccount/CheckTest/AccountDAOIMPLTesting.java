package com.cg.BankAccount.CheckTest;

import com.cg.BankAccount.DAO.AccountDAO;
import com.cg.BankAccount.DAOIMPL.AccountDAOIMPL;
import com.cg.BankAccount.domain.Account;
import com.cg.BankAccount.domain.Person;

public class AccountDAOIMPLTesting {
	
	public static void main(String[] args)
	{
		/** if we check use it*/
		Account acc=new Account();
		Person person=new Person();
		
		AccountDAOIMPL acc2=new AccountDAOIMPL();
		acc.setAccNum(56);
		acc.setBalance(500);
		person.setName("Vino");
		person.setAge(13);
		 System.out.println("Holder Name: "+person.getName()); 
		  System.out.println("Age "+person.getAge());
		  System.out.println(person.getName()+" account number is "+acc.getAccNum());
		  System.out.println("Your available Amount "+acc.getBalance()); 
		
	}

}
