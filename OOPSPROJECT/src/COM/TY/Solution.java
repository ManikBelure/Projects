package COM.TY;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		//scanner
		Scanner scan=new Scanner(System.in);

		//calculator calculatorimp1->abstraion->upcasting
		Calculator calc=new CalculatorImpl();
        while(true)
        {
		System.out.println("1:Addition\n2:Subtraction\n3:multiplication");
		System.out.println("4:division\n5:Exit\nEnter choice:");
		int choice=scan.nextInt();

		int a=0;
		int b=0;

		if(choice>=1 && choice<=4)
		{
			System.out.println("Enter 2 Numbers:");
			a=scan.nextInt();
			b=scan.nextInt();
		}
		
		switch (choice) {

		case 1:
			System.out.println("sum of "+a+" & "+b+" is "+calc.add(a, b));
			break;

		case 2:
			System.out.println("Difference of "+a+" & "+b+" is "+calc.sub(a, b));
			break;

		case 3:
			System.out.println("Product of "+a+" & "+b+" is "+calc.mul(a, b));
			break;

			
		case 4:
			int result=calc.div(a, b);
			if(result!=0)
			{
				System.out.println("Division of"+a+"&"+b+"is"+result);
			}
			else
			{
				System.out.println("cannot perform Division");
			}
			System.out.println("Division of "+a+" & "+b+" is "+calc.div(a, b));
			break;
			
			
		case 5:
			System.out.println("Thank you");
			System.exit(0);
		default:
			System.out.println("calc.displayErrorMessage()");
		}
	   }
	}
}