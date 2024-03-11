package lambdaexperssions;

@FunctionalInterface
interface Employee
{
	void work();
}

public class Solution {

	public static void main(String[] args) {
    Employee emp=()->{
    	System.out.println("working");
    };
    emp.work();
	}
}