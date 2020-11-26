package threadexample;

public class Ticker implements Runnable {
	String name;

	public Ticker(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(name +": "+i);
				Thread.sleep(500);
			}

		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
