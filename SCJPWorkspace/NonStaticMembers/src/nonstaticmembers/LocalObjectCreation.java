package nonstaticmembers;

public class LocalObjectCreation {

	int x = 10;
	int y = 20;

	void m1() {

		LocalObjectCreation localObjectCreation1 = new LocalObjectCreation();
		localObjectCreation1.x = 50;
		localObjectCreation1.y = 60;
	}

	public static void main(String[] args) {

		LocalObjectCreation localObjectCreation2 = new LocalObjectCreation();

		System.out.println(localObjectCreation2.x + "....." + localObjectCreation2.y);

		localObjectCreation2.m1();

		System.out.println(localObjectCreation2.x + "....." + localObjectCreation2.y);
	}
}
