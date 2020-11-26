package reflection;

import reflection.rabbit.Rabbit;

public class ExampleReflection {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		ReflectionChecker checker = new ReflectionChecker();
		Rabbit rabbit = new Rabbit();
		Object clone = checker.createNewObject(rabbit);
		checker.showClassName(clone);
	}

}
