package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("annotation.SimpleService"); 
		System.out.println(c.getSimpleName() );
		System.out.println(c.getModifiers());
		Method[] f = c.getMethods();
		for (Method s:f) {
			if (s.isAnnotationPresent(Init.class))
				System.out.println(" "+s+"Есть аннотация Init");
			else
				System.out.println(" "+s+"Нет аннотация Init");
	//	System.out.println(" "+s+s.isAnnotationPresent(Init.class));
		}
		System.out.println();
		System.out.println();
	}
}
