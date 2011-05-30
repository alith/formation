/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class FrancaisA extends AbstractPersonne {

	public FrancaisA(String prenom) {
		super(prenom);
	}	

	/* (non-Javadoc)
	 * @see com.excilys.formation.java.bases07.AbstractPersonne#getLanguageHello()
	 */
	@Override
	public String getLanguageHello() {
		return "Bonjour";
	}

}
