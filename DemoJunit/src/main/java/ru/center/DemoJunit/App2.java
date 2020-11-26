package ru.center.DemoJunit;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App2 {
	public static void main(String[] args) {
		// String pattern = "[a-z]+";
		// String text = "Now is the time";
		//
		// String pattern = "<.*>";
		// String pattern = "<[^>]*>";
	//	 String text = "<p><b>Beginning with bold text</b> next, text body,<i>italic text</i> end of text.</p>";
//		String pattern = "\\w+(\\.\\w+)*@(\\w+\\.)+\\w+";
//		String text = "my.mail@ru.ru";
		String pattern = "([a-zA-Z]*)([0-9]*)";
		String text = "oooo-22349540";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		if (m.matches()) 
			System.out.print("Matches the entire text string");
			else
			System.out.print("Don't Matches the entire text string");	
	
		m.reset();
		System.out.println();
		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()) + "*");
		}
		System.out.print( "a+b$#c".replace("[$+#]", "NNN"));

	}
}
