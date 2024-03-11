package com;

public class Employee {
	String id;
	String name;

	static int count=101;
	Employee( String name)
	{
		this.id="JSP"+count;
		this.name=name;
		count++;
	}

	public static void main(String[] args) {
		Employee e1=new Employee("manik");
		System.out.println(e1.id+" : "+e1.name);

		Employee e2=new Employee("sagar");
		System.out.println(e2.id+" : "+e2.name);

		Employee e3=new Employee("sagar");
		System.out.println(e3.id+" : "+e3.name);
	}
}
