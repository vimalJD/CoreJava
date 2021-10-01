package vararg.rules;

class Employee {
}

class VarArgRules {

	// Rules #1
	// int... ia;
	void m2(int... ia) {
	}

	void m2(String... ia) {
	}

	void m2(Integer... ia) {
	}

	void m2(Thread... ia) {
	}

	void m2(Employee... ia) {
	}

	void m2(Object... ia) {
	}

	void m2(Class... ia) {
	}

	// Rules #2

	void m1(int... ia) {
	}

	/*
	 * void m1(int..ia) { }
	 * 
	 * void m1(int....ia) { }
	 */

	// Rules #3

	void m3(int... ia) {

	}

	void m4(int... ia) {

	}

	/*
	 * void m5(int ia...) {
	 * 
	 * }
	 */

	/*
	 * void m5(...int ia) {
	 * 
	 * }
	 */

	void m6(int... ia) {

	}

	// Rules #4

	void m7(int[]... ia) {
	}

	void m7(int[][]... ia) {
	}

	/*
	 * void m7(int...[]ia) { }
	 */

	/*
	 * void m7(int[]...[]ia) { }
	 */

	void m8(int[] ia[]) {

	}

	/*
	 * void m9(int[]ia...) {
	 * 
	 * }
	 */

	// Rule #5
	/*
	 * static void m10(int... ia, int a, int b) {
	 * 
	 * }
	 * 
	 * static void m10(int a, int... ia, int b) {
	 * 
	 * }
	 */
	static void m10(int a, int b, int... ia) {

		System.out.println("\na : " + a);
		System.out.println("b: " + b);
		System.out.println("ia: " + java.util.Arrays.toString(ia));

	}
	// m10(); m10(5); m10(5,6); m10(5,6,7); m10(5,6,7,8);

	// Rule #6
	/*
	 * static void m11(int... a, int... b) { }
	 */

	/*
	 * static void m11(int... a, string... b) { }
	 */

	// Rule #7
	static void m12() {
		System.out.println("no-param method");
	}

	static void m12(int a) {
		System.out.println("int-param-method");
	}

	static void m12(int... a) {
		System.out.println("int var-arg-method");
	}

	// m12(); m12(5); m12(5,6); m12(5,6,7);

	// Rule #8
	static void m13(int... a) {
		System.out.println("int var-arg-method");
	}

	static void m13(long... a) {
		System.out.println("long var-arg-method");
	}

	static void m13(float... a) {
		System.out.println("float var-arg-method");
	}
	// m13(5); m13(5L); m13(5F); m13(5,6);

	static void m14(int... a) {
		System.out.println("int var-arg-method");
	}

	static void m14(boolean... a) {
		System.out.println("boolean var-arg-method");
	}
	// m14(); m14(5); m14(true);

	// Rule #9
	static void m15(int... a) {
		System.out.println("int var-arg method");
	}

	static void m15(float... a) {
		System.out.println("float var-arg method");
	}
	// m15(); m15(5); m15(5L); m15(5F);

	// Rule #10
	static void m16(int a) {
		System.out.println("int param method");
	}

	static void m16(int... a) {
		System.out.println("int var-arg method");
	}
	// m16(); m16(5); m16(5,6); m16(new int[]{5});

	// Rule #11
	static void m17(int[] a) {
		System.out.println("int[] arg method");
	}

	static void m18(int... a) {
		System.out.println("int var-arg method");
	}

	// Rule #12
	static void m19(int[] a) {
		System.out.println("int[] arg method");
	}
	/*
	 * static void m19(int...a ) { System.out.println("int var-arg method"); }
	 */
	// Error because same method name

	public static void main(String[] args) {

		/*
		 * m10(); m10(5);
		 */
		m10(5, 6);
		// m10(5,6, new int[0]);
		m10(5, 6, 7);
//		m10(5,6, new int[] {7});
		m10(5, 6, 7, 8);
		//m10(5, 6, new int[] { 7, 8 });

		m12();
		m12(5);
		m12(5, 6);
		m12(5, 6, 7);

//		m13();
		m13(5);
		m13(5L);
		m13(5F);
		m13(5, 5F);
		m13(5, 5L, 5F);

//		m14();
		m14(5);
		m14(true);

		m15();
		// m15(new int[0]);
		m15(5);
		// m15(new int[] {5});
		m15(5L);
		// m15(new float[] {5.0f});

		m16(5);
		m16(new int[] { 5 });

//		m17();
//		m17(5);
		m17(new int[0]);
		m17(new int[] { 5 });
	}

}
