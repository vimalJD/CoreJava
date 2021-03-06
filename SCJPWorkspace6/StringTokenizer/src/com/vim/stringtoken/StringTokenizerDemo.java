package com.vim.stringtoken;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {

		String str = "Vimla patel,now a days in pune";

//		StringTokenizer st = new StringTokenizer(str);

//		StringTokenizer st = new StringTokenizer(str, ",");

//		StringTokenizer st = new StringTokenizer(str, ",", true);

		StringTokenizer st = new StringTokenizer(str, " ", true);
		
		System.out.println("Number of tokens: " + st.countTokens());

//		System.out.println("Number of tokens: " + st.);
		System.out.println("More Token: " + st.hasMoreTokens());
		System.out.println("More Element: " + st.hasMoreElements());

		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());

		}
		System.out.println("More Element: " + st.hasMoreElements());
	}
}
