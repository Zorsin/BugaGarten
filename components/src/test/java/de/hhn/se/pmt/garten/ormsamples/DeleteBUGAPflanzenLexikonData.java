/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten.ormsamples;

import de.hhn.se.pmt.garten.dao.DAOFactory;
import org.orm.*;
public class DeleteBUGAPflanzenLexikonData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().getSession().beginTransaction();
		try {
			DAOFactory lDAOFactory = DAOFactory.getDAOFactory();
			de.hhn.se.pmt.garten.dao.PflanzeDAO ldehhnsepmtgartenPflanzeDAO = lDAOFactory.getPflanzeDAO();
			de.hhn.se.pmt.garten.Pflanze ldehhnsepmtgartenPflanze = ldehhnsepmtgartenPflanzeDAO.loadPflanzeByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtgartenPflanzeDAO.delete(ldehhnsepmtgartenPflanze);
			de.hhn.se.pmt.garten.dao.StandortDAO ldehhnsepmtgartenStandortDAO = lDAOFactory.getStandortDAO();
			de.hhn.se.pmt.garten.Standort ldehhnsepmtgartenStandort = ldehhnsepmtgartenStandortDAO.loadStandortByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtgartenStandortDAO.delete(ldehhnsepmtgartenStandort);
			de.hhn.se.pmt.garten.dao.BildDAO ldehhnsepmtgartenBildDAO = lDAOFactory.getBildDAO();
			de.hhn.se.pmt.garten.Bild ldehhnsepmtgartenBild = ldehhnsepmtgartenBildDAO.loadBildByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtgartenBildDAO.delete(ldehhnsepmtgartenBild);
			de.hhn.se.pmt.garten.dao.BesucherDAO ldehhnsepmtgartenBesucherDAO = lDAOFactory.getBesucherDAO();
			de.hhn.se.pmt.garten.Besucher ldehhnsepmtgartenBesucher = ldehhnsepmtgartenBesucherDAO.loadBesucherByQuery(null, null);
			// Delete the persistent object
			ldehhnsepmtgartenBesucherDAO.delete(ldehhnsepmtgartenBesucher);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteBUGAPflanzenLexikonData deleteBUGAPflanzenLexikonData = new DeleteBUGAPflanzenLexikonData();
			try {
				deleteBUGAPflanzenLexikonData.deleteTestData();
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
