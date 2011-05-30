/**
 * 
 */
package com.excilys.formation.java.bases03;

/**
 * @author excilys
 *
 */
public class Arguments {

	/**
	 * 
	 */
	public Arguments() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 4 ) {
			String s = "";
			for (int i = 0; i < args.length; i++) s+=args[i]+" ";
			System.out.println(s);
		} else {
			System.out.println("Trop de personnes à saluer.");
		}

	}

}
