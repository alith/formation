/**
 * 
 */
package com.excilys.formation.java.bases03;

/**
 * @author excilys
 *
 */
public class PairImpair {

	/**
	 * 
	 */
	public PairImpair() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 0;
		for (i = 0; i <= 10; i++) {
			if (i % 2 == 0) System.out.println(i);
		}
		while (i<= 20) {
			if (i % 2 != 0) System.out.println(i);
			i++;
		}
	}

}
