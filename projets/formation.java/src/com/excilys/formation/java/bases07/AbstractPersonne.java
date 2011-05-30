/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public abstract class AbstractPersonne {

	public AbstractPersonne(String prenom) {
		this.prenom = prenom;
	}
	
	private String prenom;
	
	public abstract String getLanguageHello();
	
	public void sayHello() {
		System.out.println(getLanguageHello() + " " + prenom);
	}

}
