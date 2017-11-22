package de.hn.hhn.se.garten;

import java.util.*;
/**
 * @author SWirries
 */

public class Pflanze {

	Besucher besucher;
	Collection<Standort> ort;
	Collection<Bild> darstellung;
	private String botanischerName;
	private String deutscherName;
	private String beschreibung;
	private String bluehdauer;
	private String bluehzeitraum;
	private String[] tag;
	private int lebensdauer;
	private Bodenart bodenart;
	private String anpflanzzeitraum;
	private Wuchshoehe wuchshoehe;
	private boolean duftend;
	private Gewaechsart gewaechsart;
	private Farbe[] bluetenfarbe;
	private Bluetenform bluetenform;
	private Farbe[] fruchtfarbe;
	private boolean angepflanztAufBuga;
	private double bewertung;

	public String getBotanischerName() {
		return this.botanischerName;
	}

	public void setBotanischerName(String botanischerName) {
		this.botanischerName = botanischerName;
	}

	public String getDeutscherName() {
		return this.deutscherName;
	}

	public void setDeutscherName(String deutscherName) {
		this.deutscherName = deutscherName;
	}

	public String getBeschreibung() {
		return this.beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}

	public String getBluehdauer() {
		return this.bluehdauer;
	}

	public void setBluehdauer(String bluehdauer) {
		this.bluehdauer = bluehdauer;
	}

	public String getBluehzeitraum() {
		return this.bluehzeitraum;
	}

	public void setBluehzeitraum(String bluehzeitraum) {
		this.bluehzeitraum = bluehzeitraum;
	}

	public String[] getTag() {
		return this.tag;
	}

	public void setTag(String[] tag) {
		this.tag = tag;
	}

	public int getLebensdauer() {
		return this.lebensdauer;
	}

	public void setLebensdauer(int lebensdauer) {
		this.lebensdauer = lebensdauer;
	}

	public Bodenart getBodenart() {
		return this.bodenart;
	}

	public void setBodenart(Bodenart bodenart) {
		this.bodenart = bodenart;
	}

	public String getAnpflanzzeitraum() {
		return this.anpflanzzeitraum;
	}

	public void setAnpflanzzeitraum(String anpflanzzeitraum) {
		this.anpflanzzeitraum = anpflanzzeitraum;
	}

	public Wuchshoehe getWuchshoehe() {
		return this.wuchshoehe;
	}

	public void setWuchshoehe(Wuchshoehe wuchshoehe) {
		this.wuchshoehe = wuchshoehe;
	}

	public boolean isDuftend() {
		return this.duftend;
	}

	public void setDuftend(boolean duftend) {
		this.duftend = duftend;
	}

	public Gewaechsart getGewaechsart() {
		return this.gewaechsart;
	}

	public void setGewaechsart(Gewaechsart gewaechsart) {
		this.gewaechsart = gewaechsart;
	}

	public Farbe[] getBluetenfarbe() {
		return this.bluetenfarbe;
	}

	public void setBluetenfarbe(Farbe[] bluetenfarbe) {
		this.bluetenfarbe = bluetenfarbe;
	}

	public Bluetenform getBluetenform() {
		return this.bluetenform;
	}

	public void setBluetenform(Bluetenform bluetenform) {
		this.bluetenform = bluetenform;
	}

	public Farbe[] getFruchtfarbe() {
		return this.fruchtfarbe;
	}

	public void setFruchtfarbe(Farbe[] fruchtfarbe) {
		this.fruchtfarbe = fruchtfarbe;
	}

	public boolean isAngepflanztAufBuga() {
		return this.angepflanztAufBuga;
	}

	public void setAngepflanztAufBuga(boolean angepflanztAufBuga) {
		this.angepflanztAufBuga = angepflanztAufBuga;
	}

	public double getBewertung() {
		return this.bewertung;
	}

	public void setBewertung(double bewertung) {
		this.bewertung = bewertung;
	}

}