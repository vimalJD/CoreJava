import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.io.Console;

public class FileDemo1 {

	File f;
	String fName, path, absolutePath;
	long size;

	public FileDemo1() throws IOException {
		f = new File("console.txt");

		Console sysconsole = System.console();
		@SuppressWarnings("unused")
		String data = sysconsole.readLine("\nUserName :");
		System.out.println("\n\t"+"  "+data);

		char[] passwordData = sysconsole.readPassword("\nEnter Password :");
		String password = new String(passwordData);

			if (f.exists() == true) {

			{
				if(password.length()<8)

			{
					System.out.println("\nInvalid Password");
				}
				else{	
					Writer wr = new FileWriter(f);
					wr.write(password);
					wr.close();
					System.out.println("\nlogin succesfully");
		    		}
			}
			System.out.println("\nText file exists");
			System.out.println("\nyou need to check your file in the below AbsolutePath\n"+"\n"+f.getAbsolutePath());
		}

		else {

			{
				if(password.length()<8)
				{
					System.out.println("\nInvalid Password");
				}
				else{	
					Writer wr = new FileWriter(f);
					wr.write(password);
					wr.close();
					System.out.println("\nsuccesfully login");

					f.createNewFile();
					System.out.println("\nfile does not exist");
					System.out.println("\nso that, new file is created by above credential");

					System.out.println("\nfile name is : " + f.getName());
					System.out.println("\npath is : " + f.getPath());
					System.out.println("\nAbsolute path is : " + f.getAbsolutePath());

					if (f.canRead() == true) {
									System.out.println("\nyou can read file");
								}

					if (f.canWrite() == true) {
									System.out.println("\nyou can write in file");
								}

					if (f.isAbsolute() == true) {
									System.out.println("\nfile has absolute path");
								}
					System.out.println("\nUsername should be there in text file");
					size = f.length();
					System.out.println("\nfile length is : " + size);
		    		}
			}
		}	
	}
		public static void main(String[] args) throws IOException {

			FileDemo1 fd = new FileDemo1();
	}

}
				