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

import org.orm.*;
import org.hibernate.LockMode;
import de.hhn.se.pmt.garten.*;

public interface StandortDAO {
	public Standort loadStandortByORMID(int ID) throws PersistentException;
	public Standort getStandortByORMID(int ID) throws PersistentException;
	public Standort loadStandortByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort getStandortByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort loadStandortByORMID(PersistentSession session, int ID) throws PersistentException;
	public Standort getStandortByORMID(PersistentSession session, int ID) throws PersistentException;
	public Standort loadStandortByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort getStandortByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort[] listStandortByQuery(String condition, String orderBy) throws PersistentException;
	public Standort[] listStandortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryStandort(String condition, String orderBy) throws PersistentException;
	public java.util.List queryStandort(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateStandortByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateStandortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort[] listStandortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Standort[] listStandortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryStandort(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryStandort(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateStandortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateStandortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort loadStandortByQuery(String condition, String orderBy) throws PersistentException;
	public Standort loadStandortByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort loadStandortByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Standort loadStandortByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Standort createStandort();
	public boolean save(de.hhn.se.pmt.garten.Standort standort) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.garten.Standort standort) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Standort standort) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Standort standort, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.garten.Standort standort) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.garten.Standort standort) throws PersistentException;
}
