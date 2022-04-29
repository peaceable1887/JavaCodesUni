/**
 *Dieses Programm berechnet den individuellen Verbrauch an Papier, je Kartons.
 *Anschließend wird der Gesamtverbrauch angezeigt.
 *
 *@author Felix Hansmann
 *@version 9 (Build 9 + 181)
 */

import javax.swing.*;
import java.util.Arrays;

public class KartonSchnitt
{
    public static void main(String[] args)
	{
	    //Variablen Initialisieren und Deklarieren
		
		String eingabe = "";
        int anzahl = 0;
        double[] kartons = null;
        double breite = 0;
        double hoehe = 0;
		double laenge = 0;
		double zaehler = 0;
		
		
    	//Eingabeforderung
		eingabe = JOptionPane.showInputDialog("Wieviele Kartons moechten Sie erstelllen?");
        //Parsing 
		try{
        anzahl = Integer.parseInt(eingabe);
        }
		catch
		(Exception e)
		{
			System.out.println("Geben Sie nur Zahlen ein");
			return;
		}
	    
		kartons = new double[anzahl];

        //Einbau einer for-Schleife, zur Abfrage der Werte.
		for(int i = 0; i < anzahl; i++)
		{
			try{
			eingabe = JOptionPane.showInputDialog(i + 1 + ". Kartons" + "\n" + "Wie breit soll der Karton sein?");
			breite = Double.parseDouble(eingabe);
			eingabe = JOptionPane.showInputDialog(i + 1 + ". Kartons" + "\n" + "Wie hoch soll der Karton sein?");
			hoehe = Double.parseDouble(eingabe);
			eingabe = JOptionPane.showInputDialog(i + 1 + ". Kartons" + "\n" + "Wie lang soll der Karton sein?");
			laenge = Double.parseDouble(eingabe);}
			catch(Exception e)
			{
				System.out.println("Geben Sie nur Zahlen ein");
				return;
			}
			
			kartons[i] = ((breite*hoehe)*2)+((breite*laenge)*2)+((laenge*hoehe)*2);
			
			JOptionPane.showMessageDialog(null, i + 1 + ". Karton:" + "\n" + "Breite: " + breite + ".cm." + "\n" + "Hoehe: "+  hoehe + ".cm." +  "\n" +
			"Laenge: " + laenge + ".cm." + "\n" + "--------------------------------------" + "\n" + "Quadratflaeche in cm: " + kartons[i] );
			
		}	
		   
		   //Summiert die einzelnen Array-Werte.
		    for (int i = 0; i < kartons.length; i++ )
            {
                
			    zaehler += kartons[i];
				
            }
		    //Systemausgabe des Gesamtverbauch an Papier. 
            JOptionPane.showMessageDialog(null, "Der Gesamtverbrauch an Papier betraegt: " + zaehler);	
	}
}