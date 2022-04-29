package dud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Die Klasse "DateiManager" stellt alle Methoden f�r die Operationen der Datei-
 * und Verzeichnisbehandlung zur Verfuegung.
 * 
 * @author Felix Hansmann
 *
 */
public class DateiManagerUI {
	public static void main(String[] args) throws IOException {
		hauptmenue();
	}

	/**
	 * erstellt ein Hauptmenue zum testen. Ermoeglicht austausch mit User
	 * 
	 * @throws IOException
	 */
	public static void hauptmenue() throws IOException {
		System.out.println("(1)Verzeichnis/Datei Erstellen");
		System.out.println("(2)Datei Kopieren");
		System.out.println("(3)Dateiinforamtionen");
		System.out.println("(4)Beenden");

		String antwort = "";

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		antwort = in.readLine();
		switch (antwort) {
		case "1":
			DateiManager.erstelleVerzeichnis();
			hauptmenue();
			break;
		case "2":
			System.out.print("Geben Sie den Pfad der Datei an die Sie verschieben wollen: ");
			String quelle = in.readLine();
			System.out.print("Geben Sie den Pfad an in den Sie die Datei verschieben wollen: ");
			String ziel = in.readLine();
			try {
				DateiManager.kopiereDateiNach(quelle, ziel);
			} catch (Exception e) {
				System.out.println("Kein gueltiger Pfad.\nZurueck zum Hauptmenue.");
			}
			;
			hauptmenue();
			break;
		case "3":
			System.out.print("Geben Sie den Pfad der Datei uber die Sie Inforamtionen wollen: ");
			String info = in.readLine();
			infomenue(info);
			break;
		case "4":
			System.exit(0);
			break;
		default:
			System.out.println("ungueltige Eingabe");
			hauptmenue();
			break;
		}
	}

	/**
	 * ersetllt ein Infomenue mit Abfrage nach der Datei
	 * 
	 * @throws IOException
	 */
	public static void infomenue(String info) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("W�hlen Sie:\n" + "(1)Dateigr��e\n" + "(2)Verzeichnis oder Datei\n"
				+ "(3)Letzter Tag der �nderung\n" + "(4)Schreib- und Lesezugriff erlaubt ja/nein\n" + "(5)Hauptmenue");

		String input = in.readLine();

		if (DateiManager.gibDateiInfos(info).existiert == false) {

			System.out.println("Pfad existiert nicht.\nZurueck zum Hauptmenue.");
			hauptmenue();

		}
		switch (input) {
		case "1":
			System.out.println(DateiManager.gibDateiInfos(info).groesse);
			infomenue(info);
			break;
		case "2":
			System.out.println(DateiManager.gibDateiInfos(info).istDatei == true ? "Datei" : "Verzeichnis");
			infomenue(info);
			break;
		case "3":
			System.out.println(DateiManager.gibDateiInfos(info).letzteAenderung);
			infomenue(info);
			break;
		case "4":
			System.out.println("Lesezugriff: " + DateiManager.gibDateiInfos(info).lesezugriff + "\n" + "Schreibzugriff: "
					+ DateiManager.gibDateiInfos(info).schreibzugriff);

			infomenue(info);
			break;
		case "5":
			hauptmenue();
			break;
		default:
			System.out.println("ungueltige Eingabe");
			infomenue(info);
			break;
		}

	}

}
