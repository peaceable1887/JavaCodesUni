/**
 * Klasse "Backstube" verarbeitet alles Daten aus
 * Klasse "Gebaeck","Apfelkuchen","Plaetzchen","Berliner"
 * und "Fuellung"
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */

public class Backstube
{
	//Variablen werden deklariert und initialisiert
	private BackstubenAufsicht Observer = new BackstubenAufsicht();
	private int maxGebaeck = 12;
	private int aktGebaeck = 0;
	private Gebaeck[] imOfen = new Gebaeck[maxGebaeck];
	private int minAnzahlfuerRabat = 8;
	
	/**
	 * Diese Methode füllt den Ofen
	 * @param Gebaeck i
	 */
	public void backeGebaeck(Gebaeck geb) 
	{
        imOfen[aktGebaeck] = geb;
	    aktGebaeck++;
	}
	
	/**
	 * Methode "leereOfen" leert den Ofen.
	 */
	public	void leereOfen()
	{
		for (int i=0; i < maxGebaeck; i++)
		{
			imOfen[i] = null;
		}
		aktGebaeck = 0;
	}
	
	/**
	 * Die Methode "gesamtGebaeckArtAnzahl"
	 * gibt die erstllen Gebäckarten wieder.
	 * @return aktGebaeck
	 */
	public int gesamtGebaeckArtAnzahl()
	{
		return aktGebaeck;
	}
	/**
	 * Die Methode "gesamtKosten"
	 * berechnet die Kosten für jedes 
	 * einzelne Gebaeck ohne Rabatt.
	 * @return gesamtKostenK
	 */
	public double gesamtKosten()
	{
		double gesamtKostenK = 0;
		for (int i=0; i < aktGebaeck; i++)
		{
			//System.out.println(i+"test Gebaeck:"+imOfen[i].getName()+ " Preis: "+imOfen[i].getKosten());
			gesamtKostenK += imOfen[i].getKosten();
		}
		
		return gesamtKostenK;
	}
	
	/**
	 * Die Methode "gesamtRabatt"
	 * berechnet den gesamten Rabatt der für jedes 
	 * einzelne Gebaeck anfällt.
	 * @return gesamtKostenR - gesamtKosten
	 */
	public int gesamtRabatt()
	{
		double gesamtKostenR = 0;
		for (int i=0; i < aktGebaeck; i++)
		{
			gesamtKostenR += imOfen[i].getKosten() * Observer.RABATT_IN_PROZENT/100.0;
		}
		return (int)Math.round(gesamtKostenR);		
	}

	/**
	 * Die Methode "toString" gibt "testBacken" als String zurück..
	 * 
	 * @return string
	 */
	public String toString()
	{
		String string = "*~ Backstube ~* \n";
		for(int i=0; i<aktGebaeck; i++){
			string+=imOfen[i].getName()+": "+BackstubenAufsicht.centsInEuroUndCents(imOfen[i].getKosten())+"\n";
		}
		return string;
	}

}