package Innerclass;

abstract  class Person
{
	abstract  void walk();
}

class Tom extends Person
{
	@Override
	void walk()
	{
		System.out.println("walking");	
	}
}

public class Solution
{
	public static void main(String[] args) {

		//by having explicit subclass
		Tom t=new Tom();
		t.walk();
		System.out.println("===============");


		//Anonymous Inner class
		Person p=new Person() {

			void walk()
			{
				System.out.println("walking");
			}
		};
		p.walk();
	}

}









