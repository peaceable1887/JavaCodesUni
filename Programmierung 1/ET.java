/**
 *Aufgabe 4.
 *Einfacher Taschenrechner mit einer "while-Schleife".
 *Liest 2 Benutzereingaben ein und berechnet das Ergebnis.
 *Der Benutzer kann selbst entscheiden wann das Programm beendet werden soll.
 *
 *@author Felix Hansmann
 *@version 9 (Build 9 + 181)
 */

import javax.swing.*;

public class ET
{
    public static void main(String[] args)
	{
		//Deklaration der Variablen, für die Benutzereingabe, Rechenoperation und Schleife.
		
		String eingabeEins = "";
		String eingabeZwei = "";
		String eingabeRechenOp = "";
		double zahlEins = 0;
		double zahlZwei = 0;
		double erg = 0;
		int auswahl = 0;
		boolean schleife = false;
		
		       /*Einbidung einer "while-Schleife", inklusive Rechenoperation mithilfe der if/if-else Anwendung
		        *und den jeweiligen Eingabeforderungen.
		        */
	      	   
		        while(!schleife)
			{ 	
		        eingabeEins = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein: ");
		        zahlEins = Double.parseDouble(eingabeEins);
				
		        eingabeZwei = JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein: ");
		        zahlZwei = Double.parseDouble(eingabeZwei);
				 
		        eingabeRechenOp = JOptionPane.showInputDialog("Welche Rechenoperation wollen Sie durchfuehren?" + "\n" +
			"(1)Addition" + "\n" + "(2)Subtraktion" + "\n" + "(3)Multiplikation" + "\n" + "(4)Division" + "\n" + "(0)Beenden");
		        auswahl = Integer.parseInt(eingabeRechenOp);
				    
					if(auswahl == 1)
					{
						erg = zahlEins + zahlZwei;
						JOptionPane.showMessageDialog(null, zahlEins + " + " + zahlZwei + " = " + erg);
					}
					else if(auswahl == 2)
					{
						erg = zahlEins - zahlZwei;
						JOptionPane.showMessageDialog(null, zahlEins + " - " + zahlZwei + " = " + erg);
					}
					else if(auswahl == 3)
					{
						erg = zahlEins * zahlZwei;
						JOptionPane.showMessageDialog(null, zahlEins + " x " + zahlZwei + " = " + erg);
					}
					else if(auswahl == 4)
					{
						erg = zahlEins / zahlZwei;
						JOptionPane.showMessageDialog(null, zahlEins + " : " + zahlZwei + " = " + erg);
					}
					else if(auswahl == 0)
					{
					    JOptionPane.showMessageDialog(null, "Vielen Dank fuer den Gebrauch des Taschenrechner !");
						schleife = true;
					}
					
			}
		
		    JOptionPane.showMessageDialog(null, "Programm wurde beendet");
	}
}
