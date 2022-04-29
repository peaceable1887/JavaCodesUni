/**
 *Aufgabe 7.
 *Einfacher Taschenrechner, mit auslagerung in Methoden, der Eingabeforderungen, Rechenoperationen
 *und Exception-Behandlungen.
 *Liest zwei Zahlen ein und berechnet das Ergebnis.
 *Der Benutzer kann selbst entscheiden wann das Programm beendet werden soll.
 *
 *@author Felix Hansmann
 *@version 9 (Build 9 + 181)
 */

import javax.swing.*;

public class MT
{
    public static void main(String[] args)
	{
		//Deklaration und Initialisierung der Variablen "ergebnis" und "schleife".
		
		double ergebnis = 0;
		boolean schleife = false;
		
		while(!schleife)
		{
			double zahlEins = ersteZahlAbfragen();
			double zahlZwei = zweiteZahlAbfragen();
			int ausgabe = 0;
		
			String rechenOp = JOptionPane.showInputDialog("Welche Rechenoperation wollen Sie durchfuehren?" + "\n"
			+ "(1)Addition" + "\n" + "(2)Subtraktion" + "\n" + "(3)Multiplitkation" + "\n" + "(4)Division" + 
			"\n" + "(5)Beenden");
		    
			try{
			ausgabe = Integer.parseInt(rechenOp);
			
		        if(ausgabe >= 1 && ausgabe <= 5)
			    {
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
		            case 5:
		                schleife = true;
			            JOptionPane.showMessageDialog(null, "Programm wurde beendet.");
					    break;
		        }	
			    }else
		    	{
			        JOptionPane.showMessageDialog(null,"Fehler: Bitte geben Sie nur eine der genannten Zahlen ein.");
			        System.out.println("Programm wurde beendet.");
				    System.exit(0);
			    } 
			}catch(Exception e)
		    {
				JOptionPane.showMessageDialog(null,"Fehler: Buchstaben und Sonderzeichen sind nicht erlaubt.");
				System.out.println("Programm wurde beendet.");
				System.exit(0);
		    }					    
		}
	}
	
	/**
	 * Bei der Methode "ersteZahlabfragen", wird der Benutzer aufgefordert, die Erste von zwei 
	 * double-Werten einzugeben. Ist dies nicht der Fall, wird eine Exception geworfen.
     *
     *@return zahlEins gewaehlte Zahl wird zurueckgegeben
	 *
	 */
	public static double ersteZahlAbfragen()
	{
		double zahlEins = 0;
		    
			try{
		        String eingabeEins = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein");
                zahlEins = Double.parseDouble(eingabeEins);
       	    }catch(Exception e)
		    {
			    JOptionPane.showMessageDialog(null, "Fehler: Bitte nur Zahlen eingeben!");
			    System.out.println("Programm wurde beendet.");
			    System.exit(0);
		    }
		
		return zahlEins;
	}
	
	/**
     * Bei der Methode "zweiteZahlabfragen", wird der Benutzer aufgefordert, die Zweite von zwei 
	 * double-Werten einzugeben.Ist dies nicht der Fall, wird eine Exception geworfen.
	 *
	 *@return zahlZwei gewaehlte Zahl wrd zurueckgegeben
	 *
	 */
	public static double zweiteZahlAbfragen()
	{
	    double zahlZwei = 0;
		    
			try{
		        String eingabeZwei = JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein");
                zahlZwei = Double.parseDouble(eingabeZwei);
		       }catch(Exception e)
		       {
			    JOptionPane.showMessageDialog(null, "Fehler: Bitte nur Zahlen eingeben !");
			    System.out.println("Programm wurde beendet.");
			    System.exit(0);
		        }   
		
		return zahlZwei;
	}
	
	/**
     * Die Methode "addition" verwendet die Rueckgabewerte der beiden Eingaben,
	 * addiert Sie miteinander und das Ergebnis wird zurueckgegeben. 
	 *
	 *@param zahlEins erster double-Wert der Eingabeforderung
	 *@param zahlZwei zweiter double-Wert der Eingabeforderung
	 *
	 *@return erg Ergebnis der Addition
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
	 *@param zahlEins erster double-Wert der Eingabeforderung
	 *@param zahlZwei zweiter double-Wert der Eingabeforderung
	 *
	 *@return erg Ergebnis der Subtraktion
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
	 *@param zahlEins erster double-Wert der Eingabeforderung
	 *@param zahlZwei zweiter double-Wert der Eingabeforderung
	 *
	 *@return erg Ergebnis der Multiplikation
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
	 *@param zahlEins erster double-Wert der Eingabeforderung
	 *@param zahlZwei zweiter double-Wert der Eingabeforderung
	 *
	 *@return erg Ergebnis der Division
	 *
	 */
	public static double division(double zahlEins, double zahlZwei)
	{	
		double erg = zahlEins / zahlZwei;
		
		    if(erg == 1d/0)
		    {
			    JOptionPane.showMessageDialog(null, "Fehler: Es kann nicht durch 0 dividiert werden!");
			    System.out.println("Programm wurde beendet.");
			    System.exit(0);
		    }else if(erg == -1d/0)
			{
				JOptionPane.showMessageDialog(null, "Fehler: Es kann nicht durch 0 dividiert werden!");
			    System.out.println("Programm wurde beendet.");
			    System.exit(0);
			}	
		return erg;
	}
}