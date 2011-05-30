/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class Francais extends Personne {

	/**
	 * @param prenom
	 */
	public Francais(String prenom) {
		super(prenom);
	}

	public void hello() {
		System.out.println("Bonjour " + getPrenom());
	}
}
