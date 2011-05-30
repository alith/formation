/**
 * 
 */
package com.excilys.formation.spring.exo3;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author excilys
 * 
 */
public abstract class VerificateurAttributs {

	// ATTRIBUTS

	protected String chaine;
	protected Set<String> ensemble;
	protected List<String> liste;
	protected Map<String, String> dico;
	protected NameBean nameBean;

	// ACCESSEURS ET MUTATEURS:

	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
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

	public NameBean getNameBean() {
		return nameBean;
	}

	public void setNameBean(NameBean nameBean) {
		this.nameBean = nameBean;
	}
}
