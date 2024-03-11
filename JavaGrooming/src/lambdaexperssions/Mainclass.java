package lambdaexperssions;

@FunctionalInterface
interface Calculator
{
	void add(int a,int b);
}
public class Mainclass {

	public static void main(String[] args) {
		Calculator calc=(a,b)->{
			System.out.println("sum:"+(a+b));
		};
		calc.add(5,7);
	}

}
