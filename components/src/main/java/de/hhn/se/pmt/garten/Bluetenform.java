/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

/**
 * @author SWirries
 */
public enum Bluetenform {
	dreiBlaettrig,
	vierBlaettrig,
	fuenfBlaettrig,
	sechsBlaettrig,
	vielBlaettrig;
	private int ID;
	public static Bluetenform get(int i){
		switch (i){
			case 0:
				return dreiBlaettrig;
			case 1:
				return vierBlaettrig;
			case 2:
				return fuenfBlaettrig;
			case 3:
				return sechsBlaettrig;
			case 4:
				return vielBlaettrig;
			default:
				return dreiBlaettrig;
		}
	}
}
//ORM Hash:dab7ae7138226c3eeece9a7c689b51d8