/**
 * 
 */
package com.formation.junit.permis;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author excilys
 *
 */
public class CandidatTest {
	
	Candidat c;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		c = new Candidat();
		c.setDateNaissance("27/09/1986");
		c.setCodeObtenu(true);
		c.setNom("Gautier");
		c.setNumId(1123581347);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.formation.junit.permis.Candidat#getDateNaissanceFormattee()}.
	 */
	@Test
	public void testGetDateNaissanceFormattee() {
		c.setDateNaissance("27/09/1986");
		Date dn = c.getDateNaissance();
		assertNotNull(dn);
		try {
			assertTrue(sameDay(dn,Candidat.sdf.parse("27/09/1986")));
		} catch (ParseException e) {
			System.out.println("erreur dans l'ecriture du test.");
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.formation.junit.permis.Candidat#setDateNaissance(java.lang.String)}.
	 */
	@Test
	public void testSetDateNaissanceString() {
		c.setDateNaissance("27/09/1986");
		Date dn = c.getDateNaissance();
		assertNotNull(dn);
		try {
			assertTrue(sameDay(dn,Candidat.sdf.parse("27/09/1986")));
		} catch (ParseException e) {
			System.out.println("erreur dans l'ecriture du test.");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEquals() {
		c.setId(0);
		c.setNom("alith");
		c.setNumId(0);
		c.setDateNaissance("27/09/1986");
		c.setCodeObtenu(true);
		
		Candidat other = new Candidat();
		other.setId(0);
		other.setNom("alith");
		other.setNumId(0);
		other.setDateNaissance("27/09/1986");
		other.setCodeObtenu(true);
		
		assertTrue(c.equals(other));
		
		other.setNumId(3);
		
		assertFalse(c.equals(other));
		
	}
	
	private static boolean sameDay (Date d1, Date d2) {
		return Candidat.sdf.format(d1).equals(Candidat.sdf.format(d2));
	}
	
}
