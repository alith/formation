// siteswapNotation.java
//
// Copyright 2003 by Jack Boyce (jboyce@users.sourceforge.net) and others

/*
    This file is part of Juggling Lab.

    Juggling Lab is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    Juggling Lab is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Juggling Lab; if not, write to the Free Software
    Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package com.jonglen7.jugglinglab.jugglinglab.notation;

import com.jonglen7.jugglinglab.jugglinglab.jml.JMLPattern;
import com.jonglen7.jugglinglab.jugglinglab.util.JuggleExceptionInternal;
import com.jonglen7.jugglinglab.jugglinglab.util.JuggleExceptionUser;
import com.jonglen7.jugglinglab.jugglinglab.util.Permutation;


public class siteswapNotation extends mhnNotation {

    public String getName() {
        return "Siteswap";
    }

    public JMLPattern getJMLPattern(String config) throws JuggleExceptionUser, JuggleExceptionInternal {

		// This entire method will need to be double-checked for suitability with siteswap2 notation
		
        siteswapPattern p = new siteswapPattern();

        // delete newlines and carriage returns from string
        int pos;
        while ((pos = config.indexOf('\n')) >= 0) {
            config = config.substring(0,pos) + config.substring(pos+1,config.length());
        }
        while ((pos = config.indexOf('\r')) >= 0) {
            config = config.substring(0,pos) + config.substring(pos+1,config.length());
        }
        
        p.parseInput(config);
        String origpattern = p.pattern;

        // see if we need to repeat the pattern to match hand or body periods:
        if ((p.hands != null) || (p.bodies != null)) {
            p.parsePattern();
            int patperiod = p.getNorepPeriod();

            int handperiod = 1;
            if (p.hands != null) {
                for (int i = 1; i <= p.getNumberOfJugglers(); i++)
                    handperiod = Permutation.lcm(handperiod, p.hands.getPeriod(i));
            }

            int bodyperiod = 1;
            if (p.bodies != null) {
                for (int i = 1; i <= p.getNumberOfJugglers(); i++)
                    bodyperiod = Permutation.lcm(bodyperiod, p.bodies.getPeriod(i));
            }

            // The following is a hack to compensate for the fact that JuggleAnim
            // displays synch patterns so that the leftmost slot in the (,) corresponds
            // to the right hand.  We switch the right and left hands in the mat_style
            // parameter, if one was given.
			
			// Commented out for now; need to figure out how to apply the hack under
			// siteswap2 notation (if at all)
			
			/*
            if (p.mat_style && (p.getMode() == siteswap_oldPattern.MODE_SYNCH)) {
                String handstring = "";
                int count = ((handperiod%2 == 1) ? (2*handperiod) : handperiod);
                for (int i = 0; i < count; i += 2) {
                    int index = (i + 1) % handperiod;
                    Coordinate c = p.hands.getCoordinate(1, index, 0);
                    handstring += "("+c.x+","+c.z+")";
                    c = p.hands.getCoordinate(1, index, p.hands.getCatchIndex(1, index));
                    handstring += "("+c.x+","+c.z+").";
                    index = i % handperiod;
                    c = p.hands.getCoordinate(1, index, 0);
                    handstring += "("+c.x+","+c.z+")";
                    c = p.hands.getCoordinate(1, index, p.hands.getCatchIndex(1, index));
                    handstring += "("+c.x+","+c.z+").";
                }
                handperiod = count;

                p.hands = new mhnHands(handstring);
            }
			*/

            int totalperiod = patperiod;
            totalperiod = Permutation.lcm(totalperiod, handperiod);
            totalperiod = Permutation.lcm(totalperiod, bodyperiod);

            if (totalperiod != patperiod) {
                int repeats = totalperiod / patperiod;
                p.pattern = "(" + p.pattern + "^" + repeats + ")";
            }
        }
        
        p.parsePattern();

        // The following is a hack to support the legacy "mat_HR" parameter
        // from JuggleAnim.  Adjust bps to achieve the desired maximum throw height.
        if (p.mat_hr > 0.0) {
            try {
                p.bps = Math.sqrt(p.gravity / (800.0 * p.mat_hr * (double)p.getMaxThrow())) *
                ((double)p.getMaxThrow() - p.dwell);
            } catch (ArithmeticException e) {
            }
        }

        JMLPattern result = getJML(p);
    	
        result.setTitle(origpattern);

    	if (com.jonglen7.jugglinglab.jugglinglab.core.Constants.DEBUG_LAYOUT)
            System.out.println(result);

        return result;
    }

}
