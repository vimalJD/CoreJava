package map.concreteclasses;

public class Address implements java.io.Serializable{

	int hNo;
	int streetNo;
	String city;
	
	public Address(int hNo, int streetNo, String city) {
		
		this.hNo = hNo;
		this.streetNo = streetNo;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", streetNo=" + streetNo + ", city=" + city + "]";
	}
	
	
}
