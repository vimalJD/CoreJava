
class LessBalanceException extends Exception
{
	public String message;
	public LessBalanceException(String msg)
	{
		super(msg);
		message=msg;
	}
}
public class Account {
	
	public static void main(String[] args) throws LessBalanceException {
		int bal=100;
		int amt=5000;
		if(amt>bal && bal<=1000)
			throw new LessBalanceException("Less balance");
		else
		{
			bal=bal-amt;
			System.out.println("Balance: "+bal);
		}
	}
}
