/**
 * 
 */
package executeurCodeAdistance;

import java.io.Serializable;

/**
 * @author excilys
 *
 */
public class PrintMessage extends Thread implements Serializable  {
	
	String message;

	/**
	 * 
	 */
	public PrintMessage(String message) {
		this.message = message;
	}
	
	public void run() {
		System.out.println(message);
	}
	
}
