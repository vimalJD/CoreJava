package collection.list.concreteclass;

public class Customer {

	String name;
	int age;
	Address address;

	public Customer(String name, int age, Address address) {

		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", H.no=" + address.hno + ", Street=" + address.street
				+ ", City=" + address.city + ", PH=" + address.ph + "]";
	}

}
