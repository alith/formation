/**
 * 
 */
package com.excilys.formation.java.tests;

/**
 * @author excilys
 *
 */
public class TestThread extends Thread {
	
	private int i;

	/**
	 * 
	 */
	public TestThread() {
		i = 0;
	}
	
	public void run() {
		while (true) {
			System.out.println("je suis en vie, et c'est ma " + i + "eme iteration!");
			i++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("je me fait interrompre pendant mon " + i + "eme sommeil!");
				e.printStackTrace();
			}
		}
	}
	
	public static void main( String[] args) {
		TestThread tt = new TestThread();
		tt.start();
		tt = null;
		try {
			System.out.println("je suis le main, et je m'endors");
			Thread.sleep(100);
		} catch (InterruptedException e) {
			System.out.println("je suis le main, et je me suis fait interrompre");
			e.printStackTrace();
		}
		System.gc();
		System.out.println("je suis le main, et j'ai appelé le GC.");
	}
}
