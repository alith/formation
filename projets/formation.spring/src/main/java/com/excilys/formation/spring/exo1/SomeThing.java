package com.excilys.formation.spring.exo1;

/**
 * 
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.excilys.formation.spring.exo2.SomeService;

/**
 * @author excilys
 * 
 */
public class SomeThing {

	private String chaine;
	private int nombre;
	private double flottant;
	private Set<String> ensemble;
	private List<String> liste;
	private Map<String, String> dico;

	/**
	 * 
	 */
	public SomeThing() {
	}

	public static void main(String args[]) {
		BeanFactory bf = new ClassPathXmlApplicationContext("someThing.xml");
		SomeThing unTruc = SomeThing.class.cast(bf.getBean("unTruc"));
		SomeThing unDeuxiemeTruc = SomeThing.class.cast(bf.getBean("unDeuxiemeTruc"));
		System.out.println("premiere methode:");
		System.out.println("=================");
		System.out.println("unTruc:");
		System.out.println(unTruc);
		System.out.println("unDeuxiemeTruc:");
		System.out.println(unDeuxiemeTruc);
		System.out.println();

		// bf = new SimpleJndiBeanFactory(); // marche po.
		// TODO trouver une autre methode...
		unTruc = SomeThing.class.cast(bf.getBean("unTruc"));
		unDeuxiemeTruc = SomeThing.class.cast(bf.getBean("unDeuxiemeTruc"));
		System.out.println("deuxieme methode:");
		System.out.println("=================");
		System.out.println("unTruc:");
		System.out.println(unTruc);
		System.out.println("unDeuxiemeTruc:");
		System.out.println(unDeuxiemeTruc);
		System.out.println();

		SomeService serv = SomeService.class.cast(bf.getBean("SomeService"));
		assert (serv.getSomeThingDAO() != null);
		System.out.println("le service est dans l'etat:");
		System.out.println("login = " + serv.getLogin());
		System.out.println("password = " + serv.getPassword());
		System.out.println("ressource1 = " + serv.getRessource1());
		System.out.println("ressource2 = " + serv.getRessource2());
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("chaine=").append(chaine).append("; ");
		result.append("nombre=").append(nombre).append("; ");
		result.append("flottant=").append(flottant).append("; ");
		result.append("ensemble=").append(ensemble).append("; ");
		result.append("liste=").append(liste).append("; ");
		result.append("dico=").append(dico).append(".");
		return result.toString();
	}

	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public double getFlottant() {
		return flottant;
	}

	public void setFlottant(double flottant) {
		this.flottant = flottant;
	}

	public Set<String> getEnsemble() {
		return ensemble;
	}

	public void setEnsemble(Set<String> ensemble) {
		this.ensemble = ensemble;
	}

	public List<String> getListe() {
		return liste;
	}

	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	public Map<String, String> getDico() {
		return dico;
	}

	public void setDico(Map<String, String> dico) {
		this.dico = dico;
	}

}
