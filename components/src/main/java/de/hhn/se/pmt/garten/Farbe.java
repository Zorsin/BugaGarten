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
	schwarz;
	private int ID;
	public static Farbe get(int i){
		switch (i){
			case 0:
				return weiss;
			case 1:
				return gelb;
			case 2:
				return roetlich;
			default:
				return weiss;
		}
	}
}
//ORM Hash:ca38174144d5f0c22f4b9c44b2e42227