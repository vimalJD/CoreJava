package localpreference;

public class AssignStaticVarLocalAndPara {

	static int a = 10;

	public static void main(String[] args) {
		int a = 50;
//		a = a;

		AssignStaticVarLocalAndPara.a = a;
		System.out.println(a);
		System.out.println(AssignStaticVarLocalAndPara.a);
	}
}
