public class Calculator {

	public static void main(String[] args) {
		String operation=args[1];
		int a,b,c;
		a=4;
		b=2;
		switch(operation)
		{
		case "add":	
			c=a+b;
			System.out.println("Add: "+c);
			break;
		case "sub":	
			c=a-b;
			System.out.println("Subtract: "+c);
			break;
		case "mul":	
			c=a*b;
			System.out.println("Multiply: "+c);
			break;
		case "div":	
			c=a/b;
			System.out.println("Division: "+c);
			break;
		default:
			System.out.println("Invalid choice");
			break;
		}
	}
}
