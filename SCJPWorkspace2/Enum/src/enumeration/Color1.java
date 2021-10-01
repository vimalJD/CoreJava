package enumeration;

enum Color1 {

	// Rule: To define enum only with Non static members
	// it must start with ";" to tell compiler it is not Named member

	/*;
	int a = 10;*/

	JAN,FEB(2),MARCH("3"),APR('a');
//	MAY(5L)
	Color1() {
		// TODO Auto-generated constructor stub
	}
	Color1(int x) {
		// TODO Auto-generated constructor stub
	}
	
	Color1(String s){
		
	}
}
