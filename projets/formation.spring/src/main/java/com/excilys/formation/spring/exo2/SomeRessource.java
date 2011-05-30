/**
 * 
 */
package com.excilys.formation.spring.exo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author excilys
 * 
 */
@Component
@Scope("singleton")
public class SomeRessource {

	private String name;

	/**
	 * 
	 */
	public SomeRessource() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "je suis une ressource est mon nom est: " + name;
	}

}
