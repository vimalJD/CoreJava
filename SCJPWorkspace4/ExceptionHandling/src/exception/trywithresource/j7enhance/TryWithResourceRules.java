package exception.trywithresource.j7enhance;

import java.io.*;

public class TryWithResourceRules {

	public static void main(String[] args) {
		
		
//		try("a"){};
		
		PrintWriter pw;
//		try(pw=new PrintWriter(System.out)){}
		
//		try(PrintWriter pw=new PrintWriter(System.out)){}
		
		try(FileWriter fw = new FileWriter("abc.txt")){
			
		} 
		catch (FileNotFoundException fnfe) {
//			// TODO Auto-generated catch block
//			fnfe.printStackTrace();
		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		
//		try(PrintWriter pw100){}

	}
}
