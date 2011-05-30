/**
 * 
 */
package com.excilys.formation.spring.exo3;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author excilys
 * 
 */
public class NameBean implements BeanNameAware {

	private String beanName;

	/**
	 * 
	 */
	public NameBean() {
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String arg0) {
		beanName = arg0;
	}
}
