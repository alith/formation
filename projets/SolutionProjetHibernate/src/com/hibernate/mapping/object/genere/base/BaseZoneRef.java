package com.hibernate.mapping.object.genere.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the zone_ref table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="zone_ref"
 */

public abstract class BaseZoneRef  implements Serializable {

	public static String REF = "ZoneRef";
	public static String PROP_PRIX = "Prix";
	public static String PROP_ZONE_FIN = "ZoneFin";
	public static String PROP_ZONE_DEBUT = "ZoneDebut";
	public static String PROP_ID = "Id";


	// constructors
	public BaseZoneRef () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseZoneRef (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.Integer zoneDebut;
	private java.lang.Integer zoneFin;
	private java.lang.Float prix;


	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="increment"
     *  column="zone_id"
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
	 * Return the value associated with the column: zone_debut
	 */
	public java.lang.Integer getZoneDebut () {
		return zoneDebut;
	}

	/**
	 * Set the value related to the column: zone_debut
	 * @param zoneDebut the zone_debut value
	 */
	public void setZoneDebut (java.lang.Integer zoneDebut) {
		this.zoneDebut = zoneDebut;
	}



	/**
	 * Return the value associated with the column: zone_fin
	 */
	public java.lang.Integer getZoneFin () {
		return zoneFin;
	}

	/**
	 * Set the value related to the column: zone_fin
	 * @param zoneFin the zone_fin value
	 */
	public void setZoneFin (java.lang.Integer zoneFin) {
		this.zoneFin = zoneFin;
	}



	/**
	 * Return the value associated with the column: prix
	 */
	public java.lang.Float getPrix () {
		return prix;
	}

	/**
	 * Set the value related to the column: prix
	 * @param prix the prix value
	 */
	public void setPrix (java.lang.Float prix) {
		this.prix = prix;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof com.hibernate.mapping.object.genere.ZoneRef)) return false;
		else {
			com.hibernate.mapping.object.genere.ZoneRef zoneRef = (com.hibernate.mapping.object.genere.ZoneRef) obj;
			if (null == this.getId() || null == zoneRef.getId()) return false;
			else return (this.getId().equals(zoneRef.getId()));
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