package tel.lambda;

import java.util.Arrays;
import java.util.List;

// forEach Mrthod in Java
//External loops
//Interrnal loops
public class DemoForEach {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4, 5, 6, 7, 8);
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}
		for (int i : values) {
			System.out.println(i);
		}
		values.forEach(i -> System.out.println(i));// Lambda express
	}

}
