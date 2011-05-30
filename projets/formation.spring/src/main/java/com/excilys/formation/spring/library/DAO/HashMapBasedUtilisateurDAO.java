/**
 * 
 */
package com.excilys.formation.spring.library.DAO;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.excilys.formation.spring.library.model.Utilisateur;

/**
 * @author excilys
 * 
 */
@Repository
@Qualifier("utilisateursDAO")
public class HashMapBasedUtilisateurDAO implements UtilisateurDAO {

	@Autowired
	@Qualifier("utilisateurs")
	private HashMap<Integer, Utilisateur> utilisateurs;

	public HashMapBasedUtilisateurDAO() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.excilys.formation.spring.library.DAO.UtilisateurDAO#add(com.excilys
	 * .formation.spring.library.model.Utilisateur)
	 */
	@Override
	public void add(Utilisateur utilisateur) {
		utilisateurs.put(utilisateur.getId(), utilisateur);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.excilys.formation.spring.library.DAO.UtilisateurDAO#remove(com.excilys
	 * .formation.spring.library.model.Utilisateur)
	 */
	@Override
	public void remove(Utilisateur utilisateur) {
		utilisateurs.remove(utilisateur.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.excilys.formation.spring.library.DAO.UtilisateurDAO#findById(int)
	 */
	@Override
	public Utilisateur findById(int idUtilisateur) {
		return utilisateurs.get(idUtilisateur);
	}

	public HashMap<Integer, Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(HashMap<Integer, Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
