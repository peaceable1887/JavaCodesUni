package dud;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * Diese Klasse stellt die Funktionen des Programms bereit, die dann vom User
 * Interface aufgerufen werden.
 * 
 * @author Felix Hansmann
 *
 */
public class DateiManager {
	/**
	 * Bei Uebergabe eines vollstaendigen (absoluten) Verzeichnispfades erstellt die
	 * Methode eine neue Verzeichnisstruktur auf dem Rechner. Bereits existierende
	 * Verzeichnisse gleichen Namens werden beibehalten.
	 * 
	 * @param pfad Pfad zum Verzeichnis welches erstellt werden soll
	 * @throws IOException
	 */
	public static void erstelleVerzeichnis() throws IOException {
		System.out.print("Geben Sie den Pfad der Datei an die Sie erstellen wollen (ohne Dateinamen): ");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte geben Sie ihre gewuenschte Verzeichnisstruktur an und den dazugehoerigen Ordner"
				+ "\n Beispiel: C:\\Users\\felix\\Desktop\\SampleOrdner");
		String path = scanner.next();

		System.out.println("Wollen Sie zusaetzlich eine Datei erstellen? (1) Ja (2) Nein");
		String query = scanner.next();

		try {
			int queryData = Integer.parseInt(query);

			if (queryData == 1) {

				System.out.println("Geben Sie den Namen der Datei ein.");

				String fileName = scanner.next();

				File file = new File(path + "/" + fileName);

				File dir = new File(path);

				if (dir.mkdir()) {
					System.out.println("Pfad und Datei wurde erstellt.");
					file.createNewFile();

				} else {
					System.out.println(dir + "konnte nicht erstellt werden");
				}

			}
			if (queryData == 2) {

				File dir = new File(path);

				if (dir.mkdir()) {
					System.out.println("Pfad wurde erstellt.");

				} else {
					System.out.println(dir + "konnte nicht erstellt werden");
				}

			} else {
				System.out.println("Ungueltige Eingabe");
			}
		} catch (Exception e) {
			System.out.println("Ungueltige Angabe");
		}
	}

	/**
	 * Kopiert die Datei mit dem angegebenen (absoluten) Quelldateipfad in eine
	 * Datei mit dem angegebenen (absoluten) Zieldateipfad (d. h. der Zieldateiname
	 * ist mit anzugeben).
	 * 
	 * @param quelldateipfad Pfad der Datei die kopiert werden soll
	 * @param zieldateipfad  Pfad zum neuen Verzeichnis inklusive Dateinamen
	 * @throws IOException
	 */
	public static void kopiereDateiNach(String quelldateipfad, String zieldateipfad) throws IOException {
		FileInputStream in = new FileInputStream(quelldateipfad);
		FileOutputStream out = new FileOutputStream(zieldateipfad);
		long dateiLaenge = (new File(quelldateipfad)).length();
		byte[] b = new byte[(int) dateiLaenge];
		int len;
		while ((len = in.read(b)) > 0) {
			out.write(b, 0, len);
		}
		out.close();
		in.close();

		System.out.println("Datei " + quelldateipfad + " wurde nach " + zieldateipfad + " kopiert.");
	}

	/**
	 * liefert Informationen ueber die Datei/das Verzeichnis zurueck, die/das sich
	 * am angegebenen Pfad befindet.
	 * 
	 * @param pfad Pfad zur datei/zum Verzeichnis zu dem die Infos erstellt werden
	 *             sollen.
	 * @return dateiInfos Rueckgabe der Dateiinformationen.
	 */
	public static DateiInfos gibDateiInfos(String pfad) {
		File file = new File(pfad);
		DateiInfos dateiInfos = new DateiInfos(file.getAbsolutePath(), file.exists(), new Date(file.lastModified()),
				file.length(), file.isFile(), file.canRead(), file.canWrite());
		return dateiInfos;
	}
}
