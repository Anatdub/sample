package first;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
public static void main(String [] argc) {
	String text = "FIFA will never regret it";
	String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");
	for(String word : words){
	   System.out.println(word);
	  
	}
	Pattern p = Pattern.compile("(cat)");
	Matcher m = p.matcher("one cat, two cats, or three cats on a fence");
	StringBuffer sb = new StringBuffer();
	while (m.find())
	   m.appendReplacement(sb, "$1erpillar");
	m.appendTail(sb);
	System.out.println(sb);

	Thread t = new Thread(() -> System.out.println("Hello world!"));
    t.start();
    
	
	
}
}
