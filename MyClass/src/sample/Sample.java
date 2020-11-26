package sample;

public class Sample implements Runnable{

	public static void main(String... args) {
		Sample t = new Sample();
		
//		t.run();
		new Sample().run();
	}

	public void run() {// Your real code begins here
		System.out.println(this.getClass());
		Object sd = 1;
		print(sd);
		int c=(Integer) sd+2;
	
		print(c);
		// объект потомок можно назначить переменной предка
		// «объект подкласса может использоваться всюду, 
		// где используется объект суперкласса
	}

	void print(Object ob) {
		System.out.println(ob);
	}
}
