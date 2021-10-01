package wrapper.classes;

public class AutoboxingAutoUnboxing {

	public static void main(String[] args) {
		
		Integer io1 = new Integer(10);
		Integer io2 = 10;
		
		int a=new Integer(10);
		int b =io2;
		
//		Double d1 =10;
		Double d1 =(double) 10;
		
//		Integer io3 = 'a';
		Integer io3 = (int) 'a';
		
		Byte b1 = 10;
//		Byte b2=128;
		
		Character ch1=97;
//		Character ch3=(Character)97;
		Character ch2 ='a';
		
		Double d2 =40.43;
//		Integer io4 =d2;
//		int c=d2;
	}
}
