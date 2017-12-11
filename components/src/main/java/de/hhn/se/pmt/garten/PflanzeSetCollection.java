/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten;

import org.orm.*;

public class PflanzeSetCollection extends org.orm.util.ORMSet {
	public PflanzeSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int targetKey, int collType) {
		super(owner, adapter, ownerKey, targetKey, true, collType);
	}
	
	public PflanzeSetCollection(Object owner, org.orm.util.ORMAdapter adapter, int ownerKey, int collType) {
		super(owner, adapter, ownerKey, -1, false, collType);
	}
	
	/**
	* Return an iterator over the persistent objects
	* @return The persistent objects iterator
	*/
	public java.util.Iterator getIterator() {
		return super.getIterator(_ownerAdapter);
	}
	
	/**
	 * Add the specified persistent object to ORMSet
	 * @param value the persistent object
	 */
	public void add(Pflanze value) {
		if (value != null) {
			super.add(value, value._ormAdapter);
		}
	}
	
	/**
	 * Remove the specified persistent object from ORMSet
	 * @param value the persistent object
	 */
	public void remove(Pflanze value) {
		super.remove(value, value._ormAdapter);
	}
	
	/**
	 * Return true if ORMSet contains the specified persistent object
	 * @param value the persistent object
	 * @return True if this contains the specified persistent object
	 */
	public boolean contains(Pflanze value) {
		return super.contains(value);
	}
	
	/**
	 * Return an array containing all of the persistent objects in ORMSet
	 * @return The persistent objects array
	 */
	public Pflanze[] toArray() {
		return (Pflanze[]) super.toArray(new Pflanze[size()]);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>botanischerName</li>
	 * <li>deutscherName</li>
	 * <li>beschreibung</li>
	 * <li>bluehdauer</li>
	 * <li>bluehzeitraum</li>
	 * <li>lebensdauer</li>
	 * <li>bodenart</li>
	 * <li>anpflanzzeitraum</li>
	 * <li>wuchshoehe</li>
	 * <li>duftend</li>
	 * <li>gewaechsart</li>
	 * <li>bluetenform</li>
	 * <li>angepflanztAufBuga</li>
	 * <li>bewertung</li>
	 * </ul>
	 * @return The persistent objects sorted array
	 */
	public Pflanze[] toArray(String propertyName) {
		return toArray(propertyName, true);
	}
	
	/**
	 * Return an sorted array containing all of the persistent objects in ORMSet
	 * @param propertyName Name of the property for sorting:<ul>
	 * <li>ID</li>
	 * <li>botanischerName</li>
	 * <li>deutscherName</li>
	 * <li>beschreibung</li>
	 * <li>bluehdauer</li>
	 * <li>bluehzeitraum</li>
	 * <li>lebensdauer</li>
	 * <li>bodenart</li>
	 * <li>anpflanzzeitraum</li>
	 * <li>wuchshoehe</li>
	 * <li>duftend</li>
	 * <li>gewaechsart</li>
	 * <li>bluetenform</li>
	 * <li>angepflanztAufBuga</li>
	 * <li>bewertung</li>
	 * </ul>
	 * @param ascending true for ascending, false for descending
	 * @return The persistent objects sorted array
	 */
	public Pflanze[] toArray(String propertyName, boolean ascending) {
		return (Pflanze[]) super.toArray(new Pflanze[size()], propertyName, ascending);
	}
	
	protected PersistentManager getPersistentManager() throws PersistentException {
		return BUGAPflanzenLexikonPersistentManager.instance();
	}
	
}

