package de.hn.hhn.se.garten;

import java.util.*;
/**
 * @author SWirries
 */

public class Karte {

	Collection<Standort> position;
	private Standort eigenerStandort;

	public Standort getEigenerStandort() {
		return this.eigenerStandort;
	}

	public void setEigenerStandort(Standort eigenerStandort) {
		this.eigenerStandort = eigenerStandort;
	}

}