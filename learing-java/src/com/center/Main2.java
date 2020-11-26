package com.center;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;

public class Main2 { 

	public static void main(String[] args) {
		System.out.println(Math.abs(-10));
		 System.out.println(Math.max(3.6, 1211));
		System.out.println(true||true);
		System.out.println();
		int[] numb = {1,2,3,4,5};
		Arrays.stream(numb).forEach(s->System.out.println(s));
		Arrays.stream(numb).forEach(System.out::println);
		
	
	}

}
