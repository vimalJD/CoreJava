package p1;

public class C{
	
	private C(){
		System.out.println("C no-arg Constructor");
	}

	public C(String s){
		
		System.out.println("C String Constructor");
	}	


	public void m1(){
		
		System.out.println("C m1");
	}
}