/**
 * 
 */
package com.formation.junit.permis;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author excilys
 *
 */
public class CandidatDAOTest {
	
	CandidatDAO dao;
	Candidat moi;
	ArrayList<Candidat> pojos;
	
	public CandidatDAOTest() {
		dao = new CandidatDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		dao.connect();
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
		dao.disconnect();
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#register(com.formation.junit.permis.Candidat)}.
	 */
	@Test
	public void testRegister() {
		dao.register(moi);
		pojos = dao.findByName("Gautier");
		assertTrue(pojos.size()==1);
		assertTrue(pojos.get(0).equals(moi));
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#findById(int)}.
	 */
	@Test
	public void testFindById() {
		Candidat c1 = dao.findById(1);
		Candidat c2= new Candidat();
		c2.setId(1);
		c2.setNom("DUPONT");
		c2.setNumId(123456789);
		c2.setDateNaissance("12/02/1995");
		c2.setCodeObtenu(true);
		assertTrue(c1.equals(c2));
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#findByNumId(int)}.
	 */
	@Test
	public void testFindByNumId() {
		pojos = dao.findByNumId(1123581347);
		assertTrue(pojos.size()==1);
		assertTrue(pojos.get(0).equals(moi));
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#findByName(java.lang.String)}.
	 */
	@Test
	public void testFindByName() {
		dao.register(moi);
		pojos = dao.findByName("Gautier");
		assertTrue(pojos.size()==2);
		assertTrue(pojos.get(0).equals(moi));
		assertTrue(pojos.get(1).equals(moi));
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#update(com.formation.junit.permis.Candidat)}.
	 */
	@Test
	public void testUpdate() {
		moi.setNumId(666);
		dao.update(moi);
		pojos = dao.findByNumId(666);
		assertTrue(pojos.size()==1);
		assertTrue(pojos.get(0).equals(moi));
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#delete(com.formation.junit.permis.Candidat)}.
	 */
	@Test
	public void testDelete() {
		pojos = dao.findByName("Gautier");
		for (Candidat ca : pojos) {
			dao.delete(ca);
		}
		pojos = dao.findByName("Gautier");
		assertTrue(pojos.isEmpty());
	}

}
