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
package de.hhn.se.pmt.garten.impl;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;
import de.hhn.se.pmt.garten.*;

public class PflanzeDAOImpl implements de.hhn.se.pmt.garten.dao.PflanzeDAO {
	public Pflanze loadPflanzeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadPflanzeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze getPflanzeByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getPflanzeByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze loadPflanzeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadPflanzeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze getPflanzeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getPflanzeByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze loadPflanzeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Pflanze) session.load(de.hhn.se.pmt.garten.Pflanze.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze getPflanzeByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Pflanze) session.get(de.hhn.se.pmt.garten.Pflanze.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze loadPflanzeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pflanze) session.load(de.hhn.se.pmt.garten.Pflanze.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze getPflanzeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Pflanze) session.get(de.hhn.se.pmt.garten.Pflanze.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryPflanze(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryPflanze(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryPflanze(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryPflanze(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze[] listPflanzeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listPflanzeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze[] listPflanzeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listPflanzeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryPflanze(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Pflanze as Pflanze");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryPflanze(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Pflanze as Pflanze");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pflanze", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze[] listPflanzeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPflanze(session, condition, orderBy);
			return (Pflanze[]) list.toArray(new Pflanze[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze[] listPflanzeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryPflanze(session, condition, orderBy, lockMode);
			return (Pflanze[]) list.toArray(new Pflanze[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze loadPflanzeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadPflanzeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze loadPflanzeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadPflanzeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze loadPflanzeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Pflanze[] pflanzes = listPflanzeByQuery(session, condition, orderBy);
		if (pflanzes != null && pflanzes.length > 0)
			return pflanzes[0];
		else
			return null;
	}
	
	public Pflanze loadPflanzeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Pflanze[] pflanzes = listPflanzeByQuery(session, condition, orderBy, lockMode);
		if (pflanzes != null && pflanzes.length > 0)
			return pflanzes[0];
		else
			return null;
	}
	
	public java.util.Iterator iteratePflanzeByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iteratePflanzeByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iteratePflanzeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iteratePflanzeByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iteratePflanzeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Pflanze as Pflanze");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iteratePflanzeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Pflanze as Pflanze");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Pflanze", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Pflanze createPflanze() {
		return new de.hhn.se.pmt.garten.Pflanze();
	}
	
	public boolean save(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().saveObject(pflanze);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().deleteObject(pflanze);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Pflanze pflanze)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Besucher[] lBesuchers = pflanze.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].favorit.remove(pflanze);
			}
			de.hhn.se.pmt.garten.Standort[] lOrts = pflanze.ort.toArray();
			for(int i = 0; i < lOrts.length; i++) {
				lOrts[i].gewaechs.remove(pflanze);
			}
			de.hhn.se.pmt.garten.Bild[] lDarstellungs = pflanze.darstellung.toArray();
			for(int i = 0; i < lDarstellungs.length; i++) {
				lDarstellungs[i].inhalt.remove(pflanze);
			}
			return delete(pflanze);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Pflanze pflanze, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Besucher[] lBesuchers = pflanze.besucher.toArray();
			for(int i = 0; i < lBesuchers.length; i++) {
				lBesuchers[i].favorit.remove(pflanze);
			}
			de.hhn.se.pmt.garten.Standort[] lOrts = pflanze.ort.toArray();
			for(int i = 0; i < lOrts.length; i++) {
				lOrts[i].gewaechs.remove(pflanze);
			}
			de.hhn.se.pmt.garten.Bild[] lDarstellungs = pflanze.darstellung.toArray();
			for(int i = 0; i < lDarstellungs.length; i++) {
				lDarstellungs[i].inhalt.remove(pflanze);
			}
			try {
				session.delete(pflanze);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().refresh(pflanze);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().evict(pflanze);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
