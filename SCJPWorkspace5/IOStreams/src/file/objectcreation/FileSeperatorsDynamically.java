package file.objectcreation;

import java.io.File;

public class FileSeperatorsDynamically {

	public static void main(String[] args) {

		String fs = File.separator;

		File f = new File("G:" + fs + "SCJPWorkspace" + fs + "FileIO" + fs + "abc.txt");
		System.out.println("f: " + f);
	}
}
