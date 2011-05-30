/**
 * 
 */
package executeurCodeAdistance;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
/**
 * @author excilys
 *
 */
public class Master {
	
	private Collection<Serializable> aExecuter;

	/**
	 * 
	 */
	public Master() {
		aExecuter = new ArrayList<Serializable>();
	}
	
	public void add(Serializable thread) {
		aExecuter.add(thread.getClass());
		aExecuter.add(thread);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Master m = new Master();
		PrintMessage pm = new PrintMessage("Hello World!");
		m.add(pm);
	}
}
