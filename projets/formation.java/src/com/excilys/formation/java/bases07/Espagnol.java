/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class Espagnol extends Personne {

	/**
	 * @param prenom
	 */
	public Espagnol(String prenom) {
		super(prenom);
	}

	public void hello() {
		System.out.println("Hola " + getPrenom());
	}

}
