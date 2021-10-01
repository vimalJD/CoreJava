package file.readwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException{

		FileInputStream fis = new FileInputStream("test.txt");

		int i;
		while ((i = fis.read()) != -1) {

			System.out.print(i + " ... ");
	
			System.out.println((char) i);
		}
	}
}
