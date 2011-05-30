package com.excilys.formation.spring.library.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.excilys.formation.spring.library.DAO.BookDAO;
import com.excilys.formation.spring.library.DAO.UtilisateurDAO;

@Component
@Scope("singleton")
public class SimpleLibraryService implements LibraryService {

	@Autowired
	@Qualifier("booksDAO")
	private BookDAO bibliotheque;

	@Autowired
	@Qualifier("utilisateursDAO")
	private UtilisateurDAO utilisateurs;

	@Override
	public void pret(int identifiantLivre, int identifiantUtilisateur) {
		Book b = bibliotheque.findById(identifiantLivre);
		// TODO verifier que le livre n'est pas deja emprunté, jeté des erreurs
		// typées. idem pour l'utilisateur, etc...
		bibliotheque.remove(b);
		Utilisateur u = utilisateurs.findById(identifiantUtilisateur);
		b.setEmprunte(true);
		b.setUtilisateur(u);
		bibliotheque.add(b);
	}

	@Override
	public void retour(int identifiantLivre) {
		// TODO Auto-generated method stub

	}

	public BookDAO getBibliotheque() {
		return bibliotheque;
	}

	public void setBibliotheque(BookDAO bibliotheque) {
		this.bibliotheque = bibliotheque;
	}

}
