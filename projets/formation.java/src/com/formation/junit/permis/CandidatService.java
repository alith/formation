/**
 * 
 */
package com.formation.junit.permis;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author excilys
 *
 */
public class CandidatService {

	
	public static boolean estAdmissible(Candidat c) {
		boolean result = false;
		if (!c.isCodeObtenu()) return result;
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(GregorianCalendar.YEAR, cal.get(GregorianCalendar.YEAR)-18);
		Date majorite = cal.getTime();
		if (majorite.compareTo(c.getDateNaissance())>=0) return true;
		return result;
	}

}
