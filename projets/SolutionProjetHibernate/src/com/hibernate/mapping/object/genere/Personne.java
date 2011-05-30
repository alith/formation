package com.hibernate.mapping.object.genere;

import com.hibernate.mapping.object.genere.base.BasePersonne;



public class Personne extends BasePersonne {
	private static final long serialVersionUID = 1L;

/*[CONSTRUCTOR MARKER BEGIN]*/
	public Personne () {
		super();
	}

	/**
	 * Constructor for primary key
	 */
	public Personne (java.lang.Integer id) {
		super(id);
	}

	/**
	 * Constructor for required fields
	 */
	public Personne (
		java.lang.Integer id,
		java.lang.String nom) {

		super (
			id,
			nom);
	}

/*[CONSTRUCTOR MARKER END]*/


}