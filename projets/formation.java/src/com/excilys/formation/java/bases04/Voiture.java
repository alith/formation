/**
 * 
 */
package com.excilys.formation.java.bases04;

/**
 * @author excilys
 *
 */
public class Voiture {
	
	public enum EnumCarburant { SANS_PLOMB_98, SANS_PLOMB_95, DIESEL, GPL};

	private final EnumCarburant carburant;
	static float prixSP98;
	static float prixSP95;
	static float prixDIESEL;
	static float prixGPL;
	public static final int NOMBRE_ROUES = 4;
	
	public Voiture (EnumCarburant carburant) {
		this.carburant = carburant;
	}
	
	public Voiture (EnumCarburant carburant, float prixSP98,float prixSP95,float prixDIESEL,float prixGPL) {
		this.carburant = carburant;
		Voiture.prixSP98 = prixSP98;
		Voiture.prixSP95 = prixSP95;
		Voiture.prixDIESEL = prixDIESEL;
		Voiture.prixGPL = prixGPL;
	}
	
	public static void service() {
		Voiture v1 = new Voiture (EnumCarburant.DIESEL,1,1,1,1);
		System.out.println("Voiture 1: " + v1);
		Voiture v2  = new Voiture (EnumCarburant.GPL);
		System.out.println("Voiture 2: " + v2);
		Voiture v3  = new Voiture (EnumCarburant.SANS_PLOMB_98,2,2,2,2);
		System.out.println("Voiture 1: " + v1);
		System.out.println("Voiture 2: " + v2);
		System.out.println("Voiture 3: " + v3);
	}
	
	public final static void main(String args[]) {
		service();
	}
	
	public float getPrixCarburant () {
		float result = -1;
		switch (carburant) {
			case SANS_PLOMB_98 : {
				result = prixSP98;
			}break;
			case SANS_PLOMB_95 : {
				result = prixSP95;
			}break;
			case DIESEL : {
				result = prixDIESEL;
			}break;
			case GPL : {
				result = prixGPL;
			}break;
		}
		return result;
	}
	
	public static float getPrixSP98() {
		return prixSP98;
	}
	public static void setPrixSP98(float prixSP98) {
		Voiture.prixSP98 = prixSP98;
	}
	
	public static float getPrixSP95() {
		return prixSP95;
	}
	public static void setPrixSP95(float prixSP95) {
		Voiture.prixSP95 = prixSP95;
	}
	
	public static float getPrixDIESEL() {
		return prixDIESEL;
	}
	public static void setPrixDIESEL(float prixDIESEL) {
		Voiture.prixDIESEL = prixDIESEL;
	}
	
	public static float getPrixGPL() {
		return prixGPL;
	}
	public static void setPrixGPL(float prixGPL) {
		Voiture.prixGPL = prixGPL;
	}
	
	public EnumCarburant getCarburant() {
		return carburant;
	}
	
	public static int getNombreRoues() {
		return NOMBRE_ROUES;
	}
	
	@Override
	public String toString() {
		String result = "";
		result += "carburant: " + carburant + "\n";
		result += "prixSP98: " + prixSP98 + "\n";
		result += "prixSP95: " + prixSP95 + "\n";
		result += "prixDIESEL: " + prixDIESEL + "\n";
		result += "prixGPL: " + prixGPL + "\n";
		result += "prix du carburant pour cette instance: " + getPrixCarburant() + "\n";
		result += "NOMBRE_ROUES: " + NOMBRE_ROUES + "\n";
		result += "\n";
		return result;
	}
}
