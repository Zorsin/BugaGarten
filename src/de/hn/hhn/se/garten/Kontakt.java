package de.hn.hhn.se.garten;
/**
 * @author SWirries
 */

public class Kontakt {

	Besucher besucher;
	private String namen;
	private String Telefonummer;
	private String mailAdresse;

	public String getNamen() {
		return this.namen;
	}

	public void setNamen(String namen) {
		this.namen = namen;
	}

	public String getTelefonummer() {
		return this.Telefonummer;
	}

	public void setTelefonummer(String Telefonummer) {
		this.Telefonummer = Telefonummer;
	}

	public String getMailAdresse() {
		return this.mailAdresse;
	}

	public void setMailAdresse(String mailAdresse) {
		this.mailAdresse = mailAdresse;
	}

}