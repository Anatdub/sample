package first;

import java.util.Scanner;

public class ComputeFibonacciTabling {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for the Fibonacci number: ");
		int index = input.nextInt();
		f = new long[index+1];
		System.out.println("Fibonacci(" + index + ") is " + fib(index));
		for(long i:f) {
			System.out.println(i);
		}
	}
	public static long[] f;
	public static long fib(int index) {
		  if (index == 0)  return 0;
		  if (index == 1) { f[1]=1; return 1;	}
		  if(f[index]!=0)
		     return f[index];
          else	// Reduction and recursive calls  
		    f[index] = fib(index - 1) + fib(index - 2);
		    return f[index];
		}
 }

