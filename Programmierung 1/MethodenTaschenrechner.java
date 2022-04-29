/**
 *Aufgabe 5.
 *Taschenrechner, mit auslagerung in Methoden, der Eingabeforderungen und Rechenoperationen.
 *Liest zwei Zahlen ein und berechnet das Ergebnis.
 *Der Benutzer kann selbst entscheiden wann das Programm beendet werden soll.
 *
 *@author Felix Hansmann
 *@version 9 (Build 9 + 181)
 */

import javax.swing.*;

public class MethodenTaschenrechner
{
    public static void main(String[] args)
	{
		//Deklaration und Initialisierung der Variablen "ergebnis" und "schleife".
		
		double ergebnis = 0;
		boolean schleife = false;
		
		/*
		 *Einbidung einer "while-Schleife", inklusive Rechenoperation, mithilfe von switch/case-Verzweigungen
		 *und den jeweiligen Eingabeforderungen. Benutzer kann das Programm per Eingabe beenden.
		 */
		
		while(!schleife)
		{
			double zahlEins = ersteZahlAbfragen();
		    double zahlZwei = zweiteZahlAbfragen();
			
			String rechenOp = JOptionPane.showInputDialog("Welche Rechenoperation wollen Sie durchfuehren?" + "\n"
			+ "(1)Addition" + "\n" + "(2)Subtraktion" + "\n" + "(3)Multiplitkation" + "\n" + "(4)Division" + 
			"\n" + "(0)Beenden");
		    int ausgabe = Integer.parseInt(rechenOp);
		
		        switch(ausgabe)
		        {
				case 1:
			        ergebnis = addition(zahlEins, zahlZwei);
			        JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + ergebnis);
					break;
		        case 2:
  		            ergebnis = subtraktion(zahlEins, zahlZwei);
			        JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + ergebnis);
					break;
		        case 3:
		            ergebnis = multiplikation(zahlEins, zahlZwei);
			        JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + ergebnis);
					break;
		        case 4:
			        ergebnis = division(zahlEins, zahlZwei);
                    JOptionPane.showMessageDialog(null, "Das Ergebnis ist " + ergebnis);
                    break;					
		        case 0:
		            schleife = true;
			        JOptionPane.showMessageDialog(null, "Proogramm wurde beendet.");
					break;
		        }
		}
	}
	
	/**
	 * Bei der Methode "ersteZahlabfragen", wird der Benutzer aufgefordert, die Erste von zwei 
	 * Fließkommazahlen einzugeben
     *
     *@param erste Zahl wird eingegeben
     *
     *@return gewaehlte Zahl wird zurueckgegeben
	 *
	 */
	public static double ersteZahlAbfragen()
	{
		String eingabeEins = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein");
		double zahlEins = Double.parseDouble(eingabeEins);
		return zahlEins;
	}
	
	/**
     * Bei der Methode "zweiteZahlabfragen", wird der Benutzer aufgefordert, die Zweite von zwei 
	 * Fließkommazahlen einzugeben	. 
	 *
	 *@param zweite Zahl wird eingegeben
	 *
	 *@return gewaehlte Zahl wrd zurueckgegeben
	 *
	 */
	public static double zweiteZahlAbfragen()
	{
		String eingabeZwei = JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein");
		double zahlZwei = Double.parseDouble(eingabeZwei);
		return zahlZwei;
	}
	
	/**
     * Die Methode "addition" verwendet die Rueckgabewerte der beiden Eingaben,
	 * addiert Sie miteinander und das Ergebnis wird zurueckgegeben. 
	 *
	 *@param Benutzereingaben werden addiert
	 *
	 *@return Ergebnis der Addition
	 *
	 */
	public static double addition(double zahlEins, double zahlZwei)
	{
		double erg = zahlEins + zahlZwei;
		return erg;
	}
	
	/**
     * Die Methode "subtraktion" verwendet die Rueckgabewerte der beiden Eingaben,
	 * subtrahiert Sie miteinander und das Ergebnis wird zurueckgegeben. 
	 *
	 *@param Benutzereingaben werden subtrahiert
	 *
	 *@return Ergebnis der Subtraktion
	 *
	 */
	public static double subtraktion(double zahlEins, double zahlZwei)
	{
		double erg = zahlEins - zahlZwei;
		return erg;
	}
	
	/**
     * Die Methode "multiplikation" verwendet die Rueckgabewerte der beiden Eingaben,
	 * multipliziert Sie miteinander und das Ergebnis wird zurueckgegeben. 
	 *
	 *@param Benutzereingaben werden multipliziert
	 *
	 *@return Ergebnis der Multiplikation
	 *
	 */
	public static double multiplikation(double zahlEins, double zahlZwei)
	{
		double erg = zahlEins * zahlZwei;
		return erg;
	}
	
	/**
     * Die Methode "division" verwendet die Rueckgabewerte der beiden Eingaben,
	 * dividiert Sie miteinander und das Ergebnis wird zurueckgegeben. 
	 *
	 *@param Benutzereingaben werden dividiert
	 *
	 *@return Ergebnis der Division
	 *
	 */
	public static double division(double zahlEins, double zahlZwei)
	{
		double erg = zahlEins / zahlZwei;
		return erg;
	}

}