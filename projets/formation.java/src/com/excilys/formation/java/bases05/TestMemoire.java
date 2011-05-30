/**
 * 
 */
package com.excilys.formation.java.bases05;

/**
 * @author excilys
 *
 */
public class TestMemoire {

	public String chaine = "ma chaine";
	public int  entier = 0;
	

	public static void test(TestMemoire inst) {
		if (inst.entier < 0) inst.chaine = "negatif";
	}
	
	public static void inc(int n) {
		while (n < 0) n++;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestMemoire t = new TestMemoire();
		TestMemoire.test(t);
		System.out.println(t.chaine);
		t.entier = -1;
		TestMemoire.test(t);
		System.out.println(t.chaine);
		inc(t.entier);
		System.out.println(t.entier);
		
		
	}

}
