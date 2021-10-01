package nonstaticmembers;

public class SameObjAsCurrentAndArgObj {

	int x;
	int y;

	void m1(SameObjAsCurrentAndArgObj sameObjAsCurrentAmdArguObj) {

		x = x + 1;
		y = y + 2;

		sameObjAsCurrentAmdArguObj.x = sameObjAsCurrentAmdArguObj.x + 3;
		sameObjAsCurrentAmdArguObj.y = sameObjAsCurrentAmdArguObj.y + 4;
		System.out.println();
	}

	public static void main(String[] args) {

		SameObjAsCurrentAndArgObj sameObjAsCurrentAmdArguObj = new SameObjAsCurrentAndArgObj();
		SameObjAsCurrentAndArgObj sameObjAsCurrentAmdArguObj2 = new SameObjAsCurrentAndArgObj();

		sameObjAsCurrentAmdArguObj.m1(sameObjAsCurrentAmdArguObj2);
		System.out.println(sameObjAsCurrentAmdArguObj.x + "..." + sameObjAsCurrentAmdArguObj.y);
		System.out.println(sameObjAsCurrentAmdArguObj2.x + "..." + sameObjAsCurrentAmdArguObj2.y);

		sameObjAsCurrentAmdArguObj2.m1(sameObjAsCurrentAmdArguObj);
		System.out.println(sameObjAsCurrentAmdArguObj.x + "..." + sameObjAsCurrentAmdArguObj.y);
		System.out.println(sameObjAsCurrentAmdArguObj2.x + "..." + sameObjAsCurrentAmdArguObj2.y);

		sameObjAsCurrentAmdArguObj.m1(sameObjAsCurrentAmdArguObj);
		System.out.println(sameObjAsCurrentAmdArguObj.x + "..." + sameObjAsCurrentAmdArguObj.y);
		System.out.println(sameObjAsCurrentAmdArguObj2.x + "..." + sameObjAsCurrentAmdArguObj2.y);

		sameObjAsCurrentAmdArguObj2.m1(sameObjAsCurrentAmdArguObj2);
		System.out.println(sameObjAsCurrentAmdArguObj.x + "..." + sameObjAsCurrentAmdArguObj.y);
		System.out.println(sameObjAsCurrentAmdArguObj2.x + "..." + sameObjAsCurrentAmdArguObj2.y);
		
	}
}
