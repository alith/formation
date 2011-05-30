/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class Italien extends Personne {

	/**
	 * @param prenom
	 */
	public Italien(String prenom) {
		super(prenom);
	}

	public void hello() {
		System.out.println("Ciao " + getPrenom());
	}

}
