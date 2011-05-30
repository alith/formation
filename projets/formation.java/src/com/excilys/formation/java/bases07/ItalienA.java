/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class ItalienA extends AbstractPersonne {

	/**
	 * @param prenom
	 */
	public ItalienA(String prenom) {
		super(prenom);
	}

	/* (non-Javadoc)
	 * @see com.excilys.formation.java.bases07.AbstractPersonne#getLanguageHello()
	 */
	@Override
	public String getLanguageHello() {
		return "Ciao";
	}

}
