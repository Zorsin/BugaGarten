/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

/**
 * @author SWirries
 */
public enum Gewaechsart {
	baum,
	strauch,
	kraut,
	kletterpflanze,
	gras,
	farn;
	private int ID;
	public static Gewaechsart get(int i){
		switch (i){
			case 0:
				return baum;
			case 1:
				return strauch;
			case 2:
				return kraut;
			case 3:
				return kletterpflanze;
			case 4:
				return gras;
			case 5:
				return farn;
			default:
				return strauch;
		}
	}
	
}
//ORM Hash:83addbb3be19def332aab03168f71b5b