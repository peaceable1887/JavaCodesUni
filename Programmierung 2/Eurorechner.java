package dud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Eurorechner rechnet den Wert von Eurobetraegen in US Dollar um und umgekehrt
 * 
 * @author Felix Hansmann
 *
 */
public class Eurorechner {
	private static double wechselkursEuroInUSDollar = 0;

	/**
	 * Konstruktor der Klasse Eurorechner
	 * 
	 * @param wechselkurs Wechselkurs von Euro nach Dollar
	 */
	public Eurorechner(double wechselkurs) {
		this.wechselkursEuroInUSDollar = wechselkurs;
	}

	/**
	 * Main Methode testet die Funktionen der Klasse Eurorechner
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		new Eurorechner(1.1901);
		waehrungUmrechnen();
	}

	/**
	 * Eine Funktion um die Abfragt welche Waehrung umgerechnet werden soll
	 * 
	 * @return gibt den String mit dem Character der die Waehrung representiert
	 *         zurueck
	 * @throws IOException
	 */
	public static String waehrungsArt() throws IOException {
		String ret = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Eingabe der Ausgangswaehrung (E)uro oder (U)S Dollar ? : ");
		ret = br.readLine();
		return ret.toLowerCase().equals("e") || ret.toLowerCase().equals("u") ? ret : waehrungsArt();
	}

	/**
	 * rechnet den Kurs von Euro in US-Dollar oder umgekehrt um
	 * 
	 * @throws NumberFormatException
	 */
	public static void waehrungUmrechnen() throws IOException {
		String next = "j";
		do {
			double currency = 0;
			String waehrung = waehrungsArt();
			String currencyUeberpruefen = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			// Summe der Waehrung zum umrechnen
			System.out.print("Wie viel Geld wollen Sie umrechnen lassen? : ");
			currencyUeberpruefen = br.readLine();
			try {
				currency = Float.parseFloat(currencyUeberpruefen);
			} catch (NumberFormatException e) {
				System.out.println("Falsche Eingabe bitte nochmal! ");
				waehrungUmrechnen();
			}

			// umrechnen nach Waehrung
			if (waehrung.toLowerCase().equals("e")) {
				currency = (Math.round(euroInDollar(currency) * 100.0) / 100.0);
				System.out.println("Das sind " + currency + "$");
			} else if (waehrung.toLowerCase().equals("u")) {
				currency = (Math.round(dollarInEuro(currency) * 100.0) / 100.0);
				System.out.println("Das sind " + currency + "�");
			} else {
				System.out.println("Falscher Waehrungstyp, nochmal von vorn");
				waehrungUmrechnen();
			}

			// Abfrage nach nochmaligem umrechnen
			System.out.print("Wollen sie nochmal umrechnen? (j/n)");
			next = br.readLine().toLowerCase();
		} while (next.equals("j"));

	}

	/**
	 * Bei der Methode "dollarInEuro", wird der Dollar-Betrag in Euro umgewandelt
	 * und zurueckgegeben
	 *
	 * @param betrag
	 *
	 * @return erg(Euro-Betrag)
	 *
	 */
	public static double dollarInEuro(double betrag) {
		double erg = betrag / wechselkursEuroInUSDollar;
		return erg;
	}

	/**
	 * Bei der Methode "euroInDollar", wird der Euro-Betrag in Dollar umgewandelt
	 * und zurueckgegeben
	 *
	 * @param betrag
	 *
	 * @return erg(Dollar-Betrag)
	 *
	 */
	public static double euroInDollar(double betrag) {
		double erg = betrag * wechselkursEuroInUSDollar;
		return erg;
	}

}
