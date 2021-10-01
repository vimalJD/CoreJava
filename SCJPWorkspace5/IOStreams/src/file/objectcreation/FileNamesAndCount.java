package file.objectcreation;
//program has NPE is found
import java.io.File;

public class FileNamesAndCount {

	static int dirCount;
	static int fileCount;

	public static void main(String[] args) {

		File dir = new File("xyz");
		print(dir);

		System.out.println();
		System.out.println("Totals files: " + (fileCount + dirCount));
		System.out.println("Number of Dirs: " + dirCount);
		System.out.println("Number of Files: " + fileCount);
	}

	static void print(File dir) {
		// TODO Auto-generated method stub
		File[] files = dir.listFiles();

		for (int i = 0; i < files.length; i++) {

			File f = files[i];

			if (f.isFile()) {

				fileCount++;
				System.out.println(f + " is a files");
			} else {
				dirCount++;
				System.out.println(f + " is a directory");
				print(f);
			}
		}
	}
}
