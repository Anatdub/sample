package first;
// https://goo.gl/6aMY9T
public class testRecur {
	 public static String subsequences(String word) {
	     if (word.isEmpty()) {
	         return ""; // base case
	     } else {
	         char firstLetter = word.charAt(0);
	         String restOfWord = word.substring(1);
	         
	         String subsequencesOfRest = subsequences(restOfWord);
	         
	         String result = "";
	         for (String subsequence : subsequencesOfRest.split(",", -1)) {
	             result += "," + subsequence;
	             result += "," + firstLetter + subsequence;
	         }
	         result = result.substring(1); // remove extra leading comma
	         return result;
	     }
	 }
	
	public static void main(String[] args)
	{
	  System.out.println(subsequences("abcd"));
	}
	
	}