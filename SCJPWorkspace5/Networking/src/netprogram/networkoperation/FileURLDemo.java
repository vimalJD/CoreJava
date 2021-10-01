package netprogram.networkoperation;

import java.io.File;
import java.io.InputStream;
import java.net.URL;

public class FileURLDemo {

	public static void main(String[] args) {
		
		try {

			File file = new File("H:\\SCJPWorkspace5\\Networking\\src\\netprogram\\networkoperation\\URLDemo.java");
			String filePath = "file:///"+file.getAbsolutePath();
			
			URL fileURL = new URL(filePath);
			
			InputStream in = fileURL.openStream();
			
			int data;
			
			while ((data=in.read())!=-1) {
				
				System.out.print((char)data);
			}
			in.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: "+e);
		}
		
	}
}
