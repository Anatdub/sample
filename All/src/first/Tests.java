package first;
import  static java.lang.System.out;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.stream.IntStream;

public class Tests {

	public static void main(String[] args) {
		int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
		
		 // display original values
		 System.out.print("Original values: ");
		 IntStream.of(values)
		 .forEach(value -> System.out.printf("%d ", value));
		 System.out.println();

	}

}
