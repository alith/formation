/**
 * 
 */
package com.formation.junit.permis;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author excilys
 *
 */
public class CandidatDAOConnectionTest {
	
	CandidatDAO c = new CandidatDAO();

	
	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#connect()}.
	 */
	@Test
	public void testConnect() {
		try {
			c.connect();
		} catch (RuntimeException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	/**
	 * Test method for {@link com.formation.junit.permis.CandidatDAO#disconnect()}.
	 */
	@Test
	public void testDisconnect() {
		try {
			c.connect();
			c.disconnect();
		} catch (RuntimeException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

}
