package fun.cloneable.objinstance;

public class Address1 implements Cloneable {

	int flatNo = 192;
	String colony = "G_Temple";
	String city = "Valsad";
	
	@Override
	public Address1 clone() throws CloneNotSupportedException {
		
		return (Address1) super.clone();
	}
}
