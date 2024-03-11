package com;


interface Person{
	void work();
}

class Doctor implements Person
{
	int id=101;
	@Override
	public void work() {
		System.out.println("Doctor is working");		
	}
}

class Engineer implements Person
{
	String  name="Tom";

	@Override
	public void work() {
		System.out.println("Engineer is working");		
	}	
}


public class Runner {

	//1.Person obj=new Doctor();  and  2.Person obj=new Engineer();

	static void display(Person obj)
	{
		if(obj instanceof Doctor)
		{
			Doctor d= (Doctor) obj;
			System.out.println(d.id);
		}

		else if(obj instanceof Engineer)
		{
			Engineer e=(Engineer) obj;
			System.out.println(e.name);
		}
	}

	public static void main(String[] args) {

		display(new Doctor());  //1
		display(new Engineer());
	}
}