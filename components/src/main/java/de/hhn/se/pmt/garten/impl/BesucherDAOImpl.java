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

public class BesucherDAOImpl implements de.hhn.se.pmt.garten.dao.BesucherDAO {
	public Besucher loadBesucherByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBesucherByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher getBesucherByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getBesucherByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher loadBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBesucherByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher getBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getBesucherByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher loadBesucherByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Besucher) session.load(de.hhn.se.pmt.garten.Besucher.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher getBesucherByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Besucher) session.get(de.hhn.se.pmt.garten.Besucher.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher loadBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Besucher) session.load(de.hhn.se.pmt.garten.Besucher.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher getBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Besucher) session.get(de.hhn.se.pmt.garten.Besucher.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBesucher(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryBesucher(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBesucher(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryBesucher(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher[] listBesucherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listBesucherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher[] listBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listBesucherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBesucher(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Besucher as Besucher");
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
	
	public List queryBesucher(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Besucher as Besucher");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Besucher", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher[] listBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBesucher(session, condition, orderBy);
			return (Besucher[]) list.toArray(new Besucher[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher[] listBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBesucher(session, condition, orderBy, lockMode);
			return (Besucher[]) list.toArray(new Besucher[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher loadBesucherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBesucherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher loadBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBesucherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher loadBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Besucher[] besuchers = listBesucherByQuery(session, condition, orderBy);
		if (besuchers != null && besuchers.length > 0)
			return besuchers[0];
		else
			return null;
	}
	
	public Besucher loadBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Besucher[] besuchers = listBesucherByQuery(session, condition, orderBy, lockMode);
		if (besuchers != null && besuchers.length > 0)
			return besuchers[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateBesucherByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iterateBesucherByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iterateBesucherByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Besucher as Besucher");
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
	
	public java.util.Iterator iterateBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Besucher as Besucher");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Besucher", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Besucher createBesucher() {
		return new de.hhn.se.pmt.garten.Besucher();
	}
	
	public boolean save(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().saveObject(besucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().deleteObject(besucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Besucher besucher)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Pflanze[] lFavorits = besucher.favorit.toArray();
			for(int i = 0; i < lFavorits.length; i++) {
				lFavorits[i].besucher.remove(besucher);
			}
			return delete(besucher);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Besucher besucher, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Pflanze[] lFavorits = besucher.favorit.toArray();
			for(int i = 0; i < lFavorits.length; i++) {
				lFavorits[i].besucher.remove(besucher);
			}
			try {
				session.delete(besucher);
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
	
	public boolean refresh(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().refresh(besucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().evict(besucher);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
