/**
 * 
 */
package com.excilys.formation.spring.exo2;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author excilys
 * 
 */
@Service
public class SomeService {

	@Autowired
	private SomeDAO SomeThingDAO;
	private String login;
	private String password;
	@Resource(name = "ressource1")
	private SomeRessource ressource1;
	@Resource(name = "ressource2")
	private SomeRessource ressource2;

	/**
	 * 
	 */
	public SomeService() {
		// TODO Auto-generated constructor stub
	}

	public SomeDAO getSomeThingDAO() {
		return SomeThingDAO;
	}

	public void setSomeThingDAO(SomeDAO someThingDAO) {
		SomeThingDAO = someThingDAO;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SomeRessource getRessource1() {
		return ressource1;
	}

	public void setRessource1(SomeRessource ressource1) {
		this.ressource1 = ressource1;
	}

	public SomeRessource getRessource2() {
		return ressource2;
	}

	public void setRessource2(SomeRessource ressource2) {
		this.ressource2 = ressource2;
	}
}
