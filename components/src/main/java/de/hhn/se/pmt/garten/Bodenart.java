/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

/**
 * @author SWirries
 */
public enum Bodenart {
	wiese,
	mauer_Felsen,
	wald,
	gaerten_Parks,
	kies_Schutt,
	strand_Kueste,
	moor_Gewaesser,
	ufer_Damm,
	/**
	 * >900m
	 */
	mittelgebirge,
	/**
	 * >1500m
	 */
	alpen;
	private int ID;
	public static Bodenart get(int i){
		switch (i){
			case 0:
				return wiese;
			case 1:
				return mauer_Felsen;
			case 2:
				return wald;
			case 3:
				return gaerten_Parks;
			case 4:
				return kies_Schutt;
			case 5:
				return strand_Kueste;
			case 6:
				return moor_Gewaesser;
			case 7:
				return ufer_Damm;
			case 8:
				return mittelgebirge;
			case 9:
				return alpen;
			default:
				return wiese;
		}
	}
}
//ORM Hash:99280dbd0e3e4de1b2d6001d7ba029e9