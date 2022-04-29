/**
 * Simpler Taschenrechner
 * 
 *@Author Felix Hansmann(Matrikelnummer: 271842)
 *
 *@version 9 (Build 9 +181)
 */

import javax.swing.*;

public class STaschenrechner
{
    public static void main(String []args)
	{
	    //Initialisieren und Deklaration von Variablen
		
		String eingabe = "";
		String eingabe2 = "";
		String rechenOP = "";
		double zahlEins = 0;
	        double zahlZwei = 0;
	        int zahl = 0;
		double ergebnis = 0;
	
		
		  
		//Einbindung der Eingabefelder und der Rechenoperation mithilfe von if/if-else Anwendungen	
			
			rechenOP = JOptionPane.showInputDialog("(1)Addition" + "\n" + "(2)Subtraktion" + "\n" +
			"(3)Multiplikation" + "\n" + "(4)Division"); 
			zahl = Integer.parseInt(rechenOP);
			
			eingabe = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein");
 	                zahlEins = Double.parseDouble(eingabe);
			
			eingabe2 = JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein");
			zahlZwei = Double.parseDouble(eingabe2);
				
				
	                    if(zahl==1)
			    {
				    ergebnis = zahlEins+zahlZwei;
			        JOptionPane.showMessageDialog(null,"Das Ergebnis der Addition ist " + ergebnis );
			    }else if(zahl==2)
			    {
				    ergebnis = zahlEins-zahlZwei;
			        JOptionPane.showMessageDialog(null,"Das Ergebnis der Subtraktion ist " + ergebnis );
			    }else if(zahl==3)
			    {
				    ergebnis = zahlEins*zahlZwei;
			        JOptionPane.showMessageDialog(null, "Das Ergebnis der Multiplikation ist " + ergebnis );
			    }else if(zahl==4)
			    {
			        ergebnis = zahlEins/zahlZwei;
			        JOptionPane.showMessageDialog(null, "Das Ergebnis der Division ist " + ergebnis );
			    }
						 
	        JOptionPane.showMessageDialog(null, "Programm wurde beendet");	
		
	}		
}