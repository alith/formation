/**
 * 
 */
package ebi.training.java.outils.log4j;

import org.apache.log4j.Logger;

/**
 * @author excilys
 *
 */
public class LogTest {
	
	Logger l;

	/**
	 * 
	 */
	public LogTest() {
		l = Logger.getLogger(ebi.training.java.outils.log4j.LogTest.class);
	}
	
	public void log (String s) {
		l.debug(s);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LogTest lt = new LogTest();
		for (int i = 0; i < args.length; i++) {
			lt.log(args[i]);
		}
	}

}
