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
@Table(name="Pflanze")
public class Pflanze implements Serializable {
	public Pflanze() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PFLANZE_BESUCHER) {
			return ORM_besucher;
		}
		else if (key == ORMConstants.KEY_PFLANZE_ORT) {
			return ORM_ort;
		}
		else if (key == ORMConstants.KEY_PFLANZE_DARSTELLUNG) {
			return ORM_darstellung;
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
	@GeneratedValue(generator="DE_HHN_SE_PMT_GARTEN_PFLANZE_ID_GENERATOR")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_GARTEN_PFLANZE_ID_GENERATOR", strategy="native")
	private int ID;
	
	@Column(name="BotanischerName", nullable=false, length=255)
	private String botanischerName;
	
	@Column(name="DeutscherName", nullable=false, length=255)
	private String deutscherName;
	
	@Column(name="Beschreibung", nullable=true, length=255)	
	private String beschreibung;
	
	@Column(name="Bluehdauer", nullable=true, length=255)	
	private String bluehdauer;
	
	@Column(name="Bluehzeitraum", nullable=true, length=255)	
	private String bluehzeitraum;
	
	@Column(name="Lebensdauer", nullable=true, length=10)
	private int lebensdauer;
	
	@Column(name="Bodenart", nullable=false, length=10)
	@org.hibernate.annotations.Type(type="de.hhn.se.pmt.garten.BodenartUserType")	
	@Enumerated(EnumType.ORDINAL)	
	private de.hhn.se.pmt.garten.Bodenart bodenart;
	
	@Column(name="Anpflanzzeitraum", nullable=true, length=255)	
	private String anpflanzzeitraum;
	
	@Column(name="Wuchshoehe", nullable=false, length=10)
	@org.hibernate.annotations.Type(type="de.hhn.se.pmt.garten.WuchshoeheUserType")	
	@Enumerated(EnumType.ORDINAL)	
	private de.hhn.se.pmt.garten.Wuchshoehe wuchshoehe;
	
	@Column(name="Duftend", nullable=false, length=1)	
	private boolean duftend;
	
	@Column(name="Gewaechsart", nullable=false, length=10)
	@org.hibernate.annotations.Type(type="de.hhn.se.pmt.garten.GewaechsartUserType")	
	@Enumerated(EnumType.ORDINAL)	
	private de.hhn.se.pmt.garten.Gewaechsart gewaechsart;
	
	@Column(name="Bluetenform", nullable=false, length=10)
	@org.hibernate.annotations.Type(type="de.hhn.se.pmt.garten.BluetenformUserType")	
	@Enumerated(EnumType.ORDINAL)	
	private de.hhn.se.pmt.garten.Bluetenform bluetenform;
	
	@Column(name="AngepflanztAufBuga", nullable=true, length=1)
	private boolean angepflanztAufBuga;
	
	@Column(name="Bewertung", nullable=true)
	private double bewertung;
	
	@ElementCollection	
	@CollectionTable(name="Tag", joinColumns={ @JoinColumn(name="PflanzeID") })	
	@org.hibernate.annotations.IndexColumn(name="PflanzeIndex")	
	@Column(name="`Tag`", nullable=true, length=255)	
	private String[] tag;
	
	@ElementCollection	
	@CollectionTable(name="Bluetenfarbe", joinColumns={ @JoinColumn(name="PflanzeID") })
	@org.hibernate.annotations.IndexColumn(name="PflanzeIndex")	
	@Column(name="Bluetenfarbe", nullable=false, length=11)
	@org.hibernate.annotations.Type(type="de.hhn.se.pmt.garten.FarbeUserType")	
	private de.hhn.se.pmt.garten.Farbe[] bluetenfarbe;
	
	@ElementCollection	
	@CollectionTable(name="Fruchtfarbe", joinColumns={ @JoinColumn(name="PflanzeID") })	
	@org.hibernate.annotations.IndexColumn(name="PflanzeIndex")	
	@Column(name="Fruchtfarbe", nullable=false, length=11)
	@org.hibernate.annotations.Type(type="de.hhn.se.pmt.garten.FarbeUserType")	
	private de.hhn.se.pmt.garten.Farbe[] fruchtfarbe;
	
	@ManyToMany(targetEntity=de.hhn.se.pmt.garten.Besucher.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Besucher_Pflanze", joinColumns={ @JoinColumn(name="PflanzeID") }, inverseJoinColumns={ @JoinColumn(name="BesucherID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_besucher = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_gewaechs", targetEntity=de.hhn.se.pmt.garten.Standort.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_ort = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_inhalt", targetEntity=de.hhn.se.pmt.garten.Bild.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_darstellung = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}

	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setBotanischerName(String value) {
		this.botanischerName = value;
	}
	
	public String getBotanischerName() {
		return botanischerName;
	}
	
	public void setDeutscherName(String value) {
		this.deutscherName = value;
	}
	
	public String getDeutscherName() {
		return deutscherName;
	}
	
	public void setBeschreibung(String value) {
		this.beschreibung = value;
	}
	
	public String getBeschreibung() {
		return beschreibung;
	}
	
	public void setBluehdauer(String value) {
		this.bluehdauer = value;
	}
	
	public String getBluehdauer() {
		return bluehdauer;
	}
	
	public void setBluehzeitraum(String value) {
		this.bluehzeitraum = value;
	}
	
	public String getBluehzeitraum() {
		return bluehzeitraum;
	}
	
	public void setTag(String[] value) {
		this.tag = value;
	}
	
	public String[] getTag() {
		return tag;
	}
	
	public void setLebensdauer(int value) {
		this.lebensdauer = value;
	}
	
	public int getLebensdauer() {
		return lebensdauer;
	}
	
	public void setBodenart(de.hhn.se.pmt.garten.Bodenart value) {
		this.bodenart = value;
	}
	
	public de.hhn.se.pmt.garten.Bodenart getBodenart() {
		return bodenart;
	}
	
	public void setAnpflanzzeitraum(String value) {
		this.anpflanzzeitraum = value;
	}
	
	public String getAnpflanzzeitraum() {
		return anpflanzzeitraum;
	}
	
	public void setWuchshoehe(de.hhn.se.pmt.garten.Wuchshoehe value) {
		this.wuchshoehe = value;
	}
	
	public de.hhn.se.pmt.garten.Wuchshoehe getWuchshoehe() {
		return wuchshoehe;
	}
	
	public void setDuftend(boolean value) {
		this.duftend = value;
	}
	
	public boolean getDuftend() {
		return duftend;
	}
	
	public void setGewaechsart(de.hhn.se.pmt.garten.Gewaechsart value) {
		this.gewaechsart = value;
	}
	
	public de.hhn.se.pmt.garten.Gewaechsart getGewaechsart() {
		return gewaechsart;
	}
	
	public void setBluetenfarbe(de.hhn.se.pmt.garten.Farbe[] value) {
		this.bluetenfarbe = value;
	}
	
	public de.hhn.se.pmt.garten.Farbe[] getBluetenfarbe() {
		return bluetenfarbe;
	}
	
	public void setBluetenform(de.hhn.se.pmt.garten.Bluetenform value) {
		this.bluetenform = value;
	}
	
	public de.hhn.se.pmt.garten.Bluetenform getBluetenform() {
		return bluetenform;
	}
	
	public void setFruchtfarbe(de.hhn.se.pmt.garten.Farbe[] value) {
		this.fruchtfarbe = value;
	}
	
	public de.hhn.se.pmt.garten.Farbe[] getFruchtfarbe() {
		return fruchtfarbe;
	}
	
	public void setAngepflanztAufBuga(boolean value) {
		this.angepflanztAufBuga = value;
	}
	
	public boolean getAngepflanztAufBuga() {
		return angepflanztAufBuga;
	}
	
	public void setBewertung(double value) {
		this.bewertung = value;
	}
	
	public double getBewertung() {
		return bewertung;
	}
	
	private void setORM_Besucher(java.util.Set value) {
		this.ORM_besucher = value;
	}
	
	private java.util.Set getORM_Besucher() {
		return ORM_besucher;
	}
	
	@Transient	
	public final de.hhn.se.pmt.garten.BesucherSetCollection besucher = new de.hhn.se.pmt.garten.BesucherSetCollection(this, _ormAdapter, ORMConstants.KEY_PFLANZE_BESUCHER, ORMConstants.KEY_BESUCHER_FAVORIT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Ort(java.util.Set value) {
		this.ORM_ort = value;
	}
	
	private java.util.Set getORM_Ort() {
		return ORM_ort;
	}
	
	@Transient	
	public final de.hhn.se.pmt.garten.StandortSetCollection ort = new de.hhn.se.pmt.garten.StandortSetCollection(this, _ormAdapter, ORMConstants.KEY_PFLANZE_ORT, ORMConstants.KEY_STANDORT_GEWAECHS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Darstellung(java.util.Set value) {
		this.ORM_darstellung = value;
	}
	
	private java.util.Set getORM_Darstellung() {
		return ORM_darstellung;
	}
	
	@Transient	
	public final de.hhn.se.pmt.garten.BildSetCollection darstellung = new de.hhn.se.pmt.garten.BildSetCollection(this, _ormAdapter, ORMConstants.KEY_PFLANZE_DARSTELLUNG, ORMConstants.KEY_BILD_INHALT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID()) + " '" + deutscherName + "' '" + botanischerName + "'";
	}
	
}
