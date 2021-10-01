public class DivisionDemo {
	
	public static void div(int a,int b) throws ArithmeticException
	{
		int res=a/b;
		System.out.println("Result: "+res);
	}
	public static void main(String[] args) {
		try{
			int no1=Integer.parseInt(args[0]);
			int no2=Integer.parseInt(args[1]);
			div(no1,no2);
		}
		catch(ArithmeticException a)
		{
			a.printStackTrace();
		}
	}

}
