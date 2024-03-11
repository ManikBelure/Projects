package com.icici;

public interface Bank {
	
	
   void deposit(int amount);
   void withdraw(int amount);
   int getBalance();
}
//BankImp1->is-a->Bank ->balance->override 3 methodes->public