package first;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	static public void main(String someArgs[]) {
    	Locale rus = new Locale("ru", "RU");
    	System.out.printf(rus,"%,d%n", 1000000 );// 1,000,000
    	byte data = (byte) 0b1100110011;
    	System.out.println(rus.getDisplayCountry());
    	System.out.println(Integer.toBinaryString(-1));
    	int value = 28;
        for(int i = 1, j = 0; i < 256; i = i << 1, j++)
            System.out.println(j + " " + ((value & i) > 0 ? 1 : 0));

    }
}

