/**
 * 
 */
package com.excilys.formation.java.bases07;

/**
 * @author excilys
 *
 */
public class TestA {
	
	private static void displayUsage(int exitStatus) {
		System.out.println("usage: java Test <prenom> <code langue>");
		System.out.println();
		System.out.println("codes langues disponibles:");
		System.out.println(" - f     -> francais");
		System.out.println(" - e     -> espagnol");
		System.out.println(" - i     -> italien");
		System.exit(exitStatus);
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
		
		AbstractPersonne p = null;
		
		switch (c) {
			case 'f' : p = new FrancaisA(args[0]);break;
			case 'e' : p = new EspagnolA(args[0]);break;
			case 'i' : p = new ItalienA(args[0]);break;
			default:displayUsage(3);break;
		}
		
		p.sayHello();
		
	}

}
