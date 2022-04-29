/**
 * Klasse BackstubenAufsicht definiert Konstanten für Backstuben 
 * und stellt Methode zur Cent in Euro- und Centumrechnung bereit.
 * @author LH
 *
 */
public class BackstubenAufsicht {

	public final static double RABATT_IN_PROZENT = 12.4;
	public final static String BACKSTUBEN_NAME = "Wichtelbackstube";
	public final static int MAX_NAMENS_LAENGE = 25;

	/**
	 * Rechnet Centbetraege in Euros und Cents um und gibt sie als String zurück
	 * @param cents Cents die umgerechnet werden sollen
	 * @return String mit Euro- und Centbetrag
	 */
	public static String centsInEuroUndCents(int cents) {
		 String s = "";
	     
		 // Vorzeichen im String merken und ggf für Rechnung entfernen
		 if (cents < 0) {
			 s += "-";
			 cents = Math.abs(cents);
		 }
		 
		 // Anzahl Euros in Centsumme
		 int euros = cents / 100;
		 // Füge Euros zu String und Trennpunkt
		 s += euros + ".";
		 
		 // Anzahl Restcents ohne Euros
		 cents = cents % 100;
		 
		 // Füge führende 0 hinzu, wenn notwendig   
		 if (cents < 10) {
		     s += "0";
		 }
		 // Füge Cents zu String hinzu
		 s += cents;
		 
		 // Füge € Zeichen hinzu
		 s += "€";
		 return s;
	}
}