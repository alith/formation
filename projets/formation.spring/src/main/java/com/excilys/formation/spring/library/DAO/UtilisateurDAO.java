package com.excilys.formation.spring.library.DAO;

import com.excilys.formation.spring.library.model.Utilisateur;

public interface UtilisateurDAO extends DAO<Utilisateur> { // rq il n'y a aucune
															// difference :)

	public void add(Utilisateur utilisateur);

	public void remove(Utilisateur utilisateur);

	public Utilisateur findById(int idUtilisateur);
}
