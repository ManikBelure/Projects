package com;

import java.util.Scanner;

interface Beverage
{

}

class Coffee implements Beverage
{

}

class Tea implements Beverage
{

}

class company
{
	Beverage vendingMachine(int choice)
	{
		if(choice==1)
		{
			Coffee c=new Coffee();
			return c;    //return new Coffee();
		}

		if(choice==2)
		{
			Tea t=new Tea();
			return t;      //return new Tea();
		}
		else
		{
			return null;
		}
	}
}
public class Mainclass {

	public static void main(String[] args) {
		company c=new company();
		Scanner scan=new Scanner(System.in);


		System.out.println("Enter choice");
		int choice=scan.nextInt();

		Beverage obj=c.vendingMachine(choice);

		if(obj instanceof Coffee)
		{
			System.out.println("ordering Coffee");
		}

		if(obj instanceof Tea)
		{
			System.out.println("ordering Tea");
		}
		else
		{
			System.out.println("Invalid choice");
		}
	}
}