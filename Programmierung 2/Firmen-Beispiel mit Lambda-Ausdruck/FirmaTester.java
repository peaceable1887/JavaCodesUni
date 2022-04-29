package aki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FirmaTester {

	/**
	 * Main-Methode.
	 * 
	 * @param args Uebergabeparameter
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Firma kmu = new Firma(4, "Java4You");
		Angestellte ang1 = new Angestellte("Taylor", "Elisabeth", "Amrummer Strasse", "10", "Hamburg", "13353", true,
				410000f);
		kmu.addAngestellte(ang1);
		// result should be 410000
		System.out.println(kmu.alleGehaelter());
		Angestellte ang2 = new Angestellte("Mueller", "Mark", "Amrummer Strasse", "11", "Berlin", "13353", false,
				10000f);
		kmu.addAngestellte(ang2);
		// result should be 420000
		System.out.println(kmu.alleGehaelter());
		Kunde k1 = new Kunde("Cruise", "Tom", "Amrummer Strasse", "12", "Frankfurt", "13353", false);
		kmu.addKunde(k1);
		// result should be 0
		System.out.println(k1.getKundenNr());
		Kunde k2 = new Kunde("Jolie", "Angelina", "Amrummer Strasse", "13", "Nizza", "13354", true);
		kmu.addKunde(k2);
		// result should be 1
		System.out.println(k2.getKundenNr());
		// check we have the right people
		kmu.alleAdressenAusgeben();
		Kunde k3 = new Kunde("Deneuve", "Catherine", "Amrummer Strasse", "14", "Paris", "13353", true);
		// should not be possible
		kmu.addKunde(k3);
		// should be true
		System.out.println(kmu.istVoll());

		sortieren(kmu);
	}

	/**
	 * Ermoeglicht die Auswahl Personen einer Firma entweder nach Ort oder Plz zu sortieren
	 * 
	 * @param kmu
	 * 			Firma
	 * @throws IOException
	 */
	public static void sortieren(Firma kmu) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Wollen sie alle Angestellten nach Ort(O) oder PLZ(P) sortiert sehen?");
		String input = br.readLine();
		switch (input.toLowerCase()) {
		case "o":
			Arrays.sort(kmu.getAllePersonen(), (o1, o2) -> o1.ort.compareTo(o2.ort));

			System.out.println("##########-Nach Ort sortiert-##########");
			for (Person p : kmu.getAllePersonen()) {
				System.out.println(p);
			}
			break;
		case "p":
			Arrays.sort(kmu.getAllePersonen(), (o1, o2) -> o1.plz.compareTo(o2.plz));
			System.out.println("##########-Nach PLZ sortiert-##########");
			for (Person p : kmu.getAllePersonen()) {
				System.out.println(p);
			}
			break;
		default:
			System.out.println("Falsche Eingabe");
			sortieren(kmu);
			break;

		}

	}

}
