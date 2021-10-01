package nonstaticmembers.classload.injvm;

public class A1 {

void m1() {
		
		B1 b1 = new B1();
		b1.m2(this);
	}
	
	void print(String msg) {
		
		System.out.println(msg);
	}
}
