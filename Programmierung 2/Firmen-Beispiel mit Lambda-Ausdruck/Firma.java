package aki;
import java.util.Scanner;

public class Firma {

    // Array mit allen der Firma zugehoerigen Personen
    private Person[] allePersonen;
    // Maximale Anzahl von Personen fuer diese Firma
    private int groesseMax;
    // Name der Firma
    private String firmenname;
    // Fuer die aktuelle Anzahl von Personen bei der Firma
    private int jetzigeGroesse;
    // Fuer die aktuelle Anzahl von Kunden bei der Firma
    private int anzahlKunde;

    /**
     * Konstruktor ohne Parameter. Liest den Namen der Firma und die Anzahl der
     * Angestellte interaktiv von der Tastatur ein.
     */
    public Firma() {
        Scanner sc = new Scanner(System.in);
        // Firmenname von Konsole einlesen
        System.out.println("Firmenname eingeben:");
        firmenname = sc.next();
        // Firmengroesse von der Konsole einlesen
        System.out.println("Anzahl der Personen (Angestellte und Kunde) eingeben:");
        groesseMax = sc.nextInt();
        // Personen-Array mit eingegebener Groesse initialisieren
        allePersonen = new Person[groesseMax];
        // Weitere Initalisierungen
        jetzigeGroesse = 0;
        anzahlKunde = 0;
    }

    /**
     * Konstruktor mit Parameter fuer Firmengroesse und Firmenname.
     * 
     * @paran groesseFirma Groesse der Firma
     * @param nameFirma Firmenname
     * 
     */
    public Firma(int groesseFirma, String nameFirma) {
        // Initialisierungen
        groesseMax = groesseFirma;
        firmenname = nameFirma;
        allePersonen = new Person[groesseMax];
        jetzigeGroesse = 0;
        anzahlKunde = 0;
    }

    /**
     * Getter für den Firmennamen.
     * 
     * @return Name der Firma.
     */
    public String getName() {
        return firmenname;
    }

    /**
     * Pruefung ob maximale Firmengroesse bereits erreicht ist.
     * 
     * @return Boolean Flag ob Firma bereits voll ist.
     */
    public boolean istVoll() {
        return jetzigeGroesse >= groesseMax;
    }

    /**
     * Die Methode addKunde fuegt den uebergebenen Kunden der Firma hinzu und setzt
     * die Kundennummer fuer den Kunden entsprechend der Anzahl der bereits
     * vorhandenen Kunden.
     * 
     * @param k Kunde der der Firma hinzugefuegt werden soll.
     */

    public void addKunde(Kunde k) {
        if (addPerson(k)) {
            // wenn Kunde erfolgreich hinzugefuegt wurde,
            // Kundennummer entsprechend setzen
            k.setKundenNr(anzahlKunde++);
        }
    }

    /**
     * Die Methode addAngestellte fuegt den uebergebenen Angestellten der Firma
     * hinzu.
     * 
     * @param ang Angestellter der der Firma hinzugefuegt werden soll.
     */
    public void addAngestellte(Angestellte ang) {
        addPerson(ang);
    }

    /**
     * Die Hilfsmethode addPerson fuegt die uebergebene Person der Firma hinzu falls
     * die maximale Firmengroesse noch nicht erreicht ist. Eine Person kann dabei
     * entweder ein Kunde oder ein Angestellter sein.
     * 
     * @param p Person vom Typ Kunde oder Angestellte die der Firma hinzugefuegt
     *          werden soll.
     * @return boolean true, wenn Person der Firma hinzugefuegt wurde, false, wenn
     *         Person der Firma nicht hinzugefuegt wurde.
     */
    private boolean addPerson(Person p) {
        if (istVoll()) {
            // BenutzerInnen informieren, dass weiteres Hinzufuegen nicht
            // moeglich ist
            System.out.println("Firma ist schon komplett. Die Person wird nicht hinzugefuegt.");
            return false;
        } else {
            // Achten: mit dem Inkrement-Operator ++ wird danach jetzigeGroesse
            // erhoeht bereit fuer die naechste Person
            allePersonen[jetzigeGroesse++] = p;
            return true;
        }
    }

    /**
     * Die Methode alleGehaelter() berechnet die Summe der Gehaelter aller
     * Angestellten der Firma ud gibt diese zurueck.
     * 
     * @return Summe der Gehaelter
     */
    public float alleGehaelter() {
        float summe = 0; // init
        // Schleife ueber alle Personen der Firma
        for (Person p : allePersonen) {
            // nur Angestellte-Objekt haben einen Gehalt
            // daher der Test der Klasse mit instanceof
            if (p instanceof Angestellte) {
                // dieser Cast Befehl ist noetig, da die Klasse Person keine
                // Methode getGehalt enthaelt
                Angestellte a = (Angestellte) p;
                // Gehalt des aktuellen Angestellten zu Summe addieren
                summe += a.getGehalt();
            }
        }
        return summe;
    }

    /**
     * Die Methode alleAdressenAusgeben() gibt die Adressen aller der Firma
     * zugehoerigen Personen auf der Konsole aus.
     */
    public void alleAdressenAusgeben() {
        System.out.println(" Alle Personen der Firma: " + firmenname);
        for (int i = 0; i < jetzigeGroesse; i++) {
            // Polymorphie. Es wird immer die passende getAdresse()-Methode
            // aufgerufen
            String[] adresse = allePersonen[i].getAdresse();
            // Schleife über alle im Adress-Array enthaltenen Strings
            for (String s : adresse) {
                System.out.println(s);
            }
            System.out.println("************************");
        }
    }

    /**
     * gibt alle Personen der Firma zurueck
     * 
     * @return das Array mit allen Personen der Firma
     */

    public Person[] getAllePersonen() {
        return this.allePersonen;
    }

}
