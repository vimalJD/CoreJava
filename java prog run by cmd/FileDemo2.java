import java.io.*;

public class FileDemo2 {
	
	public static void main(String[] args){
		FileInputStream fs = null;
		try{
			fs=new FileInputStream("file.txt");
			}
			catch(FileNotFoundException ex)
			{
				ex.getMessage();
			}
			catch(Exception e)
			{
				e.getMessage();
			}
			finally
			{
					try {
						fs.close();
					}
					catch (IOException e) 
					{	
						e.printStackTrace();
					}
			}
	}

}
