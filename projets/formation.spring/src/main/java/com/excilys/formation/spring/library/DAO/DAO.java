/**
 * 
 */
package com.excilys.formation.spring.library.DAO;

/**
 * @author excilys
 * 
 */
public interface DAO<T> {

	public void add(T item);

	public void remove(T item);

	public T findById(int idItem);

}
