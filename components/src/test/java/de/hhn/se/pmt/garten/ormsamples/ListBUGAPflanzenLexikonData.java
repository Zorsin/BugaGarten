/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten.ormsamples;

import de.hhn.se.pmt.garten.dao.DAOFactory;
import org.orm.*;
public class ListBUGAPflanzenLexikonData {
	private static final int ROW_COUNT = 100;
	
public void listTestData() throws PersistentException {
		DAOFactory lDAOFactory = DAOFactory.getDAOFactory();
		System.out.println("Listing Pflanze...");
		de.hhn.se.pmt.garten.Pflanze[] dehhnsepmtgartenPflanzes = lDAOFactory.getPflanzeDAO().listPflanzeByQuery(null, null);
		int length = Math.min(dehhnsepmtgartenPflanzes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtgartenPflanzes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Standort...");
		de.hhn.se.pmt.garten.Standort[] dehhnsepmtgartenStandorts = lDAOFactory.getStandortDAO().listStandortByQuery(null, null);
		length = Math.min(dehhnsepmtgartenStandorts.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtgartenStandorts[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Bild...");
		de.hhn.se.pmt.garten.Bild[] dehhnsepmtgartenBilds = lDAOFactory.getBildDAO().listBildByQuery(null, null);
		length = Math.min(dehhnsepmtgartenBilds.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtgartenBilds[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Besucher...");
		de.hhn.se.pmt.garten.Besucher[] dehhnsepmtgartenBesuchers = lDAOFactory.getBesucherDAO().listBesucherByQuery(null, null);
		length = Math.min(dehhnsepmtgartenBesuchers.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(dehhnsepmtgartenBesuchers[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListBUGAPflanzenLexikonData listBUGAPflanzenLexikonData = new ListBUGAPflanzenLexikonData();
			try {
				listBUGAPflanzenLexikonData.listTestData();
			}
			finally {
				de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
