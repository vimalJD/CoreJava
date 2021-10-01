package netprogram.networkoperation;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionDemo {

	public static void main(String[] args) {

		try {

			int c;
			File file = new File("Example.txt");
			String filePath = "file:///" + file.getAbsolutePath();
			URL fileURL = new URL(filePath);

			URLConnection ucon = fileURL.openConnection();

			System.out.println("\nDate: " + new Date(ucon.getDate()));
			System.out.println("Content-type: " + ucon.getContentType());
			System.out.println("Expires: " + ucon.getExpiration());
			System.out.println("Last Modified: " + ucon.getLastModified());

			int len = ucon.getContentLength();
			System.out.println("Content Lenth: " + len + "bytes");

			if (len > 0) {

				System.out.println("\n=========CONTENT=========");

				InputStream in = ucon.getInputStream();

				int i = len;
				while ((c = in.read()) != -1) {

					System.out.print((char) c);
				}
				in.close();
			} else {
				System.out.println("No content available");
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception: " + e);
		}
	}
}
