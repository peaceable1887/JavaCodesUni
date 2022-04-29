/**
 *Aufgabe 6.
 *
 *Diese Klasse, enthält einen selbst defninierten Datetypen "Kontakt",
 *des Weiteren einen "Default-Konstrukor und einen Konstruktor
 *mit den entsprechenden Attribute.
 *@author Felix Hansmann
 *@version 9 (Build 9 + 181)
 */

public class Kontakt
{
    //Deklaration der Variablen, name, vorname, strasse, hausNr, stadt, 
	//matrikelnummer, hobby und alter.
	
	String name;
	String vorname;
	String strasse;
	int hausNr;
	String stadt;
	int matrikelnummer;
	String hobby;
	int alter;
	
	//Default-Konstruktor
	public Kontakt()
	{
	}
		
	/**
	 *Konstruktur für die die Erzeugung eines Stundenten.
	 *@param name
	 *@param vorname
	 *@param straße
	 *@param hausNr
	 *@param stadt
	 *@param matrikelnummer
	 *@param hobby
	 *@param alter
	 */
	
	public Kontakt(String name, String vorname, String strasse, int hausNr, String stadt, int matrikelnummer, String hobby, int alter)
	{
		this.name = name;
		this.vorname = vorname;
		this.strasse = strasse;
		this.hausNr = hausNr;
		this.stadt = stadt;
		this.matrikelnummer = matrikelnummer;
		this.hobby = hobby;
		this.alter = alter;
	}
	 
    /**
	 *Gibt die Attribute eines Studenten als String wieder.
	 *@return name, vorname, strasse, hausNr, stadt, matrikelnummer, hobby, alter
	 */
	
	public String toString() 
	{
        return ("Person: " + name + ", " + vorname + "\n" + "Adresse: " + strasse + " " +  hausNr + "\n" + "Wohnort: " + stadt + "\n" +  
		"Matrikelnummer: " + matrikelnummer + "\n" + "Hobby: " + hobby + "\n" + "Alter: " + alter);
    }
    
}
