package lambdaexperssions;

@FunctionalInterface
interface Person
{
	String display(int age);
}

class Tom implements Person{

	@Override
	public String display(int age) {
		return "Age: "+age;
	}
}

public class Test {

	public static void main(String[] args) {
		//1. subclass implementaion
		Tom t=new Tom();
		System.out.println(t.display(23));

		System.out.println("==============");
		

		//2. Anonymous inner class
		Person p=new Person() {

			@Override
			public String display(int age) {
				// TODO Auto-generated method stub
				return "Age: "+age;
			}
		};
		System.out.println(p.display(67));

		System.out.println("----------------------");
		

		//3. lambda experssion
		Person p1=(age)->{
			return "Age: "+age;
		};
		System.out.println(p1.display(34));
	}

}
