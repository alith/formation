/**
 * 
 */
package ebi.training.java.outils.log4j.package2;

import org.apache.log4j.Logger;

import ebi.training.java.outils.log4j.package1.ClassLoggee;

/**
 * @author excilys
 *
 */
public class TestClassLoggee {	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ebi.training.java.outils.log4j.package2.TestClassLoggee.class);
		ClassLoggee cl = new ClassLoggee();
		cl.start();
		logger.info("lancement du thread de ClassLoggee");
		int i = 100;
		while(i-- > 0) {
			try {
				logger.info("pause de 3 secondes");
				Thread.sleep(3000);
				logger.info("interruption du thread de ClassLoggee");
				cl.interrupt();
			} catch (InterruptedException e) {
				logger.warn("interruption: " + e.getMessage());
			}
		}
	}

}
