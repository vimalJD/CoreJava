package nonstaticmembers;

public class PassingObjReference {

	int x = 10;
	int y = 20;

	void m1(PassingObjReference passingObjReference) {

		System.out.println("\tpassingObjReference : " + passingObjReference);

		int x = 30;
		int y = 40;

		passingObjReference = new PassingObjReference();
		
		//value same because it is local variables not assign to parameter variable
		System.out.println("\tpassingObjReference : " + passingObjReference.x);
		System.out.println("\tpassingObjReference : " + passingObjReference.y);
	}

	@Override
	public String toString() {
		return "PassingObjReference [x=" + x + ", y=" + y + "]";
	}

	public static void main(String[] args) {

		PassingObjReference passingObjReference1 = new PassingObjReference();

		PassingObjReference passingObjReference2 = new PassingObjReference();

		System.out.println("passingObjReference2 : " + passingObjReference2);

		passingObjReference1.m1(passingObjReference2);

		System.out.println("passingObjReference2 : " + passingObjReference2);
	}
}
