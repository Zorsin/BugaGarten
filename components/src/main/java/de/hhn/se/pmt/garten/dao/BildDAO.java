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

public interface BildDAO {
	public Bild loadBildByORMID(int ID) throws PersistentException;
	public Bild getBildByORMID(int ID) throws PersistentException;
	public Bild loadBildByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild getBildByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild loadBildByORMID(PersistentSession session, int ID) throws PersistentException;
	public Bild getBildByORMID(PersistentSession session, int ID) throws PersistentException;
	public Bild loadBildByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild getBildByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild[] listBildByQuery(String condition, String orderBy) throws PersistentException;
	public Bild[] listBildByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBild(String condition, String orderBy) throws PersistentException;
	public java.util.List queryBild(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBildByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBildByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild[] listBildByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Bild[] listBildByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBild(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryBild(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBildByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBildByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild loadBildByQuery(String condition, String orderBy) throws PersistentException;
	public Bild loadBildByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild loadBildByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Bild loadBildByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Bild createBild();
	public boolean save(de.hhn.se.pmt.garten.Bild bild) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.garten.Bild bild) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Bild bild) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Bild bild, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.garten.Bild bild) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.garten.Bild bild) throws PersistentException;
}
