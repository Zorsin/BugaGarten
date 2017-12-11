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

import org.orm.util.*;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Besucher")
public class Besucher implements Serializable {
	public Besucher() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_BESUCHER_FAVORIT) {
			return ORM_favorit;
		}
		
		return null;
	}
	
	@Transient
	ORMAdapter _ormAdapter = new AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="DE_HHN_SE_PMT_GARTEN_BESUCHER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="DE_HHN_SE_PMT_GARTEN_BESUCHER_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="MailAdresse", nullable=true, length=255)	
	private String mailAdresse;
	
	@ManyToMany(mappedBy="ORM_besucher", targetEntity=de.hhn.se.pmt.garten.Pflanze.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_favorit = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMailAdresse(String value) {
		this.mailAdresse = value;
	}
	
	public String getMailAdresse() {
		return mailAdresse;
	}
	
	private void setORM_Favorit(java.util.Set value) {
		this.ORM_favorit = value;
	}
	
	private java.util.Set getORM_Favorit() {
		return ORM_favorit;
	}
	
	@Transient	
	public final de.hhn.se.pmt.garten.PflanzeSetCollection favorit = new de.hhn.se.pmt.garten.PflanzeSetCollection(this, _ormAdapter, ORMConstants.KEY_BESUCHER_FAVORIT, ORMConstants.KEY_PFLANZE_BESUCHER, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID()) + " Name:"+name+ " - "+mailAdresse;
	}
	
}
