/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

/**
 * @author SWirries
 */
public enum Wuchshoehe {
	EinCmBisZehnCm,
	ZehnCmBisDreissigCm,
	DreissigCmBisSechzigCm,
	SechzigCmBisHundertCm,
	EinMBisEinsFuenfM,
	EinsFuenfMBisDreiM,
	DreiMBisFuenfM,
	FuenfMBisZehnM,
	ZehnMBisZwanzigM,
	ZwanzigMBisDreissigM,
	DreissigMBisFuenfzigM;
	private int ID;
	public static Wuchshoehe get(int i){
	  switch (i){
        case 0:
          return EinCmBisZehnCm;
        case 1:
          return ZehnCmBisDreissigCm;
        case 2:
          return DreissigCmBisSechzigCm;
        default:
          return EinMBisEinsFuenfM;
      }
    }
	
}
//ORM Hash:f01c3eca8b129ad99920e930ba45cf85