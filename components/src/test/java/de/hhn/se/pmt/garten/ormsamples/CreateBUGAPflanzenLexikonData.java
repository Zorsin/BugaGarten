/**
 * Licensee: Wirries(Hochschule Heilbronn)
 * License Type: Academic
 */
package de.hhn.se.pmt.garten.ormsamples;

import de.hhn.se.pmt.garten.dao.DAOFactory;
import org.orm.*;
public class CreateBUGAPflanzenLexikonData {
	public void createTestData() throws PersistentException {
		// Insert sample data
		PersistentSession session = de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().getSession();
		PersistentTransaction transaction = session.beginTransaction();
		try {
			session.doWork(new org.hibernate.jdbc.Work() {
				public void execute(java.sql.Connection conn) throws java.sql.SQLException {
					java.sql.Statement statement = conn.createStatement();
					statement.executeUpdate("INSERT INTO Pflanze(ID, BotanischerName, DeutscherName, Beschreibung, Bluehdauer, Bluehzeitraum, Lebensdauer, Bodenart, Anpflanzzeitraum, Wuchshoehe, Duftend, Gewaechsart, Bluetenform, AngepflanztAufBuga, Bewertung) VALUES (1, 'Malus Domestica', 'Apfelbaum', 'Beschreibung Apfelbaum', 'April-Mai', 'April-Mai', 30, 1, 'September-November', 5, 0, 0, 0, 0, 0)");
					statement.executeUpdate("INSERT INTO Pflanze(ID, BotanischerName, DeutscherName, Beschreibung, Bluehdauer, Bluehzeitraum, Lebensdauer, Bodenart, Anpflanzzeitraum, Wuchshoehe, Duftend, Gewaechsart, Bluetenform, AngepflanztAufBuga, Bewertung) VALUES (2, 'Vitis Vinifera', 'Edle Weinrebe', 'Beschreibung Baum', 'April-Mai', 'April-Mai', 1, 1, 'September-November', 3, 0, 0, 0, 0, 0)");
					statement.executeUpdate("INSERT INTO Pflanze(ID, BotanischerName, DeutscherName, Beschreibung, Bluehdauer, Bluehzeitraum, Lebensdauer, Bodenart, Anpflanzzeitraum, Wuchshoehe, Duftend, Gewaechsart, Bluetenform, AngepflanztAufBuga, Bewertung) VALUES (3, 'Bellis Perennis', 'Gänseblümchen', '', 'April-Mai', 'April-Mai', 4, 1, 'September-November', 1, 0, 0, 0, 0, 0)");
					statement.executeUpdate("INSERT INTO `Tag`(PflanzeIndex, PflanzeID, `Tag`) VALUES (1, 1, 'Baum')");
					statement.executeUpdate("INSERT INTO `Tag`(PflanzeIndex, PflanzeID, `Tag`) VALUES (2, 2, '')");
					statement.executeUpdate("INSERT INTO `Tag`(PflanzeIndex, PflanzeID, `Tag`) VALUES (3, 3, '')");
					statement.executeUpdate("INSERT INTO BluetenFrarbe(PflanzeIndex, PflanzeID, Bluetenfarbe) VALUES (1, 1, 0)");
					statement.executeUpdate("INSERT INTO BluetenFrarbe(PflanzeIndex, PflanzeID, Bluetenfarbe) VALUES (2, 3, 0)");
					statement.executeUpdate("INSERT INTO BluetenFrarbe(PflanzeIndex, PflanzeID, Bluetenfarbe) VALUES (3, 2, 0)");
					statement.executeUpdate("INSERT INTO Fruchtfarbe(PflanzeIndex, PflanzeID, Fruchtfarbe) VALUES (1, 1, 1)");
					statement.executeUpdate("INSERT INTO Fruchtfarbe(PflanzeIndex, PflanzeID, Fruchtfarbe) VALUES (2, 1, 2)");
					statement.executeUpdate("INSERT INTO Fruchtfarbe(PflanzeIndex, PflanzeID, Fruchtfarbe) VALUES (3, 2, 2)");
					statement.executeUpdate("INSERT INTO Fruchtfarbe(PflanzeIndex, PflanzeID, Fruchtfarbe) VALUES (4, 2, 7)");
					statement.executeUpdate("INSERT INTO Fruchtfarbe(PflanzeIndex, PflanzeID, Fruchtfarbe) VALUES (5, 3, 0)");
					statement.executeUpdate("INSERT INTO Standort(ID, Latitude, Longitude) VALUES (1, 49.147412, 9.208217)");
					statement.executeUpdate("INSERT INTO Standort(ID, Latitude, Longitude) VALUES (2, 49.149784, 9.206747)");
					statement.executeUpdate("INSERT INTO Standort(ID, Latitude, Longitude) VALUES (3, 49.155229, 9.209397)");
					statement.executeUpdate("INSERT INTO Bild(ID, Dateiname, Dateipfad) VALUES (1, 'apfel.png', '//path/to/file/')");
					statement.executeUpdate("INSERT INTO Bild(ID, Dateiname, Dateipfad) VALUES (2, 'weinrebe.png', '//path/to/file/')");
					statement.executeUpdate("INSERT INTO Bild(ID, Dateiname, Dateipfad) VALUES (3, 'bluemchen.png', '//path/to/file/')");
					statement.executeUpdate("INSERT INTO Bild(ID, Dateiname, Dateipfad) VALUES (4, 'wein_apfel.png', '//path/to/file/')");
					statement.executeUpdate("INSERT INTO Besucher(ID, Name, MailAdresse) VALUES (1, 'Markus Schorsch', 'mschorsch@stud.hs-heilbronn.de')");
					statement.executeUpdate("INSERT INTO Besucher(ID, Name, MailAdresse) VALUES (2, 'Florian Domino', 'fdomino@stud.hs-heilbronn.de')");
					statement.executeUpdate("INSERT INTO Besucher(ID, Name, MailAdresse) VALUES (3, 'Sören Wirries', 'swirries@stud.hs-heilbronn.de')");
					statement.executeUpdate("INSERT INTO Pflanze_Standort(PflanzeID, StandortID) VALUES (1, 1)");
					statement.executeUpdate("INSERT INTO Pflanze_Standort(PflanzeID, StandortID) VALUES (1, 2)");
					statement.executeUpdate("INSERT INTO Pflanze_Standort(PflanzeID, StandortID) VALUES (2, 3)");
					statement.executeUpdate("INSERT INTO Pflanze_Standort(PflanzeID, StandortID) VALUES (3, 3)");
					statement.executeUpdate("INSERT INTO Pflanze_Bild(PflanzeID, BildID) VALUES (1, 1)");
					statement.executeUpdate("INSERT INTO Pflanze_Bild(PflanzeID, BildID) VALUES (2, 2)");
					statement.executeUpdate("INSERT INTO Pflanze_Bild(PflanzeID, BildID) VALUES (3, 3)");
					statement.executeUpdate("INSERT INTO Pflanze_Bild(PflanzeID, BildID) VALUES (1, 4)");
					statement.executeUpdate("INSERT INTO Pflanze_Bild(PflanzeID, BildID) VALUES (2, 4)");
					statement.executeUpdate("INSERT INTO Besucher_Pflanze(BesucherID, PflanzeID) VALUES (1, 1)");
					statement.executeUpdate("INSERT INTO Besucher_Pflanze(BesucherID, PflanzeID) VALUES (2, 2)");
					statement.executeUpdate("INSERT INTO Besucher_Pflanze(BesucherID, PflanzeID) VALUES (1, 2)");
					statement.close();
				}
			});
			transaction.commit();
		}
		catch (Exception e) {
			try {
				transaction.rollback();
			}
			catch (PersistentException e1) {
				e.printStackTrace();
			}
			e.printStackTrace();
		}
		
		PersistentTransaction t = de.hhn.se.pmt.garten.BUGAPflanzenLexikonPersistentManager.instance().getSession().beginTransaction();
		try {
			DAOFactory lDAOFactory = DAOFactory.getDAOFactory();
			de.hhn.se.pmt.garten.dao.PflanzeDAO ldehhnsepmtgartenPflanzeDAO = lDAOFactory.getPflanzeDAO();
			de.hhn.se.pmt.garten.Pflanze ldehhnsepmtgartenPflanze = ldehhnsepmtgartenPflanzeDAO.createPflanze();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : darstellung, ort, besucher, bewertung, angepflanztAufBuga, duftend, lebensdauer
			ldehhnsepmtgartenPflanzeDAO.save(ldehhnsepmtgartenPflanze);
			de.hhn.se.pmt.garten.dao.StandortDAO ldehhnsepmtgartenStandortDAO = lDAOFactory.getStandortDAO();
			de.hhn.se.pmt.garten.Standort ldehhnsepmtgartenStandort = ldehhnsepmtgartenStandortDAO.createStandort();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : gewaechs, longitude, latitude
			ldehhnsepmtgartenStandortDAO.save(ldehhnsepmtgartenStandort);
			de.hhn.se.pmt.garten.dao.BildDAO ldehhnsepmtgartenBildDAO = lDAOFactory.getBildDAO();
			de.hhn.se.pmt.garten.Bild ldehhnsepmtgartenBild = ldehhnsepmtgartenBildDAO.createBild();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : inhalt
			ldehhnsepmtgartenBildDAO.save(ldehhnsepmtgartenBild);
			de.hhn.se.pmt.garten.dao.BesucherDAO ldehhnsepmtgartenBesucherDAO = lDAOFactory.getBesucherDAO();
			de.hhn.se.pmt.garten.Besucher ldehhnsepmtgartenBesucher = ldehhnsepmtgartenBesucherDAO.createBesucher();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : favorit
			ldehhnsepmtgartenBesucherDAO.save(ldehhnsepmtgartenBesucher);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateBUGAPflanzenLexikonData createBUGAPflanzenLexikonData = new CreateBUGAPflanzenLexikonData();
			try {
				createBUGAPflanzenLexikonData.createTestData();
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
