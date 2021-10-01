package file.readerwriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamProject {

	public void changeData() throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("abc.txt"));

		// String builder object creation to store file data
		StringBuilder fileDatabuffer = new StringBuilder();

		// reading complete file data and store it in StringBulder object

		// ready() checks stream has data to read or not
		while (br.ready()) {

			fileDatabuffer.append(br.readLine() + "\n");
		}

		// changing StringBuilder to String to call replace()

		String fileData = fileDatabuffer.toString();

		// replace "xyz" with "abc"
		fileData = fileData.replace("xyz", "abc");

		// writting change content to file
		FileWriter fw = new FileWriter("abc");
		fw.write(fileData);

		fw.flush();

		System.out.println("data changed successfully");

		br.close();
		fw.close();
	}

	public static void main(String[] args) throws IOException {

		IOStreamProject p = new IOStreamProject();
		p.changeData();
	}
}
