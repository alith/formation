/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class Personne {
	
	private String prenom;
	
	/**
	 * 
	 */
	public Personne(String prenom) {
		this.prenom = prenom;
	}
	
	public void hello() {
		System.out.println("Hello " + prenom);
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
