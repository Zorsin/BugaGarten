/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

/**
 * @author SWirries
 */
public enum Farbe {
	weiss,
	gelb,
	roetlich,
	blaeulich,
	gruen,
	orange,
	rot,
	violett,
	schwarz,
	keine;
	private int ID;
	public static Farbe get(int i){
		switch (i){
			case 0:
				return weiss;
			case 1:
				return gelb;
			case 2:
				return roetlich;
			case 3:
				return blaeulich;
			case 4:
				return gruen;
			case 5:
				return orange;
			case 6:
				return rot;
			case 7:
				return violett;
			case 8:
				return schwarz;
			case 9:
				return keine;
			default:
				return weiss;
		}
	}
}
//ORM Hash:ca38174144d5f0c22f4b9c44b2e42227