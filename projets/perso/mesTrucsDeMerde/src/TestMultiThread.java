/**
 * 
 */

/**
 * @author excilys
 * 
 */
public class TestMultiThread extends Thread {

	public TestMultiThread() {

	}

	public void run() {

		while (true) {
			if (Thread.currentThread() != this) {
				System.out.println("on est en vrai multitask!!!");
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			new TestMultiThread().start();
		}
	}

}
