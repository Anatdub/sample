package threads;

public class TestQ 
	 implements Runnable {
		  public static void main(String[] args) {
		    new Test();
		  }

		  public TestQ() throws InterruptedException {
		    Thread thread = new Thread(this);
		    thread.sleep(1000);
		  }

		  public synchronized void run() {
		  }
		}