/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten.ormsamples;

import de.hhn.se.pmt.garten.dao.DAOFactory;
import org.orm.*;
public class RetrieveAndUpdateBUGAPflanzenLexikonData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().getSession().beginTransaction();
		try {
			DAOFactory lDAOFactory = DAOFactory.getDAOFactory();
			de.hhn.se.pmt.garten.dao.PflanzeDAO ldehhnsepmtgartenPflanzeDAO = lDAOFactory.getPflanzeDAO();
			de.hhn.se.pmt.garten.Pflanze ldehhnsepmtgartenPflanze = ldehhnsepmtgartenPflanzeDAO.loadPflanzeByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtgartenPflanzeDAO.save(ldehhnsepmtgartenPflanze);
			de.hhn.se.pmt.garten.dao.StandortDAO ldehhnsepmtgartenStandortDAO = lDAOFactory.getStandortDAO();
			de.hhn.se.pmt.garten.Standort ldehhnsepmtgartenStandort = ldehhnsepmtgartenStandortDAO.loadStandortByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtgartenStandortDAO.save(ldehhnsepmtgartenStandort);
			de.hhn.se.pmt.garten.dao.BildDAO ldehhnsepmtgartenBildDAO = lDAOFactory.getBildDAO();
			de.hhn.se.pmt.garten.Bild ldehhnsepmtgartenBild = ldehhnsepmtgartenBildDAO.loadBildByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtgartenBildDAO.save(ldehhnsepmtgartenBild);
			de.hhn.se.pmt.garten.dao.BesucherDAO ldehhnsepmtgartenBesucherDAO = lDAOFactory.getBesucherDAO();
			de.hhn.se.pmt.garten.Besucher ldehhnsepmtgartenBesucher = ldehhnsepmtgartenBesucherDAO.loadBesucherByQuery(null, null);
			// Update the properties of the persistent object
			ldehhnsepmtgartenBesucherDAO.save(ldehhnsepmtgartenBesucher);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateBUGAPflanzenLexikonData retrieveAndUpdateBUGAPflanzenLexikonData = new RetrieveAndUpdateBUGAPflanzenLexikonData();
			try {
				retrieveAndUpdateBUGAPflanzenLexikonData.retrieveAndUpdateTestData();
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
