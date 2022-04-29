package dud;

import java.util.Date;

/**
 * Diese Klasse stellt das Objekt DateiInfos zur Verf�gung das benutzt wird um
 * Informationen zu Dateien auszugeben
 * 
 * @author Felix Hansmann
 *
 */
public class DateiInfos {
	public String absoluterPfad;
	public boolean existiert;
	public Date letzteAenderung;
	public long groesse;
	public boolean istDatei;
	public boolean lesezugriff;
	public boolean schreibzugriff;

	/**
	 * Das Objekt wird benutzt um Informationen zu einer Datei zu bekommen und
	 * gemeinsam auszugeben.
	 * 
	 * @param absoluterPfad
	 * @param existiert
	 * @param letzteAenderung
	 * @param groesse
	 * @param istDatei
	 * @param lesezugriff
	 * @param schreibzugriff
	 */
	public DateiInfos(String absoluterPfad, boolean existiert, Date letzteAenderung, long groesse,
			boolean istDatei, boolean lesezugriff, boolean schreibzugriff) {
		this.absoluterPfad = absoluterPfad;
		this.existiert = existiert;
		this.letzteAenderung = letzteAenderung;
		this.groesse = groesse;
		this.istDatei = istDatei;
		this.lesezugriff = lesezugriff;
		this.schreibzugriff = schreibzugriff;
	}
}
