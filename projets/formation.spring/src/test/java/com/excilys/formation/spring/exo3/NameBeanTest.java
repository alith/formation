/**
 * 
 */
package com.excilys.formation.spring.exo3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author excilys
 * 
 */
@Component
@Qualifier("NameBeanTest")
public class NameBeanTest {

	@Autowired
	@Qualifier("NameBean")
	private NameBean nb;

	public NameBean getNb() {
		return nb;
	}

	public void setNb(NameBean nb) {
		this.nb = nb;
	}

	@Test
	public void getBeanNameTest() {
		assertTrue(nb.getBeanName().equals("NameBean"));
	}

	@Before
	public void setup() {
		BeanFactory bf = new ClassPathXmlApplicationContext("exo3.xml");
		nb = NameBean.class.cast(bf.getBean("NameBean"));
	}

}
