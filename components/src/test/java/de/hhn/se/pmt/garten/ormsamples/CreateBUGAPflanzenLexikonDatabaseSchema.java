/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten.ormsamples;

import org.orm.*;
public class CreateBUGAPflanzenLexikonDatabaseSchema {
	public static void main(String[] args) {
		try {
			ORMDatabaseInitiator.createSchema(de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance());
			de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().disposePersistentManager();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
