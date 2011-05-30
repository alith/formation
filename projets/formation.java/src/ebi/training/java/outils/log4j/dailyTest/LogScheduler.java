/**
 * 
 */
package ebi.training.java.outils.log4j.dailyTest;


import org.apache.log4j.Logger;

/**
 * @author excilys
 *
 */
public class LogScheduler extends Thread {
	
	private int i;
	private Logger logger;
	
	/**
	 * 
	 */
	public LogScheduler() {
		i=0;
		logger = Logger.getLogger(ebi.training.java.outils.log4j.dailyTest.LogScheduler.class);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LogScheduler ls = new LogScheduler();
		ls.start();
	}
	
	public void run() {
		while (true) {
			try {
				i++;
				int type = i%5;
				if (type == 0) {
					logger.debug("incrementation n°" + i + "de type debug");
				} else if (type == 1){
					logger.info("incrementation n°" + i + "de type info");
				} else if (type == 2){
					logger.warn("incrementation n°" + i + "de type warn");
				} else if (type == 3){
					logger.error("incrementation n°" + i + "de type error");
				} else if (type == 4){
					logger.fatal("incrementation n°" + i + "de type fatal");
				}
				Thread.sleep(500);
			} catch (InterruptedException e) {
				logger.warn("interruption: " + e.getMessage());
			}
		}
	}
}
