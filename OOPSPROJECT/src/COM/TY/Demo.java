package COM.TY;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter choice:");
			int choice=scan.nextInt();
			switch(choice)
			 {
			 case 1:
				 System.out.println("Hi Tom");
				 break;
				 
			 case 2:
				 System.out.println("Hi Jeery");
				 break;
				 
			 case 3:
				 System.out.println("Thank you ");
				 System.exit(0);       //Terminate the JVM(program)
				 
		     default:
					 System.out.println("Bye");
			 }
			 System.out.println("====================");
		}

	}

}
