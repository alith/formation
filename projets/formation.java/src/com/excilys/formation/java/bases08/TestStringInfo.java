/**
 * 
 */
package com.excilys.formation.java.bases08;

/**
 * @author excilys
 *
 */
public class TestStringInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringInfo s = new StringInfo("je suis un petit canard, ô combien admirable!!!");
		StringInfo s1 = new StringInfo("ôôôôôôôôôôôôôôôôôôôôôôôôôôôô");
		StringInfo s2 = new StringInfo("");
		StringInfo s3 = new StringInfo("ô");
		StringInfo s4 = new StringInfo("ôôôôôôôôôôôôôôôôôôôôôôôôôôô");
		System.out.println(s + " -> "+ s.getInfo());
		System.out.println(s1 + " -> "+ s1.getInfo());
		System.out.println(s2 + " -> "+ s2.getInfo());
		System.out.println(s3 + " -> "+ s3.getInfo());
		System.out.println(s4 + " -> "+ s4.getInfo());
		s.ChangeString();
		s1.ChangeString();
		s2.ChangeString();
		s3.ChangeString();
		s4.ChangeString();
		System.out.println(s + " -> "+ s.getInfo());
		System.out.println(s1 + " -> "+ s1.getInfo());
		System.out.println(s2 + " -> "+ s2.getInfo());
		System.out.println(s3 + " -> "+ s3.getInfo());
		System.out.println(s4 + " -> "+ s4.getInfo());
		

	}

}
