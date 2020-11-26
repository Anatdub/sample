package spb.center;

interface Dog  {
    void bark();
     
     void waveTail();
}
public class D implements Dog{

	@Override
	public void bark() {
		System.out.println("bark");// TODO Auto-generated method stub
		
	}

	@Override
	public void waveTail() {
		System.out.println("tail");// TODO Auto-generated method stub
		
	}	
	public static void main(String[] args) {
		new D().run();
	}
	void run() {
		Dog dd = new D();
		dd.bark();
		dd.waveTail();
	}
}