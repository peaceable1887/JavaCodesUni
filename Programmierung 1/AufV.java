/**
 * Klasse "AufV" ließt alle Daten aus der Klasse "AuftragUni" 
 * ein, sie gibt entweder alle Auträge, jeden einzelnen oder den Gesamtpreis
 * wieder.
 * 
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */

import javax.swing.*;
import java.util.ArrayList;

public class AufV
{
	//Variablen werden deklariert und initialisiert
	static ArrayList<AuftragUni> auftragsliste = new ArrayList<>();
	static double gesamtPreis = 0;
	
	/**
	 * Die Methode "berechneEinnahmen" summiert die Einnahmen aller Auftraege.
	 * 
	 * @return gesamtPreis;
	 */
	public static double berechneEinnahmen()
	{
		for(int i = 0; i < auftragsliste.size(); i++)
		{
			gesamtPreis += auftragsliste.get(i).getPreis();
			
		}
		return gesamtPreis;
	}
	
    /**
	 *Methode "print" gibt alles Aufträge auf der Standardkonsole wieder.  
	 *
	 */
	public static void print()
	{
		for(AuftragUni  a : auftragsliste)
			a.print();
	}
	
	/**
     * Die Methode "info" gibt einen bestimmen Auftrag wieder,
	 * der Benutzer kann selbst entscheiden welchen er sich ansehen will. 
	 * 
	 */
	public static void info()
	{
		int zahl = 0;
		String eingabe = JOptionPane.showInputDialog("Welchen Auftrag wollen Sie sich ansehen?" + 
		"\n" + "(1)AuftragsNr. 10001" + "\n" + "(2)AuftragsNr. 10011" + "\n" + "(3)AuftragsNr. 20002" );
		try{
		zahl = Integer.parseInt(eingabe);
		}
		catch(Exception e)
		{
			System.out.println("Bitte geben Sie nur eine der geganngen Zahlen ein");
			System.out.println("Programm wurde beendet");
			System.exit(0);
		}
		
		switch(zahl)
		{
				case 1:
				System.out.println("\n1.Auftrag:\n ---------");
		        auftragsliste.get(0).print();
				break;
				case 2:
				System.out.println("\n2.Auftrag:\n ---------");
		        auftragsliste.get(1).print();
				break;
				case 3:
				System.out.println("\n3.Auftrag:\n ---------");
		        auftragsliste.get(2).print();
				break;
				
		}
		
	}
	
	/**
     * Die Methode "main" besizt eine "while-Schleife" mit einer switch/case-Anwendung, die dem.
	 * Benutzer drei Möglichkeiten gibt seinen Auftrag ausführen zu lassen.
	 * Zudem kann der Benutzer selbst entscheiden wann er das Porgramm beenden will.
	 * 
	 */
	public static void main(String[] args)
	{
		int zahlZwei = 0;
		
		AuftragUni auftragEins = new AuftragUni(10001, "Max Mustermann", 3, 6, 300.50, 1);
		auftragsliste.add(auftragEins);
		AuftragUni auftragZwei = new AuftragUni(10011, "Davide Bazzani" , 3 , 4, 120.00,1 );
		auftragsliste.add(auftragZwei);
		AuftragUni auftragDrei = new AuftragUni(20002, "Felix Hansmann", 1, 2, 250.00, 1);
		auftragsliste.add(auftragDrei);
		
		//Variable wird deklariert und initialisiert
		boolean schleife = false;
		
		while(!schleife)
		{
			
			String eingabeHp = JOptionPane.showInputDialog("Welche Funktion waehlen Sie?:" + "\n" + "(1)Alle Auftraege" 
			+ "\n" + "(2)bestimmter Auftraeg" + "\n" + "(3)Einnahmen: " + "\n" + "(4)Beenden");
			
			try{
			zahlZwei = Integer.parseInt(eingabeHp);
			}
			catch(Exception e){
			System.out.println("Bitte geben Sie nur eine der geganngen Zahlen ein");
			System.out.println("Programm wurde beendet");
			System.exit(0);
			}
			switch(zahlZwei)
			{
				case 1: print();
				break;
				case 2: info();
				break;
				case 3: System.out.println(berechneEinnahmen());
				break;
				case 4: schleife = true;
				break;		
			}
			
		}
		//Programm wird beendet
		System.out.println("Programm wurde beendet");
	
	}
}