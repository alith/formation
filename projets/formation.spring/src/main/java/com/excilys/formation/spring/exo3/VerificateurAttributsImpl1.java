/**
 * 
 */
package com.excilys.formation.spring.exo3;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author excilys
 * 
 */
public class VerificateurAttributsImpl1 extends VerificateurAttributs implements InitializingBean {

	// ATTRIBUTS

	protected boolean proprietesInitialisees;

	// CONSTRUCTEURS

	/**
	 * 
	 */
	public VerificateurAttributsImpl1() {
		proprietesInitialisees = false;
	}

	// METHODES

	public void afterPropertiesSet() throws Exception {
		proprietesInitialisees = true;
		proprietesInitialisees &= (chaine != null);
		proprietesInitialisees &= (liste != null);
		proprietesInitialisees &= (dico != null);
		proprietesInitialisees &= (nameBean != null);
		proprietesInitialisees &= (ensemble != null);
	}

	// ACCESSEURS ET MUTATEURS:

	public boolean isProprietesInitialisees() {
		return proprietesInitialisees;
	}

	public void setProprietesInitialisees(boolean proprietesInitialisees) {
		this.proprietesInitialisees = proprietesInitialisees;
	}
}
