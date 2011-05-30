/**
 * 
 */
package com.excilys.formation.java.bases08;

/**
 * @author excilys
 *
 */
public class StringInfo {
	
	private String chaine;
	
	public StringInfo(Object o ) {
		this.chaine = o.toString();
	}
	
	public StringInfo(int n) {
		this.chaine = String.valueOf(n);
	}
	
	public StringInfo(double d) {
		this.chaine = String.valueOf(d);
	}
	
	public StringInfo(float f) {
		this.chaine = String.valueOf(f);
	}
	
	public StringInfo(long l) {
		this.chaine = String.valueOf(l);
	}
	
	public StringInfo(char c) {
		this.chaine = String.valueOf(c);
	}
	
	public StringInfo(boolean b) {
		this.chaine = String.valueOf(b);
	}
	
	public StringInfo(short s) {
		this.chaine = String.valueOf(s);
	}
	
	public StringInfo(byte b) {
		this.chaine = String.valueOf(b);
	}
	
	public String getInfo() {
		StringBuilder result = new StringBuilder("");
		int longueur = chaine.length();
		result.append("longueur: ").append(longueur).append(" ");
		if (longueur > 0) {
			result.append("premier caractere: ").append(chaine.charAt(0)).append(" ");
			result.append("dernier caractere: ").append(chaine.charAt(longueur - 1)).append(" ");
		}
		return result.toString();
	}
	
	public String ChangeString() {
		StringBuilder result = new StringBuilder(chaine);
		int i = result.indexOf("ô");
		while (i != -1) {
			result.replace(i, i+1, "os");
			i = result.indexOf("ô");
		}
		if (result.length() > 26) result.setLength(26);
		chaine = result.toString();
		return chaine;
	}
	
	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}
	
	@Override
	public String toString() {
		return chaine;
	}
	
}
