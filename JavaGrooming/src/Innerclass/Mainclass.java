package Innerclass;

interface Amazon {
	
	void purchase(String product);
}

class Mainclass
{
	public static void main(String[] args) {
		
		//anonymous Inner class with reference variable
		Amazon amazon=new Amazon() {

			@Override
			public void purchase(String product) {
				System.out.println("purchase"+product);				
			}
		};
		amazon.purchase("Laptop");
		System.out.println("=============");

		
		//anonymous Inner class without reference variable
		new Amazon() {
			@Override
			public void purchase(String product) {
				System.out.println("purchase"+product);				
			}
		}.purchase("Mobile");;

	}
}



