/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class EspagnolA extends AbstractPersonne {

	/**
	 * @param prenom
	 */
	public EspagnolA(String prenom) {
		super(prenom);
	}

	/* (non-Javadoc)
	 * @see com.excilys.formation.java.bases07.AbstractPersonne#getLanguageHello()
	 */
	@Override
	public String getLanguageHello() {
		return "Hola";
	}

}
