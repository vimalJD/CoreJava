package referencetypeconversion;

public class ReferenceTypeConversion {

	public static void main(String[] args) {
		
		Object object1 = new Object();
		Object object2 = new A();
		Object object3 = new B();
		Object object4 = new C();
		Object object5 = new D();
		
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		
		//error because of d reference object is sibling of Object class
		//A a4 = new D();
		
		//error because of super class object reference can not be assigned to
		//sub class reference variable.
		//B b1 = new A();
		B b2 = new B();
		B b3 = new C();
		//error because of d reference object is sibling of Object class
		//B b4 = new D();
	}
}
