package first;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MySuperSort {
	public static void main(String [] argc) {
		String[] array1 = {"мама", "мыла", "раму"};
		String[] array2 = {"я", "очень", "люблю", "java"};
		String[] array3 = {"мир", "труд", "май"};

		List<String[]> arrays = new ArrayList<>();
		arrays.add(array1);
		arrays.add(array2);
		arrays.add(array3);
		Comparator<String[]> sortByWordsLength = new Comparator<String[]>() {
		    @Override
		    public int compare(String[] o1, String[] o2) {
		        int length1 = 0;
		        int length2 = 0;
		        for (String s : o1) {
		            length1 += s.length();
		        }
		        for (String s : o2) {
		            length2 += s.length();
		        }
		        return length1 - length2;
		    }
		};

		Comparator<String[]> sortByLength = new Comparator<String[]>() {
			    @Override
			    public int compare(String[] o1, String[] o2) {
			        return o1.length - o2.length;
			    }
			};
		arrays.sort(sortByLength);// по возрастанию
		print(arrays);
		arrays.sort(sortByWordsLength);// по возрастанию
		print(arrays);
		arrays.sort((o1, o2) -> o1.length - o2.length); // по возрастанию
		print(arrays);
		arrays.sort((o1, o2) -> o2.length - o1.length); // по убыванию
		print(arrays);
		arrays.sort((o1, o2) -> {int length1 = 0; int length2 = 0;
        for (String s : o1) {
            length1 += s.length();
        }
        for (String s : o2) {
            length2 += s.length();
        }
        return length1 - length2;
}); // по возрастанию
		print(arrays);
		
	}
	
	static void print( List<String[]> arrays) {
		for (String[] a:arrays) {
			for(String i:a) {
				System.out.print(i+" ");
			}
		System.out.println();	
		}
		System.out.println();
	}
}
