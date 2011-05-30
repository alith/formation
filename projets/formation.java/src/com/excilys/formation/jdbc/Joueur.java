/**
 * 
 */
package com.excilys.formation.jdbc;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author excilys
 *
 */
public class Joueur {
	
	public static enum Poste {AVANT,ARRIERE};

	private String login;
	private String password;
	private String prenom;
	private String nom;
	private GregorianCalendar dateNaissance;
	private String email;
	private String telephone;
	private Poste poste;
	
	/**
	 * 
	 */
	public Joueur() {
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(GregorianCalendar dateNaissance) {
		GregorianCalendar today = new GregorianCalendar();
		today.setTime(new Date());
		if (dateNaissance.compareTo(today)<0) {
			this.dateNaissance = dateNaissance;
		} else {
			 throw new RuntimeException("Date plus recente qu'aujourd'hui!");
		}
	}
	
	public void setDateNaissance(String dateFormatee) {
		if (dateFormatee.length() != 10) throw new RuntimeException("Date Malformée!");
		String [] aux = dateFormatee.split("/");
		try {
			dateNaissance = new GregorianCalendar(Integer.parseInt(aux[0]),Integer.parseInt(aux[1]),Integer.parseInt(aux[2]));
		} catch (Exception e) {
			throw new RuntimeException("Date Malformée!",e);
		}
		GregorianCalendar today = new GregorianCalendar();
		today.setTime(new Date());
		if (dateNaissance.compareTo(today)>=0) throw new RuntimeException("Date plus recente qu'aujourd'hui!");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public void setPoste(String poste) {
		if (poste.equals("ARRIERE")) {
			this.poste = Poste.ARRIERE;
		} else if (poste.equals("AVANT")) {
			this.poste = Poste.AVANT;
		}
	}
	
	public String toString() {
		StringBuilder result =  new StringBuilder();
		result.append("login:").append(login).append("; ");
		result.append("password:").append(password).append("; ");
		result.append("prenom:").append(prenom).append("; ");
		result.append("nom:").append(nom).append("; ");
		result.append("email:").append(email).append("; ");
		result.append("telephone:").append(telephone).append("; ");
		if (dateNaissance != null) {
			result.append("date naissance:").append(dateNaissance.get(GregorianCalendar.DAY_OF_MONTH)).append("/");
			result.append(dateNaissance.get(GregorianCalendar.MONTH)).append("/").append(dateNaissance.get(GregorianCalendar.YEAR)).append("; ");
		} else {
			result.append("date naissance:null ");
		}
		result.append("poste:").append(poste).append("; ");
		return result.toString();
	}

}
