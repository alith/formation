/**
 * 
 */
package com.excilys.formation.spring.exo3;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author excilys
 * 
 */
public class VerificateurAttributsImpl2 extends VerificateurAttributs {

	// ACCESSEURS ET MUTATEURS:

	@Override
	@Required
	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	@Override
	@Required
	public void setEnsemble(Set<String> ensemble) {
		this.ensemble = ensemble;
	}

	@Override
	@Required
	public void setListe(List<String> liste) {
		this.liste = liste;
	}

	@Override
	@Required
	public void setDico(Map<String, String> dico) {
		this.dico = dico;
	}

	@Override
	@Required
	public void setNameBean(NameBean nameBean) {
		this.nameBean = nameBean;
	}
}
