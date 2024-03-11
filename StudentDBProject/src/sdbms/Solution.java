package sdbms;

import java.util.Scanner;

import Customexception.InvalidChoiceException;

public class Solution {

	public static void main(String[] args) {
		//scanner 
		//upcasting 
		//while(true)
		//MENU DRIVEN PROGRAM->Display->1:add student 2:displaystudent 3:displayAllstudents 4:removestudents 5:removeAllstudents 6:
		// updatestudent 7:countstudent 8:sortstudents 9:getstudentWithLowestMarks 10:getstudentWithHighestMarks 11:Exit
		//swith-> case 1:.....

		System.out.println("Welcom to student DB Management system");
		System.out.println("================================================");
		
		Scanner scan=new Scanner(System.in);
		StudentManagementSystem sms=new StudentManagementSystemImp1();

		while(true)
		{
			System.out.println("1:add student\n2:Displaystudent");
			System.out.println("3:displayAllstudents\n4:removestudents\n5:removeAllstudents");
			System.out.println("6:updatestudent\n7:countstudent\n8:sortstudents");
			System.out.println("9:getstudentWithLowestMarks");
			System.out.println("10:getstudentWithHighestMarks");
			System.out.println("11:Exit\nEnter the choice");
			int choice=scan.nextInt();
			switch(choice)
			{
			case 1:
				sms.addstudent();
				break;

			case 2:
				sms.displaystudent();;
				break;

			case 3:
				sms.displayAllstudents();
				break;

			case 4:
				sms.removestudents();
				break;

			case 5:
				sms.removeAllstudents();
				break;

			case 6:
				sms.updatestudent();
				break;

			case 7:
				sms.countstudent();
				break;

			case 8:
				sms.sortstudents();
				break;

			case 9:
				sms.getstudentWithLowestMarks();
				break;

			case 10:
				sms.getstudentWithHighestMarks();
				break;

			case 11:
				System.out.println("Thank You!..");
				System.exit(0);

			default:
				try {
					throw new InvalidChoiceException("Invalid choice,Enter valid choice!");
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}//end of swith

			System.out.println("***************************8");

		}//end of while loop

	}//end of main()

}//end of class
