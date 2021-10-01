package file.sequencebufferedios;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceBufferedIOSMultiConst {

	public static void main(String[] args) throws IOException {

		FileInputStream fis1 = new FileInputStream("abc.txt");
		FileInputStream fis2 = new FileInputStream("bbc.txt");
		FileInputStream fis3 = new FileInputStream("cbc.txt");
		
		Vector<InputStream> inputStreams = new Vector<InputStream>();
		inputStreams.add(fis1);
		inputStreams.add(fis2);
		inputStreams.add(fis3);
		
		Enumeration<InputStream> enu = inputStreams.elements();
		
		SequenceInputStream sis = new SequenceInputStream(enu);

		int data;

		while ((data = sis.read()) != -1) {

			System.out.print((char) data);
		}
		sis.close();
		
	}
}
