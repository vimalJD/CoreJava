package enumeration;

public enum Month1 {

	JAN(1), FEB(2);

	private int num;

	Month1(int num) {

		this.num = num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
}
