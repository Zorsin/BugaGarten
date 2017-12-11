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

public class BildDAOImpl implements de.hhn.se.pmt.garten.dao.BildDAO {
	public Bild loadBildByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBildByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild getBildByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getBildByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild loadBildByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBildByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild getBildByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getBildByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild loadBildByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Bild) session.load(de.hhn.se.pmt.garten.Bild.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild getBildByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Bild) session.get(de.hhn.se.pmt.garten.Bild.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild loadBildByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bild) session.load(de.hhn.se.pmt.garten.Bild.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild getBildByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Bild) session.get(de.hhn.se.pmt.garten.Bild.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBild(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryBild(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBild(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryBild(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild[] listBildByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listBildByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild[] listBildByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listBildByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryBild(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Bild as Bild");
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
	
	public List queryBild(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Bild as Bild");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bild", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild[] listBildByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryBild(session, condition, orderBy);
			return (Bild[]) list.toArray(new Bild[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild[] listBildByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryBild(session, condition, orderBy, lockMode);
			return (Bild[]) list.toArray(new Bild[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild loadBildByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBildByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild loadBildByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadBildByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild loadBildByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Bild[] bilds = listBildByQuery(session, condition, orderBy);
		if (bilds != null && bilds.length > 0)
			return bilds[0];
		else
			return null;
	}
	
	public Bild loadBildByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Bild[] bilds = listBildByQuery(session, condition, orderBy, lockMode);
		if (bilds != null && bilds.length > 0)
			return bilds[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateBildByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iterateBildByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBildByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iterateBildByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateBildByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Bild as Bild");
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
	
	public java.util.Iterator iterateBildByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Bild as Bild");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Bild", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Bild createBild() {
		return new de.hhn.se.pmt.garten.Bild();
	}
	
	public boolean save(de.hhn.se.pmt.garten.Bild bild) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().saveObject(bild);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.garten.Bild bild) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().deleteObject(bild);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Bild bild)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Pflanze[] lInhalts = bild.inhalt.toArray();
			for(int i = 0; i < lInhalts.length; i++) {
				lInhalts[i].darstellung.remove(bild);
			}
			return delete(bild);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Bild bild, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Pflanze[] lInhalts = bild.inhalt.toArray();
			for(int i = 0; i < lInhalts.length; i++) {
				lInhalts[i].darstellung.remove(bild);
			}
			try {
				session.delete(bild);
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
	
	public boolean refresh(de.hhn.se.pmt.garten.Bild bild) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().refresh(bild);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.garten.Bild bild) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().evict(bild);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
