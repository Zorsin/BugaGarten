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

public interface PflanzeDAO {
	public Pflanze loadPflanzeByORMID(int ID) throws PersistentException;
	public Pflanze getPflanzeByORMID(int ID) throws PersistentException;
	public Pflanze loadPflanzeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze getPflanzeByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze loadPflanzeByORMID(PersistentSession session, int ID) throws PersistentException;
	public Pflanze getPflanzeByORMID(PersistentSession session, int ID) throws PersistentException;
	public Pflanze loadPflanzeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze getPflanzeByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze[] listPflanzeByQuery(String condition, String orderBy) throws PersistentException;
	public Pflanze[] listPflanzeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryPflanze(String condition, String orderBy) throws PersistentException;
	public java.util.List queryPflanze(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iteratePflanzeByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iteratePflanzeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze[] listPflanzeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Pflanze[] listPflanzeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryPflanze(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryPflanze(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iteratePflanzeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iteratePflanzeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze loadPflanzeByQuery(String condition, String orderBy) throws PersistentException;
	public Pflanze loadPflanzeByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze loadPflanzeByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Pflanze loadPflanzeByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Pflanze createPflanze();
	public boolean save(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Pflanze pflanze, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.garten.Pflanze pflanze) throws PersistentException;
}
