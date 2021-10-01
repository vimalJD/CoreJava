package file.objectcreation;

import java.io.File;
import java.io.FilenameFilter;

public class FilterListFiles {

	public static void main(String[] args) {
		
		String strDir = "../FileIO";
		
		File f = new File(strDir);
		
		FilenameFilter onlyFile = new FileExtention("txt");
		
		String strFile[] = f.list(onlyFile);
		
		System.out.println("\n The java files in the current directory are:\n");
		for (int i = 0; i < strFile.length; i++) {
			
			System.out.println(strFile[i]);
		}
	}
}
