package nonstaticmembers.classload.injvm;

public class B {

	//in case 2
	A a;
	void m2(A a) {
		
		this.a=a;
		
		//in case 1
//		a.print(msg);
	}
	
	//in case 2
	void m3(String masg) {
	//a.print(msg);
	}
}
