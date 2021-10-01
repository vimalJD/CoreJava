import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class AppletDemo4 extends Applet {

	Font f;
	String strFontName;
	String strFontStyle;
	String strFontSize;

	int STYLE = Font.PLAIN;
	int iFontSize;


	public void init() {

		setBackground(Color.pink);
		strFontName = getParameter("fontName");
		strFontStyle = getParameter("fontStyle");
		strFontSize = getParameter("fontSize");

		if (strFontName == null) {
			strFontName = "Arial";
			System.out.println("Applet is initialized with Arial");
		}

		if (strFontStyle.equalsIgnoreCase("PLAIN")) {
			System.out.println("Applet is initialized with Font Style");
			STYLE = Font.PLAIN;
		} else if (strFontStyle.equalsIgnoreCase("BOLD")) {
			STYLE = Font.BOLD;
		} else if (strFontStyle.equalsIgnoreCase("ITALIC")) {
			STYLE = Font.ITALIC;
		}

		if (strFontSize != null) {
			iFontSize = Integer.parseInt(strFontSize);
		} else {
			iFontSize = 10;
		}

		f = new Font(strFontName, STYLE, iFontSize);
	}


	public void paint(Graphics g) {

		g.setFont(f);
		g.setColor(Color.blue);

		g.drawString("Font Name: " + strFontName, 80, 50);
		g.drawString("Font Style: " + strFontStyle, 80, 80);
		g.drawString("Font Size: " + strFontSize, 80, 110);

	}
}