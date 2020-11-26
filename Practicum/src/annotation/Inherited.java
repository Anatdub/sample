package annotation;

public class Inherited extends Parent {
	int i=0;
	@Override
	public void method() {
	method1();
	}
	@Deprecated
	public void method1() {
		
	}
}
