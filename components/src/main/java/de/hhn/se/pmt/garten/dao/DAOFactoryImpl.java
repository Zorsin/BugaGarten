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
package de.hhn.se.pmt.garten.dao;

import de.hhn.se.pmt.garten.impl.*;

public class DAOFactoryImpl extends DAOFactory {
	private PflanzeDAO _pflanzeDAO = new PflanzeDAOImpl();
	public PflanzeDAO getPflanzeDAO() {
		return _pflanzeDAO;
	}
	
	private StandortDAO _standortDAO = new StandortDAOImpl();
	public StandortDAO getStandortDAO() {
		return _standortDAO;
	}
	
	private BildDAO _bildDAO = new BildDAOImpl();
	public BildDAO getBildDAO() {
		return _bildDAO;
	}
	
	private BesucherDAO _besucherDAO = new BesucherDAOImpl();
	public BesucherDAO getBesucherDAO() {
		return _besucherDAO;
	}
	
}

