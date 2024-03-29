package com;

import java.util.Scanner;

interface Food
{

}

class Idly implements Food
{

}

class Poori implements Food
{

}

class Dosa implements Food
{

}

class Hotel {
	Food orderFood(int choice)
	{
		if(choice==1)
		{
			Idly i=new Idly();
			return i;       //return new Idly();
		}

		if(choice==2)
		{
			Poori p=new Poori();
			return p;      //return new Poori();
		}

		if(choice==3)
		{
			Dosa d=new Dosa();
			return d;      //return new Dosa();
		}
		else
		{
			return null;
		}
	}
}


public class Solution {

	public static void main(String[] args) {

		Hotel hotel=new Hotel();

		/**
		 * Generalization or Upcasting
		 * Food obj=hotel.orderFood(1); ->Food obj=new Idly();
		 * Food obj=hotel.orderFood(2); ->Food obj=new Poori();
		 * Food obj=hotel.orderFood(3); ->Food obj=new Dosa();
		 * Food obj=hotel.orderFood(200); ->Food obj=null;
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter choice");
		int choice=scan.nextInt();

		Food obj=hotel.orderFood(choice);
		if(obj instanceof Idly)
		{
			System.out.println("ordering Idly");
		}

		if(obj instanceof Poori)
		{
			System.out.println("ordering poori");
		}

		if(obj instanceof Dosa)
		{
			System.out.println("ordering Dosa");
		}	
		else
		{
			System.out.println("Invalid choice");
		}
	}
}
