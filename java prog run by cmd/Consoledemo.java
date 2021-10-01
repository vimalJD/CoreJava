import java.io.Console;

public class Consoledemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Console sysconsole = System.console();
		@SuppressWarnings("unused")
		String data = sysconsole.readLine("UserName :");
		System.out.println(data);
		
		char[] passwordData = sysconsole.readPassword("Enter Password :");
		String password = new String(passwordData);
		if(password.length()<8)
		{
			System.out.println("Invalid Password");
		}
		else{
		System.out.println("succesfully login");
		}
}

}
