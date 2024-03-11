package sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import Customexception.InvalidChoiceException;
import Customexception.StudentNotFoundException;
import Customsorting.SortStudentByAge;
import Customsorting.SortStudentById;
import Customsorting.SortStudentByMarks;
import Customsorting.SortStudentByName;

public class StudentManagementSystemImp1 implements StudentManagementSystem {

	//scaner
	//Map db=new LHM
	//<String, Student>

	Scanner scan=new Scanner(System.in); 
	Map<String,Student> db=new LinkedHashMap<String,Student>();


	@Override
	public void addstudent() {
		//Accept age,name&marks
		//create a student objects into db-> put() ->id,std
		//add the student object into db->put() ->id,std
		//print the std id

		System.out.println("Enter the student Age");
		int age=scan.nextInt();
		System.out.println("Enter the student Name");
		String name=scan.next();
		System.out.println("Enter the student Marks");
		int marks=scan.nextInt();

		Student std=new Student(age, name, marks);
		db.put(std.getId(),std);
		System.out.println("Student Record Inserted Successfully");
		System.out.println("Student Id is "+std.getId());
	}

	//*************************************************************

	@Override
	public void displaystudent() {
		//Accept the id
		//toUpperCase()
		//check if id is there or not ->containskey()
		//if Id(key) is there ->get the value(student object)->getAge() getName() getMarks()
		//else
		//customexception->studentNotFoundException//invoke throw 

		System.out.println("Enter the student id");
		String id=scan.next(); //String id=scan.next().toUpperCase();
		id=id.toUpperCase();

		if(db.containsKey(id))
		{
			Student std=db.get(id);
			System.out.println("Id: "+std.getId());
			System.out.println("Age: "+std.getAge());
			System.out.println("Name: "+std.getName());
			System.out.println("Marks: "+std.getMarks());
			//System.out.println(std);->printing ref var as toString() is Overridden
		}
		//else
		//customexception->studentNotFoundException//invoke throw 
		else 
		{
			try
			{
				String message="student with id"+id+"is not found!";
				throw new StudentNotFoundException(message);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	//**************************************************

	@Override
	public void displayAllstudents() {
		//Map into Set ->keySet()
		//for each loop to traverse keys 
		//db.get(key) ->getting value (student object)->print reference

		if(db.size()!=0)
		{
			Set<String> keys=db.keySet();
			for(String key:keys)
			{
				Student value=db.get(key);
				System.out.println(value);// System.out.println(db.get(keys));
			}
		}
		else
		{
			try
			{
				String message="student Record Not Available to Display";
				throw new StudentNotFoundException(message);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	//*****************************************************

	@Override
	public void removestudents() {
		//Accept Id & toUppercase
		//if id is present->remove(id)
		//StudentNotFoundException

		System.out.println("Enter Student id: ");
		String id=scan.next().toUpperCase();

		if(db.containsKey(id))
		{
			System.out.println("Student records found!");
			System.out.println(db.get(id)); //printing Student object
			db.remove(id);
			System.out.println("Student record deleted successfully!");
		}
		else
		{
			try
			{
				String message="Student with the id"+ id +"is not found!";
				throw new StudentNotFoundException(message);
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());	
			}
		}
	}
	//***********************************************************

	@Override
	public void removeAllstudents() {
		if(db.size()!=0)
		{
			System.out.println("student Record  Available:"+db.size());
			db.clear();
			System.out.println("All student Records Deleted successfully");
			System.out.println("stiudent Record Available:"+db.size());
		}
		else
			try{
				String message="student DataBase is Empty!";
				throw new StudentNotFoundException(message);
			}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	//*************************************************

	@Override
	public void updatestudent() {
		//Accept Id & uppercase
		//if id is present get the value(student object)
		//Display 1: update Age 2: 3:default: setAge(), setName()....
		//switch
		//else->SNFE

		System.out.println("Enter Student Id");
		String id=scan.next().toUpperCase();
		if(db.containsKey(id))
		{
			Student std=db.get(id);

			System.out.println("1:Update Age\n2:update name\n3:update Marks");
			System.out.println("Enter Your choice:");
			int choice=scan.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter age:");
				int age=scan.nextInt();
				std.setAge(age); //std.setAge(scan.nextInt());
				break;

			case 2:
				System.out.println("Enter Name:");
				String name=scan.next();
				std.setName(name); //std.setName(scan.next());
				break;

			case 3:
				System.out.println("Enter Marks:");
				int marks=scan.nextInt();
				std.setMarks(marks); //std.setMarks(scan.nextdouble());
				break;

			default :
				try 
				{
					String message="invalid choice, Enter valid choice";
					throw new InvalidChoiceException(message);
				}
				catch (Exception e) 
				{
					System.out.println(e.getMessage());
				}
			}
		}
		else
		{
			try {
				String message="Student with the id"+id+ "is not Found!";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}


	//***************************************************

	@Override
	public void countstudent() {

		System.out.println("No of student Records :"+db.size());
	}

	//******************************************************

	@Override
	public void sortstudents() {
		//Map(db) into set->keys
		//List of ArrayList
		//for each->Traverse keys-> get the value(Student object) &
		//add it into list

		if(db.size()>=2) {
			Set<String> keys=db.keySet();
			List<Student> list =new ArrayList<Student>();
			for(String key:keys) 
			{
				list.add(db.get(key));
			}

			// display -> SSBI, SSBN, SSBM
			//switch ->Collections.sort(list, new sortStudentById)
			//for each loop
			System.out.println("1:SortStudentById\n2:SortStudentByAge\n3:SortStudentByName");
			System.out.println("4:SortStudentByMarks\nEnter choice");
			int choice = scan.nextInt();

			switch(choice)
			{
			case 1:
				Collections.sort(list,new SortStudentById());
				for(Student s:list)
				{
					System.out.println(s);
				}
				break;

			case 2:
				Collections.sort(list,new SortStudentByAge());
				for(Student s:list)
				{
					System.out.println(s);
				}
				break;

			case 3:
				Collections.sort(list,new SortStudentByName());
				for(Student s:list)
				{
					System.out.println(s);
				}
				break;

			case 4:
				Collections.sort(list,new SortStudentByMarks());
				for(Student s:list)
				{
					System.out.println(s);
				}
				break;

			default:
				try {
					String message = "Invali choice, Enter valid choice";
					throw new InvalidChoiceException("Invalid choice");
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
			}
		}

		else
		{
			try {
				String message="No sufficient student objects to compare ";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	private static void display(List<Student> list)
	{
		for(Student s:list)
		{
			System.out.println(s);
		}
	}

	//**************************************************

	@Override
	public void getstudentWithLowestMarks() {
		//map into set
		//List ->al
		//For each -> get values and add into al
		//collections.sort(list, marks)
		//sop(list.get(0));

		if(db.size()>=2) {
			Set<String> keys=db.keySet();
			List<Student> list=new ArrayList<Student>();
			for(String key:keys)
			{
				list.add(db.get(key));
			}
			Collections.sort(list, new SortStudentByMarks());	
			System.out.println(list.get(0));
		}

		else
		{
			try {
				String message="No sufficient student objects to compare ";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

   //*****************************************
	
	@Override
	public void getstudentWithHighestMarks() {
		//map into set
		//List ->al
		//For each -> get values and add into al
		//collections.sort(list, marks)
		//sop(list.get.size());
		
		if(db.size()>=2) {
			Set<String> keys=db.keySet();
			List<Student> list=new ArrayList<Student>();
			for(String key:keys)
			{
				list.add(db.get(key));
			}
			Collections.sort(list, new SortStudentByMarks());	
			System.out.println(list.get(list.size()-1));
		}
		else
		{
			try {
				String message="No sufficient student objects to compare ";
				throw new StudentNotFoundException(message);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
