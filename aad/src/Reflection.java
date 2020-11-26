import java.util.stream.Stream;

public class Reflection {
public static void main(String[] args) {
	int a = 1;
    int b;
    if (a == 2) b = 3;
    else b = 4;
    int c = 10;
  //  c++;
	Stream.of(1, 2).forEach(s-> System.out.println(s + a));
	Stream.of(1, 2).forEach(s-> System.out.println(s + c)); 
}
}
