package nonstaticmembers;

public class MoreThanOneReferenceVariable {

	int x = 10;
	int y = 20;

	public static void main(String[] args) {

		MoreThanOneReferenceVariable moreThanOneReferenceVariable = new MoreThanOneReferenceVariable();
		MoreThanOneReferenceVariable moreThanOneReferenceVariable2 = new MoreThanOneReferenceVariable();
		MoreThanOneReferenceVariable moreThanOneReferenceVariable3 = moreThanOneReferenceVariable2;

		moreThanOneReferenceVariable2.x = 70;
		moreThanOneReferenceVariable2.y = 80;

		System.out.println(moreThanOneReferenceVariable.x + "..." + moreThanOneReferenceVariable.y);
		System.out.println(moreThanOneReferenceVariable2.x + "..." + moreThanOneReferenceVariable2.y);
		System.out.println(moreThanOneReferenceVariable3.x + "..." + moreThanOneReferenceVariable3.y);
	}
}
