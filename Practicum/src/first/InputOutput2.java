package first;

import java.util.Scanner;

public class InputOutput2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int x; 					/* объ€влени€ переменных*/
		int a, b;   
		System.out.println("¬ведите a и b:\\n ");   /* вывод приглашени€ */
		a  = in.nextInt();    			/* ввод с клавиатуры значени€ a */
		b = in.nextInt();    			/* ввод с клавиатуры значени€ b */
		x = a + b;     			 		/* вычисление значени€ x */ 
		System.out.println("x= "+x );
		
		System.exit(0);

	       
	}

}
