/**
 *Aufgabe 6.
 *
 *Dieses Programm gibt, mithilfe des Datentypen "Kontakt", 
 *verschiedene Daten zu Personen wieder und gibt sie anschließend aus.
 *
 *@author Felix Hansmann
 *@version 9 (Build 9 + 181)
 */

public class Main
{
    public static void main(String[] args)
	{
	 
		//Erzeugung mit Hilfe des Standardkonstrukor
		Kontakt person1 = new Kontakt();
		person1.name = "Mueller";
	    person1.vorname = "Thomas";
	    person1.strasse = "Schillerstrasse";
	    person1.hausNr = 34;
	    person1.stadt = "Oldenburg";
	    person1.matrikelnummer = 243567;
	    person1.hobby = "Fussball";
        person1.alter = 28;
		
		Kontakt person2 = new Kontakt();
		person2.name = "Meier";
	    person2.vorname = "Hans";
	    person2.strasse = "Gaensemarkt";
	    person2.hausNr = 56;
	    person2.stadt = "Hamburg";
	    person2.matrikelnummer = 245690;
	    person2.hobby = "Zeichnen";
        person2.alter = 30;
	
		//Erzeugung mit Hilfe des selbst definierten Konstruktor
		Kontakt person3 = new Kontakt("Hansmann", "Felix", "Ritterstasse", 27, "Hamburg", 271842, "Tischtennis", 27);
		Kontakt person4 = new Kontakt("Mustermann", "Max", "Musterstrasse", 34, "Berlin", 233321, "Fussball", 30);
		Kontakt person5 = new Kontakt("Bazzani", "Davide", "Rissener Landstrasse", 233, "Hamburg", 223765, "Fussball", 20);
		
		//Systemausgabe der 3 Studenten.
		System.out.println(person1);
		System.out.println("---------------------------------------");
		System.out.println(person2);
		System.out.println("---------------------------------------");
		System.out.println(person3);
		System.out.println("---------------------------------------");
		System.out.println(person4);
		System.out.println("---------------------------------------");
		System.out.println(person5);
		
        		
	}
}