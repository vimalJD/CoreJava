package nonstaticmembers;

public class ArgumentObjUseParaValue {

	int x = 10;
	int y = 20;

	void m1(ArgumentObjUseParaValue argumentObjUseParaValue) {
		System.out.println("Passed object original value");
		System.out.println(argumentObjUseParaValue.x + "..." + argumentObjUseParaValue.y);

		argumentObjUseParaValue.x = 5;
		argumentObjUseParaValue.y = 6;

		System.out.println("Object values after modification");
		System.out.println(argumentObjUseParaValue.x + "..." + argumentObjUseParaValue.y);
	}

	public static void main(String[] args) {

		ArgumentObjUseParaValue argumentObjUseParaValue = new ArgumentObjUseParaValue();

		ArgumentObjUseParaValue argumentObjUseParaValue2 = new ArgumentObjUseParaValue();

		System.out.println("currentObjUseThisVar2 value before calling m2()method");
		System.out.println(argumentObjUseParaValue2.x + "..." + argumentObjUseParaValue2.y);

		argumentObjUseParaValue.m1(argumentObjUseParaValue2);

		System.out.println("currentObjUseThisVar2 value after calling m2()method");
		System.out.println(argumentObjUseParaValue2.x + "..." + argumentObjUseParaValue2.y);
	}
}
