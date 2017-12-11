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
@Table(name="Standort")
public class Standort implements Serializable {
	public Standort() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_STANDORT_GEWAECHS) {
			return ORM_gewaechs;
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
	@GeneratedValue(generator="DE_HHN_SE_PMT_GARTEN_STANDORT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_GARTEN_STANDORT_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Latitude", nullable=false)	
	private double latitude;
	
	@Column(name="Longitude", nullable=false)	
	private double longitude;
	
	@ManyToMany(targetEntity=de.hhn.se.pmt.garten.Pflanze.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Pflanze_Standort", joinColumns={ @JoinColumn(name="StandortID") }, inverseJoinColumns={ @JoinColumn(name="PflanzeID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_gewaechs = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setLatitude(double value) {
		this.latitude = value;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public void setLongitude(double value) {
		this.longitude = value;
	}
	
	public double getLongitude() {
		return longitude;
	}
	
	private void setORM_Gewaechs(java.util.Set value) {
		this.ORM_gewaechs = value;
	}
	
	private java.util.Set getORM_Gewaechs() {
		return ORM_gewaechs;
	}
	
	@Transient	
	public final de.hhn.se.pmt.garten.PflanzeSetCollection gewaechs = new de.hhn.se.pmt.garten.PflanzeSetCollection(this, _ormAdapter, ORMConstants.KEY_STANDORT_GEWAECHS, ORMConstants.KEY_PFLANZE_ORT, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID()) +" Lat:'"+latitude+ "' Lon:'"+longitude+"'";
	}
	
}
