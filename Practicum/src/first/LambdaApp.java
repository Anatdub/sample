package first;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaApp {
	public static void main(String [] argc) {
		Operationable operation;
		operation = (x,y)->System.out.println((x+y)*5);
		 operation.calculate(10, 20);
	//	System.out.println(result); //30
		 
		  List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5); 
		  integers.forEach( x -> System.out.println(x) ); 
		  integers.forEach(z->System.out.println(z*22));
		  List<Integer> intSeq = Arrays.asList(1,2,3);

		  Consumer<Integer> cnsmr = x -> System.out.println(x);
		  intSeq.forEach(cnsmr);

    }  
}
