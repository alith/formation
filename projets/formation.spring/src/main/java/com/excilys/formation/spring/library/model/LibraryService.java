package com.excilys.formation.spring.library.model;

public interface LibraryService {

	public void pret(int identifiantLivre, int identifiantUtilisateur);

	public void retour(int identifiantLivre);

	// reservations?

}
