/**
 * 
 */
package com.excilys.formation.spring.library.DAO;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.excilys.formation.spring.library.model.Book;

/**
 * @author excilys
 * 
 */
@Repository
@Qualifier("booksDAO")
public class SetBasedBookDAO implements BookDAO {

	@Autowired
	@Qualifier("books")
	private Set<Book> books;

	/**
	 * 
	 */
	public SetBasedBookDAO() {
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	@Override
	public void add(Book book) {
		books.add(book);
	}

	@Override
	public void remove(Book book) {
		books.remove(book);
	}

	@Override
	public Book findById(int idBook) {
		Book result = null;
		for (Book b : books) {
			if (b.getId() == idBook)
				result = b;
		}
		return result;
	}
}
