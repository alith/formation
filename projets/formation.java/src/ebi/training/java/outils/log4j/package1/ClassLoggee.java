/**
 * 
 */
package ebi.training.java.outils.log4j.package1;

import org.apache.log4j.Logger;

/**
 * @author excilys
 *
 */
public class ClassLoggee  extends Thread {
	
	private int i;
	private Logger logger;

	/**
	 * 
	 */
	public ClassLoggee() {
		i=0;
		logger = Logger.getLogger(ebi.training.java.outils.log4j.package1.ClassLoggee.class);
	}
	
	public void run() {
		while (true) {
			try {
				i++;
				logger.info("incrementation n°" + i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				logger.warn("interruption: " + e.getMessage());
			}
		}
	}

}
