//package problem_statement1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDemo {

	File f;
	String fName, path, absolutePath;
	long size;

	public FileDemo() throws IOException {
		f = new File("myFile.txt");
		
		if (f.exists() == true) {
			
			String str = "Java is platform independent language";
			Writer wr = new FileWriter(f);
			wr.write(str);
			wr.close();
			System.out.println("file exits");
		}

		else {
			
			String str = "Java is platform independent language";
			Writer wr = new FileWriter(f);
			wr.write(str);
			wr.close();
			f.createNewFile();// create throw exception massage if we do not throw exception
			System.out.println("file does not exits");
		}
		System.out.println("file name is : " + f.getName());
		System.out.println("path is : " + f.getPath());
		System.out.println("Absolute path is : " + f.getAbsolutePath());

		if (f.canRead() == true) {
			System.out.println("you can read file");
		}

		if (f.canWrite() == true) {
			System.out.println("you can write in file");
		}

		if (f.isAbsolute() == true) {
			System.out.println("file has absolute path");
		}

		size = f.length();
		System.out.println("file length is : " + size);
	}

	public static void main(String[] args) throws IOException {
		FileDemo fd = new FileDemo();
		
		StringBuffer sb = new StringBuffer("Java is platform independent language");

		System.out.println("\n"+sb+"\nAbove contents must be there in text file");
	}

}
