package first;

import java.util.regex.Pattern;

public class Pat {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		System.out.println(s1 + "==" + s2 + " :"
		+ (s1 == s2));
		System.out.println(s1 + "==" + s3 + " :"
		+ (s1 == s3));
		System.out.println(s1 + " equals " + s2
		+ s1.equals(s2));
		System.out.println(s1 + " equals " + s3
		+ s1.equals(s3));
		System.out.println(s1.hashCode());
		StringBuffer sp = new StringBuffer("vvvv");
		System.out.println("SB "+ (sp instanceof Object));
		}
}