package aki;
public abstract class Person {

    // Instanzvariablen
    protected String nachname;
    protected String vorname;
    protected String strasse;
    protected String hausnummer;
    protected String ort;
    protected String plz;
    protected boolean weiblich; // Ist Person maennlich=> weiblich=false,
                                // ist sie weiblich: weiblich=true

    /**
     * Parameterloser Konstruktor mit Initialisierung der Attribute mit
     * Muster-Werten.
     */
    public Person() {
        this.nachname = "Muster";
        this.vorname = "MusterVorname";
        this.strasse = "MusterStrasse";
        this.hausnummer = "xx";
        this.ort = "MusterOrt";
        this.plz = "plzpl";
        this.weiblich = true;
    }

    /**
     * Mit diesem Konstruktor erfolgt die Initialisierung der Attribute durch die
     * uebergebenen Parameter.
     * 
     * @param nachname   Nachname der Person
     * @param vorname    Vorname der Person
     * @param strasse    Strasse zur Adresse der Person
     * @param hausnummer Hausnummer zur Adresse der Person
     * @param ort        Ort zur Adresse der Person
     * @param plz        PLZ zur Adresse der Person
     * @param weiblich   Flag ob Person weiblich ist
     */
    public Person(String nachname, String vorname, String strasse, String hausnummer, String ort, String plz,
            boolean weiblich) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.ort = ort;
        this.plz = plz;
        this.weiblich = weiblich;

    }

    /**
     * Getter des Attributes weiblich.
     * 
     * @return ob die Person weiblich ist
     */
    public boolean isWeiblich() {
        return weiblich;
    }

    /**
     * gibt die Anrede zurueck. Diese Methode ist abstrakt und wird erst bei der
     * Weitervererbung (an Kunde und Angestellter) weiter definiert.
     * 
     * @return die Anrede
     */

    protected abstract String getAnrede();

    /**
     * Die Methode gibt die Adresse einer Person-Objekt zurück.
     * 
     * @return die Adresse als ein Array von String-Objekte
     */

    public String[] getAdresse() {
        String[] adresse = new String[4];
        adresse[0] = getAnrede();
        adresse[1] = " " + vorname + " " + nachname;
        adresse[2] = " " + strasse + " " + hausnummer;
        adresse[3] = " " + plz + " " + ort;
        return adresse;
    }

    /**
     * Die Methode getName() gibt Vornamen und Nachnamen zurueck.
     * 
     * @return Vorname gefolgt von " - " gefolgt vom Nachname
     */
    public String getName() {
        return vorname + " - " + nachname;
    }
    
    @Override
    public String toString() {
    	String ret = "";
    	for(String s : this.getAdresse()) {
    		ret += s + "\n";
    	}
    	return ret;
    }

}
