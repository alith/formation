/**
 * 
 */
package com.excilys.formation.spring.library.model;

/**
 * @author excilys
 * 
 */
public class Personne extends Addressable {

	protected String nom;
	protected String prenom;

	/**
	 * 
	 */
	public Personne() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
