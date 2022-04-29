package dud;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.File;

/**
 * Ersetzt in einer Html Datei alle Umlaute durch die entsprechenden Html
 * Zeichen und speichert die Aenderung in einer neuen Datei
 * 
 * In den args muss der entsprechende Pfad zu dem Ordner in der die Datei liegt
 * angegeben sein an der Stelle args[0]
 * 
 * @author Felix Hansmann
 *
 * @version 04/2021
 */
public class UmlautConverter {

	/**
	 * Testet die Funtion der Methoden an Beispiel
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		String quellDatei = "umlaute.html";
		String zielDatei = "umlaute_ersetzt.html";
		File quellPfad = new File(args[0] + "\\" + quellDatei);
		File zielPfad = new File(args[0] + "\\" + zielDatei);

		converter(quellPfad, zielPfad);
	}

	/**
	 * Ersetzt alle Umlaute in einem String mit den dafuer entsprechenden html
	 * Zeichen
	 * 
	 * @param text String welcher die zeichen ersetzt kiregen soll
	 * @return gibt einen String mit ersetzten html Zeichen zurueck
	 */
	public static String umlaute(String text) {
		System.out.println("Umlaute Ersetzen");
		text = text.replaceAll("�", "&auml;");
		text = text.replaceAll("�", "&Auml;");
		text = text.replaceAll("�", "&ouml;");
		text = text.replaceAll("�", "&Ouml;");
		text = text.replaceAll("�", "&uuml;");
		text = text.replaceAll("�", "&Uuml;");
		text = text.replaceAll("�", "&szlig;");

		return text;
	}

	/**
	 * Ersetzt alle Umlaute in einem gegebenen Pfad mit den entsprechenden Html
	 * Zeichen und speichert diese in einem neuen Pfad ab
	 * 
	 * @param quellPfad Pfad der Datei die ausgelesen und die Umlaute ersetzt
	 *                  bekommt
	 * @param zielPfad  Pfad der Datei mit Html zeichen anstelle der Umlaute hat
	 * @throws IOException
	 */
	public static void converter(File quellPfad, File zielPfad) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(quellPfad));
		String text = reader.lines().collect(Collectors.joining(System.lineSeparator()));
		reader.close();
		BufferedWriter writer = new BufferedWriter(new FileWriter(zielPfad));

		text = umlaute(text);

		writer.write(text);
		writer.flush();
		writer.close();
		System.out.println("Fertig");
	}

}
