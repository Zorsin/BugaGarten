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

public interface BesucherDAO {
	public Besucher loadBesucherByORMID(int ID) throws PersistentException;
	public Besucher getBesucherByORMID(int ID) throws PersistentException;
	public Besucher loadBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher getBesucherByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher loadBesucherByORMID(PersistentSession session, int ID) throws PersistentException;
	public Besucher getBesucherByORMID(PersistentSession session, int ID) throws PersistentException;
	public Besucher loadBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher getBesucherByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher[] listBesucherByQuery(String condition, String orderBy) throws PersistentException;
	public Besucher[] listBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBesucher(String condition, String orderBy) throws PersistentException;
	public java.util.List queryBesucher(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBesucherByQuery(String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher[] listBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Besucher[] listBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.List queryBesucher(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.List queryBesucher(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public java.util.Iterator iterateBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public java.util.Iterator iterateBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher loadBesucherByQuery(String condition, String orderBy) throws PersistentException;
	public Besucher loadBesucherByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher loadBesucherByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Besucher loadBesucherByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Besucher createBesucher();
	public boolean save(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException;
	public boolean delete(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException;
	public boolean deleteAndDissociate(de.hhn.se.pmt.garten.Besucher besucher, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException;
	public boolean evict(de.hhn.se.pmt.garten.Besucher besucher) throws PersistentException;
}
