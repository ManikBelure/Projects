package COM.TY;

public class CalculatorImpl implements Calculator
{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}


	@Override
	public int div(int x, int y) {           //x=10  y=0
		if(x!=0 && y!=0)
		{
			return x/y;
		}
		return 0;
	}


	@Override
	public String displayErrorMessage() {
		// TODO Auto-generated method stub
		return "invalid choice!";
	}

}