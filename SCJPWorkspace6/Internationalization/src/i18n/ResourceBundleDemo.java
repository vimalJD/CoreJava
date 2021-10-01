package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {

		// loading properties file based on current locale

		ResourceBundle rb = ResourceBundle.getBundle("i18n/wish");

		// loaded properties file based on passed locale
		ResourceBundle rb1 = ResourceBundle.getBundle("i18n/wish",
				new Locale(Locale.FRENCH.toString(), Locale.FRENCH.toString()));

		ResourceBundle rb2 = ResourceBundle.getBundle("i18n/wish", new Locale(Locale.GERMANY.toString()));

		String wish = rb.getString("hellowish");
		System.out.println(wish);
		String wish1 = rb1.getString("hellowish");
		System.out.println(wish1);

		String wish2 = rb2.getString("hellowish");
		System.out.println(wish2);
	}

}
