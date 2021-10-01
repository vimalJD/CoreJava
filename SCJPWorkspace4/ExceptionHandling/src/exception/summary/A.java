package exception.summary;

public class A {

//	try
//	{
//	}catch(Exception e){
//		
//	}

	void m1() {
		try {
		} catch (Exception e) {

		}
	}

	void m2() {
//		try {}
	
	}

	void m3() {
	
//		catch(Exception e){
//			
//		}
	}

	void m4() {
//		finally {
//			
//		}
	}

	void m5() {
//		try {}
//		int a=10;
//		catch(Exception e){
//			
//		}
//		int b=20;
//		finally {
//			
//		}
	}

	void m6() {
		try {
		} catch (Exception e) {

		} 
//		catch (String s) {
//			// TODO: handle exception
//		}
	}

	void m7() {
		try {
		} catch (ArithmeticException e) {

		} 
//		catch (ArithmeticException e) {
//
//		}

		try {

		} catch (Exception e) {

		} 
//		catch (ArithmeticException e) {
//
//		}

	}

	void m8() {
		throw new ArithmeticException();
//		int a;
	}

	void m9() {

		if (true) {
			throw new ArithmeticException();
		}
		int a;
	}

	void m10() {

//		throw "a";
	}

//	void m11() throw ArithmeticException{
//		
//	}

	void m12() throws ArithmeticException {

	}

	void m13() {
//		throws ArithmeticException;
	}

//	void m14() throws String {
//
//	}

	void m15() {
//		throw new ClassNotFoundException();
	}

	void m16() {
//		try {
//
//		} 
//		catch (ClassNotFoundException cnfe) {
//			// TODO: handle exception
//		}
	}

	void m17() throws ClassNotFoundException {
		throw new ClassNotFoundException();
	}

	void m18() {

		try {
			throw new ClassNotFoundException();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

	}

	void m19() {

		try {
			Class.forName("A");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}

	}

	void m20() {

		try {

		} catch (ArithmeticException e) {
			// TODO: handle exception
		}

	}

	void m21() {

		try {

		} catch (ArithmeticException e) {
			// TODO: handle exception
		} 
//		catch (ClassNotFoundException e) {
//			// TODO: handle exception
//		} 
		catch (Exception e) {
			// TODO: handle exception
		}

	}

	void m22() {
//		throw new Exception();
	}
}
