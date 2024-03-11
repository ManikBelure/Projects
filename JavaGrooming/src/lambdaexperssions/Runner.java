package lambdaexperssions;


@FunctionalInterface
interface Student
{
	String study();
}

public class Runner {

	public static void main(String[] args) {
      Student sc=()->{
    	  
		return "studying working";
      };
     System.out.println(sc.study());
      
	}
}
