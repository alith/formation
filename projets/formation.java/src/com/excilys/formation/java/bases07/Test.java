/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class Test {
	
	private static void displayUsage(int exitStatus) {
		System.out.println("usage: java Test <prenom> <code langue>");
		System.out.println();
		System.out.println("codes langues disponibles:");
		System.out.println(" - a     -> anglais");
		System.out.println(" - f     -> francais");
		System.out.println(" - e     -> espagnol");
		System.out.println(" - i     -> italien");
		System.exit(exitStatus);
	}
	
	private static void SayHello(Personne personne) {
		personne.hello();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 2) {
			displayUsage(1);
		}
		if (args[1].length() != 1){
			displayUsage(2);
		}
		
		char c = args[1].charAt(0);
		
		Personne p = null;
		
		switch (c) {
			case 'a' : p = new Personne(args[0]);break;
			case 'f' : p = new Francais(args[0]);break;
			case 'e' : p = new Espagnol(args[0]);break;
			case 'i' : p = new Italien(args[0]);break;
			default:displayUsage(3);break;
		}
		
		SayHello(p);
		
	}

}
