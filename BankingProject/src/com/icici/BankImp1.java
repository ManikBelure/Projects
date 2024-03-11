package com.icici;

public class BankImp1 implements Bank{

	int balance;
	BankImp1(int balance)
	{
		this.balance=balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Deposite Rs:");
		balance=balance+amount; //balance+=amount
		System.out.println("Amount Deposited Successfully");
	}

	
	@Override
	public void withdraw(int amount) {

		if(amount<=balance)
		{
			System.out.println("withdraw Rs.");
			balance-=amount; //balance=balance-amount;
			System.out.println("Amount withdraw");
		}
		else
		{
			try 
			{
				throw new InsufficienentBalanceException("insufficient balance");
			} 
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	
	@Override
	public int getBalance() {
		return balance;
	}

}
