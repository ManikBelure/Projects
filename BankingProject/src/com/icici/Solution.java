package com.icici;

import java.util.Scanner;

public class Solution {

	//scannner
	//upcasting 
	//while(true)
	//display the menu-> menu drive program 1:deposit Amount 2:withdraw Amount 3:Check balance 4:Exit
	//swith()-> case 1: 2 3  4 5

	public static void main(String[] args) {

		System.out.println("Welcome to ICICI Bank");
		Scanner scan=new Scanner(System.in);
		Bank bank=new BankImp1(5000);

		while(true)
		{
			System.out.println("1:deposit Amount\n2:withdraw Amount\n3:Check balance:");
			System.out.println("Enter choice:");
			int choice=scan.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter the amount to be deposit: ");
				int amounttodeposit =scan.nextInt();
				bank.deposit(amounttodeposit);//bank.deposit(scan.nextInt());
				break;

			case 2:
				System.out.println("Enter the amount to be withdraw: ");
				int amounttowithdraw =scan.nextInt();
				bank.withdraw(amounttowithdraw);//bank.deposit(scan.nextInt());
				break;

			case 3:
				System.out.println("Avalible balance : ");
				break;

			case 4:
				System.out.println("Thank you!! visit Again!!");
				System.exit(0);

			default:

			}

			System.out.println("======********========#####=======");
		}
	}
}
