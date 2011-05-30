/**
 * 
 */
package com.excilys.formation.java.bases04.test;

import static com.excilys.formation.java.bases04.Voiture.*;

import com.excilys.formation.java.bases04.Voiture;

/**
 * @author excilys
 *
 */
public class ImportTest {

	/**
	 * 
	 */
	public ImportTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(NOMBRE_ROUES);
		service();
		Voiture v = new Voiture(EnumCarburant.GPL,0,0,0,0);
		System.out.println("nouvelle voiture: " + v.toString());
		int n = v.NOMBRE_ROUES;
	}

}
