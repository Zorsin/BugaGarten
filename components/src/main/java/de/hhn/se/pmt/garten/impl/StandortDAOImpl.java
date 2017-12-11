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

public class StandortDAOImpl implements de.hhn.se.pmt.garten.dao.StandortDAO {
	public Standort loadStandortByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadStandortByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort getStandortByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getStandortByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort loadStandortByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadStandortByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort getStandortByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return getStandortByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort loadStandortByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Standort) session.load(de.hhn.se.pmt.garten.Standort.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort getStandortByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Standort) session.get(de.hhn.se.pmt.garten.Standort.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort loadStandortByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Standort) session.load(de.hhn.se.pmt.garten.Standort.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort getStandortByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Standort) session.get(de.hhn.se.pmt.garten.Standort.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryStandort(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryStandort(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryStandort(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return queryStandort(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort[] listStandortByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listStandortByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort[] listStandortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return listStandortByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public List queryStandort(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Standort as Standort");
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
	
	public List queryStandort(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Standort as Standort");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Standort", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort[] listStandortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryStandort(session, condition, orderBy);
			return (Standort[]) list.toArray(new Standort[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort[] listStandortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryStandort(session, condition, orderBy, lockMode);
			return (Standort[]) list.toArray(new Standort[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort loadStandortByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadStandortByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort loadStandortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return loadStandortByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort loadStandortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Standort[] standorts = listStandortByQuery(session, condition, orderBy);
		if (standorts != null && standorts.length > 0)
			return standorts[0];
		else
			return null;
	}
	
	public Standort loadStandortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Standort[] standorts = listStandortByQuery(session, condition, orderBy, lockMode);
		if (standorts != null && standorts.length > 0)
			return standorts[0];
		else
			return null;
	}
	
	public java.util.Iterator iterateStandortByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iterateStandortByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateStandortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = BUGAPflanzenLexikonPersistentManager.instance().getSession();
			return iterateStandortByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public java.util.Iterator iterateStandortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Standort as Standort");
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
	
	public java.util.Iterator iterateStandortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From de.hhn.se.pmt.garten.Standort as Standort");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Standort", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Standort createStandort() {
		return new de.hhn.se.pmt.garten.Standort();
	}
	
	public boolean save(de.hhn.se.pmt.garten.Standort standort) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().saveObject(standort);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(de.hhn.se.pmt.garten.Standort standort) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().deleteObject(standort);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Standort standort)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Pflanze[] lGewaechss = standort.gewaechs.toArray();
			for(int i = 0; i < lGewaechss.length; i++) {
				lGewaechss[i].ort.remove(standort);
			}
			return delete(standort);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Standort standort, org.orm.PersistentSession session)throws PersistentException {
		try {
			de.hhn.se.pmt.garten.Pflanze[] lGewaechss = standort.gewaechs.toArray();
			for(int i = 0; i < lGewaechss.length; i++) {
				lGewaechss[i].ort.remove(standort);
			}
			try {
				session.delete(standort);
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
	
	public boolean refresh(de.hhn.se.pmt.garten.Standort standort) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().refresh(standort);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(de.hhn.se.pmt.garten.Standort standort) throws PersistentException {
		try {
			BUGAPflanzenLexikonPersistentManager.instance().getSession().evict(standort);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
