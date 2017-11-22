package de.hn.hhn.se.garten;

import java.util.*;

/**
 * @author SWirries
 */

public class Bild {

	Collection<Pflanze> inhalt;
	private String dateiname;
	private String dateipfad;

	public String getDateiname() {
		return this.dateiname;
	}

	public void setDateiname(String dateiname) {
		this.dateiname = dateiname;
	}

	public String getDateipfad() {
		return this.dateipfad;
	}

	public void setDateipfad(String dateipfad) {
		this.dateipfad = dateipfad;
	}

}