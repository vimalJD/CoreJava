package nonstaticmembers;

public class CurrentObjUseThisVar {

	int x = 10;
	int y = 20;

	void m1(CurrentObjUseThisVar currentObjUseThisVar) {
		System.out.println("Passed object original value");
		System.out.println(x + "..." + y);
		x = 5;
		y = 6;

		System.out.println("Object values after modification");
		System.out.println(x + "..." + y);
	}

	public static void main(String[] args) {

		CurrentObjUseThisVar currentObjUseThisVar = new CurrentObjUseThisVar();

		CurrentObjUseThisVar currentObjUseThisVar2 = new CurrentObjUseThisVar();

		System.out.println("currentObjUseThisVar value before calling m2()method");
		System.out.println(currentObjUseThisVar.x + "..." + currentObjUseThisVar.y);

		currentObjUseThisVar.m1(currentObjUseThisVar2);

		System.out.println("currentObjUseThisVar2 value after calling m2()method");
		System.out.println(currentObjUseThisVar.x + "..." + currentObjUseThisVar.y);
	}

}
