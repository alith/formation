/**
 * 
 */
package com.formation.junit.permis;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author excilys
 *
 */
public class CandidatServiceTest {
	
	Candidat moi;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		moi = new Candidat();
		moi.setDateNaissance("27/09/1986");
		moi.setCodeObtenu(true);
		moi.setNom("Gautier");
		moi.setNumId(1123581347);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatService#estAdmissible(com.formation.junit.permis.Candidat)}.
	 */
	@Test
	public void testEstAdmissible() {
		assertTrue(CandidatService.estAdmissible(moi));
		moi.setCodeObtenu(false);
		assertFalse(CandidatService.estAdmissible(moi));
		moi.setDateNaissance("25/01/2010");
		assertFalse(CandidatService.estAdmissible(moi));
		moi.setCodeObtenu(true);
		assertFalse(CandidatService.estAdmissible(moi));
	}

}
