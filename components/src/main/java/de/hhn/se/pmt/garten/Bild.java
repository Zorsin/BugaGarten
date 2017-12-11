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
package de.hhn.se.pmt.garten;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Bild")
public class Bild implements Serializable {
	public Bild() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BILD_INHALT) {
			return ORM_inhalt;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_GARTEN_BILD_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_GARTEN_BILD_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Dateiname", nullable=true, length=255)	
	private String dateiname;
	
	@Column(name="Dateipfad", nullable=true, length=255)	
	private String dateipfad;
	
	@ManyToMany(targetEntity=de.hhn.se.pmt.garten.Pflanze.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Pflanze_Bild", joinColumns={ @JoinColumn(name="BildID") }, inverseJoinColumns={ @JoinColumn(name="PflanzeID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_inhalt = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDateiname(String value) {
		this.dateiname = value;
	}
	
	public String getDateiname() {
		return dateiname;
	}
	
	public void setDateipfad(String value) {
		this.dateipfad = value;
	}
	
	public String getDateipfad() {
		return dateipfad;
	}
	
	private void setORM_Inhalt(java.util.Set value) {
		this.ORM_inhalt = value;
	}
	
	private java.util.Set getORM_Inhalt() {
		return ORM_inhalt;
	}
	
	@Transient	
	public final de.hhn.se.pmt.garten.PflanzeSetCollection inhalt = new de.hhn.se.pmt.garten.PflanzeSetCollection(this, _ormAdapter, ORMConstants.KEY_BILD_INHALT, ORMConstants.KEY_PFLANZE_DARSTELLUNG, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID()) + " Datei:'"+dateipfad+dateiname+"'";
	}
	
}
