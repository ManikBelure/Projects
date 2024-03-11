package edbms;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//scanner 
		//upcasting 
		//while(true)
		//MENU DRIVEN PROGRAM->Display->1:add Employee 2:displayEmployee 3:displayAllEmployee 4:removeEmployee 5:removeAllEmployee 6:
		// updateEmployee 7:countEmployee 8:sortEmployee9:getEmployeeWithLowestMarks 10:getEmployeeWithHighestMarks 11:Exit
		//switch-> case 1:.....

		System.out.println("Welcom to Employee DB Management system");
		System.out.println("================================================");

		Scanner scan=new Scanner(System.in);
		EmployeeManagementSystem ems=new EmployeeManagementSystemImpl();

		while(true)
		{
			System.out.println("1:add Employee\n2:DisplayEmployee ");
			System.out.println("3:displayAllEmployee \n4:removeEmployee \n5:removeAllEmployee ");
			System.out.println("6:updateEmployee\n7:countEmployee\n8:sortEmployee");
			System.out.println("9:getEmployeeWithLowestMarks");
			System.out.println("10:getEmployeeWithHighestMarks");
			System.out.println("11:Exit\nEnter the choice");
			int choice=scan.nextInt();
		
			switch(choice)
			{
			case 1:
				ems.addEmployee();
				break;
			
			case 2:
				ems.displayEmployee();
				break;
				
			case 3:
				ems.displayAllEmployee();
				break;
				
			case 4:
				ems.removeEmployee();
				break;
				
			case 5:
				ems.removeAllEmployee();
				break;
				
			case 6:
				ems.updateEmployee();
				break;
				
			case 7:
				ems.countEmployee();
				break;
				
			case 8:
				ems.sortEmployee();
				break;
				
			case 9:
				ems.getEmployeeWithLowestMarks();
				break;
				
			case 10:
				ems.getEmployeeWithHighestMarks();
				break;
			case 11:
				System.out.println("Thank You");
				System.exit(choice);
			}
		}
	}
}