package com.excilys.formation.spring.exo1;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.excilys.formation.spring.exo1.SomeThing;


/**
 * 
 */

/**
 * @author excilys
 * 
 */
public class SomeThingTest {

	private SomeThing st;

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	public void setUp() throws Exception {
		st = new SomeThing();
		st.setChaine("chaine");
		st.setFlottant(3.1416);
		st.setNombre(0);
		HashSet<String> hs = new HashSet<String>();
		hs.add("elementEnsemble1");
		hs.add("elementEnsemble2");
		st.setEnsemble(hs);
		ArrayList<String> al = new ArrayList<String>();
		al.add("elementListe1");
		al.add("elementListe2");
		st.setListe(al);
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("index1", "valeur1");
		hm.put("index2", "valeur2");
		st.setDico(hm);
	}

	@Test
	public void toStringTest() {
		assertTrue(st
				.toString()
				.equals("chaine=chaine; nombre=0; flottant=3.1416; ensemble=[elementEnsemble2, elementEnsemble1]; liste=[elementListe1, elementListe2]; dico={index1=valeur1, index2=valeur2}."));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	public void tearDown() throws Exception {
	}

}
