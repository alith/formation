package com.excilys.formation.spring.library.DAO;

import com.excilys.formation.spring.library.model.Book;

public interface BookDAO extends DAO<Book> { // rq il n'y a aucune difference :)

	public void add(Book book);

	public void remove(Book book);

	public Book findById(int idBook);
}
