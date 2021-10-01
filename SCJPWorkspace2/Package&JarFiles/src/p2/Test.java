package p2;

import p1.*;
import p1.p4.D;
import p3.*;

public class Test {

	public static void main(String[] args) {

//		A a= new A();

		p1.A a = new p1.A();
		p3.A a1 = new p3.A();
		
		B b = new B();
		C c1 = new C();
		C c2 = new C("abc");
		
		D d = new D();
	}
}
