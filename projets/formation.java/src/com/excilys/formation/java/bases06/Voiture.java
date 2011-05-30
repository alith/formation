/**
 * 
 */
package com.excilys.formation.java.bases06;

/**
 * @author excilys
 * Un javaBean representant une voiture.
 */
public class Voiture {
	
	private final static String UNDEFINED = "undefined"; 
	
	private String immatriculation;
	private String couleur;
	private String proprietaire;

	/**
	 * Constructeur de la voiture sans arguments
	 */
	public Voiture() {
	}
	
	/**
	 * Constructeur d'une voiture avec seulement l'imattriculation
	 * @param immatriculation l'immatriculation de la voiture
	 */
	public Voiture(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	
	/**
	 * Constructeur d'une voiture avec tous les arguments
	 * @param immatriculation l'immatriculation de la voiture
	 * @param couleur la couleur de la voiture
	 * @param proprietaire le proprietaire de la voiture
	 */
	public Voiture(String immatriculation,String couleur, String proprietaire) {
		this.immatriculation = immatriculation;
		this.couleur = couleur;
		this.proprietaire = proprietaire;
	}
	
	/**
	 * @param args aucun arguments n'est lu.
	 */
	public static void main(String[] args) {
		testVoiture();
	}
	
	/**
	 * une methode statique de test de la classe voiture; elle utilise tous les constructeurs de la classe et affiche les valeurs des attributs obtenus.
	 */
	public static void testVoiture() {
		Voiture v1 = new Voiture();
		System.out.println("Voiture 1: " + v1);
		Voiture v2 = new Voiture("870 AET 31");
		System.out.println("Voiture 2: " + v2);
		Voiture v3 = new Voiture("870 AET 31","Blanche","Moi");
		System.out.println("Voiture 3: " + v3);
	}

	public String getImmatriculation() {
		return (immatriculation != null) ? immatriculation : UNDEFINED;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getCouleur() {
		return (couleur != null) ? couleur : UNDEFINED;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getProprietaire() {
		return (proprietaire != null) ? proprietaire : UNDEFINED;
	}

	public void setProprietaire(String proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "immatriculation: " + getImmatriculation() + "\n";
		result += "couleur: " + getCouleur() + "\n";
		result += "proprietaire: " + getProprietaire() + "\n";
		return result;
	}

}
