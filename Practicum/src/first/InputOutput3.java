package first;

import java.util.Scanner;

public class InputOutput3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p; 					/* объ€влени€ переменных*/
		int a, b;   
		System.out.println("¬ведите периметр:\n");   /* вывод приглашени€ */
		p  = in.nextDouble();    			/* ввод с клавиатуры значени€ p */
		double st = p/3;     			 /* вычисление значени€ st */ 
		// вычисление площади
		double s = Math.sqrt(p/2*(p/2-st)*(p/2-st)*(p/2-st));
		System.out.println("s = "+ s );
	       
	}

}
