/**
 * 
 */
package com.excilys.formation.spring.exo3;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author excilys
 * 
 */
public class VerificateurAttributsTest {

	public static final String IMPLEMENTATION_TESTEE = "VerificateurAttributsImpl2";

	private VerificateurAttributs va;

	public VerificateurAttributs getVa() {
		return va;
	}

	public void setVa(VerificateurAttributs va) {
		this.va = va;
	}

	@Before
	public void setup() {
		BeanFactory bf = new ClassPathXmlApplicationContext("exo3.xml");
		va = VerificateurAttributs.class.cast(bf.getBean(IMPLEMENTATION_TESTEE));
	}

	@Test
	public void getBeanNameTest() {
		assertNotNull(va);
		assertNotNull(va.getChaine());
		assertNotNull(va.getDico());
		assertNotNull(va.getEnsemble());
		assertNotNull(va.getListe());
		assertNotNull(va.getNameBean());
	}

}
