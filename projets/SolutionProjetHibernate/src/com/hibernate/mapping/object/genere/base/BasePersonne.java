package com.hibernate.mapping.object.genere.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the personne table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="personne"
 */

public abstract class BasePersonne  implements Serializable {

	public static String REF = "Personne";
	public static String PROP_ADRESSE = "Adresse";
	public static String PROP_NOM = "Nom";
	public static String PROP_AGE = "Age";
	public static String PROP_PRENOM = "Prenom";
	public static String PROP_ID = "Id";


	// constructors
	public BasePersonne () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePersonne (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	/**
	 * Constructor for required fields
	 */
	public BasePersonne (
		java.lang.Integer id,
		java.lang.String nom) {

		this.setId(id);
		this.setNom(nom);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nom;
	private java.lang.String prenom;
	private java.lang.String adresse;
	private java.lang.Integer age;




	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="personne_id"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: nom
	 */
	public java.lang.String getNom () {
		return nom;
	}

	/**
	 * Set the value related to the column: nom
	 * @param nom the nom value
	 */
	public void setNom (java.lang.String nom) {
		this.nom = nom;
	}



	/**
	 * Return the value associated with the column: prenom
	 */
	public java.lang.String getPrenom () {
		return prenom;
	}

	/**
	 * Set the value related to the column: prenom
	 * @param prenom the prenom value
	 */
	public void setPrenom (java.lang.String prenom) {
		this.prenom = prenom;
	}



	/**
	 * Return the value associated with the column: adresse
	 */
	public java.lang.String getAdresse () {
		return adresse;
	}

	/**
	 * Set the value related to the column: adresse
	 * @param adresse the adresse value
	 */
	public void setAdresse (java.lang.String adresse) {
		this.adresse = adresse;
	}



	/**
	 * Return the value associated with the column: age
	 */
	public java.lang.Integer getAge () {
		return age;
	}

	/**
	 * Set the value related to the column: age
	 * @param age the age value
	 */
	public void setAge (java.lang.Integer age) {
		this.age = age;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.hibernate.mapping.object.genere.Personne)) return false;
		else {
			com.hibernate.mapping.object.genere.Personne personne = (com.hibernate.mapping.object.genere.Personne) obj;
			if (null == this.getId() || null == personne.getId()) return false;
			else return (this.getId().equals(personne.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}