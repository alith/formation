/**
 * 
 */
package com.formation.junit.permis;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author excilys
 *
 */
public class Candidat {
	
	private int id;
	private String nom;
	private int numId;
	private Date dateNaissance;
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private static final SimpleDateFormat sdfSql = new SimpleDateFormat("yyyy-MM-dd");
	private boolean codeObtenu;

	/**
	 * 
	 */
	public Candidat() {
		id = 0;
		nom = "default";
		numId = 0;
		dateNaissance = new Date();
		codeObtenu = false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom != null && nom.trim() != "") this.nom = nom;
	}

	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		if (numId >= 0) this.numId = numId ;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public String getDateNaissanceFormattee() {
		return sdf.format(dateNaissance);
	}

	public String getDateNaissanceFormatteeSQL() {
		return sdfSql.format(dateNaissance);
	}

	public void setDateNaissance(Date dateNaissance) {
		Date today = new Date();
		if (dateNaissance.compareTo(today)<0) {
			this.dateNaissance = dateNaissance;
		} else {
			 throw new RuntimeException("Date plus recente qu'aujourd'hui!");
		}
	}
	
	public void setDateNaissance(String dateFormatee) {
		try {
			Date d = sdf.parse(dateFormatee);
			if (d.compareTo(new Date())>=0) {
				throw new RuntimeException("Date plus recente qu'aujourd'hui!"); //il faudrait faire ca mieux.
			} else {
				dateNaissance = d;
			}
		} catch (ParseException e) {
			throw new RuntimeException("Date Malformée!",e); //il faudrait faire ca mieux.
		}
	}

	public boolean isCodeObtenu() {
		return codeObtenu;
	}

	public void setCodeObtenu(boolean codeObtenu) {
		this.codeObtenu = codeObtenu;
	}
	
	@Override
	public boolean equals(Object anotherObject) {
		boolean result = true;
		if (anotherObject instanceof Candidat) {
			Candidat other = (Candidat)anotherObject;
			if (!other.getNom().equals(nom)) result = false;
			if (other.getNumId() != numId) result = false;
			if (!sameDay(other.getDateNaissance(),dateNaissance)) result = false;
			if (other.isCodeObtenu() != codeObtenu) result = false;
		} else {
			result = false;
		}
		return result;
	}
	
	private static boolean sameDay (Date d1, Date d2) {
		return sdf.format(d1).equals(sdf.format(d2));
	}
	
	public String toString() {
		StringBuilder result =  new StringBuilder();
		result.append("IdCandidat = ").append(getId()).append("; ");
		result.append("NomCandidat = ").append(getNom()).append("; ");
		result.append("NumIdCandidat = ").append(getNumId()).append("; ");
		result.append("ddnCandidat = ").append(getDateNaissanceFormattee()).append("; ");
		result.append("codeObtenu = ").append(isCodeObtenu()).append("\n");
		return result.toString();
	}

}
