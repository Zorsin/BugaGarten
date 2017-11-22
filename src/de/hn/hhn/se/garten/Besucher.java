package de.hn.hhn.se.garten;

import java.util.*;

/**
 * @author SWirries
 */

public class Besucher {

	Collection<Pflanze> favorit;
	Collection<Kontakt> kontakt;
	Standort postition;
	private String name;
	private String mailAdresse;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMailAdresse() {
		return this.mailAdresse;
	}

	public void setMailAdresse(String mailAdresse) {
		this.mailAdresse = mailAdresse;
	}

}