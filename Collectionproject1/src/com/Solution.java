package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {

		//3 student objects
		//Map->LHM
		//->Generics ->key->id-><Integer> ->value->student objects-><student>
		//3 entries->put()

		Student s1=new Student("manik", 23);
		Student s2=new Student("sagar", 24);
		Student s3=new Student("vishal", 25);

		Map<Integer,Student> map=new LinkedHashMap<Integer,Student>();

		map.put(100, s1);//map.put(100,new Student("manik", 23));
		map.put(200, s2); //map.put(100,new Student("sagar", 24));
		map.put(300, s3); //map.put(100,new Student("vishal", 25));

		//Map into set of keys->keySet()
		//List and ArrayList->upcasting 
		//for each loop to traverse keys
		//get the value (student objects)
		//add it into ArrayList
		//print the student object(value)


		//converting Map into set of keys using keySet()
		Set<Integer> keys=map.keySet();

		//creating instance of ArrayList & storing into List  reference variable
		List<Student> list=new ArrayList<Student>();

		//traversing the keys
		for(int key :keys)
		{
			Student std = map.get(key);//getting the value (student objects)
			list.add(std);//adding the value (student objects) into ArrayList
			System.out.println(std);//printing the value (student objects)
		}
		System.out.println("==============================");

		//scanner
		//Display choice ->1:sort based on Age 2:sort based on Name
		//switch->case
		//Collection.sort(list,new  SortStudentByAge()); ->Display the object

		//scanner
		Scanner scan=new Scanner(System.in);

		//Display choice ->1:sort based on Age 2:sort based on Name
		System.out.println("1:sort based on Age\n2:sort based on Name");

		System.out.println("Enter the choice");
		int choice=scan.nextInt();

		//switch->case
		switch(choice)
		{
		case 1:
			Collections.sort(list, new  SortStudentByAge());
			for(Student s: list)
			{
				System.out.println(s);
			}
			break;

		case 2:
			Collections.sort(list, new  SortStudentByName());
			for(Student s: list)
			{
				System.out.println(s);
			}
			break;
		default:
			System.out.println("Invalid choice");

		}
	  }
	}