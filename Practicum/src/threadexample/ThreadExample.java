package threadexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExample {
static int n=0;
	public static void main(String[] args) {
		Ticker first = new Ticker("First");
		Ticker second = new Ticker("Second");
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.submit(first);
		executorService.submit(second);
		ExecutorService service = Executors.newCachedThreadPool();
		for(int i = 0; i < 10; i++) {
		 service.submit(new Runnable() {
		  public void run() {
			  n++; 
			  System.out.println("Номер потока = "+n);
			 System.out.println("Заверше = "+n);
		  }
		 });
		}

	}

}
