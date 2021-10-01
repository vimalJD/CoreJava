package annonymous.innerclasses;

class B {

	static A a1 = new A() {
	};

	A a2 = new A() {
	};

	static void m1() {

		A a3 = new A() {
		};
	}

	void m3() {
		A a4 = new A() {
		};
	}

	void m4(A a) {
	}
	
	public static void main(String[] args) {
		
		A a5=new A() {};
		
		new A() {};
		
//		m4();
		
//		m4(new A() {});
	}
}
