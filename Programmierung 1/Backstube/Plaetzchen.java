/**
 * Klasse "Plaetzchen" erbt von "Gebaeck", 
 * Sie berechnet die Gesamtkosten der Plätzchen und gibt sie zurück.
 
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */

public class Plaetzchen extends Gebaeck
{
	//Variablen werden als "protected" deklariert
	protected int anzahl;
	protected int preisProStueck;
	
	/**
	 *Konstruktor für die die Erzeugung der Plätzchen.
	 *@param name
	 *@param anzahl
	 *@param preisProStueck
	 */
	public Plaetzchen(String name, int anzahl, int preisProStueck)
	{
		super(name);
		this.anzahl = anzahl;
		this.preisProStueck = preisProStueck;
	}
	
	/**
	 * Diese Methode gibt der Gesamkosten der
	 * der Plätzchen wieder.
	 * @return PGesamt
	 */
	public int getKosten()
	{
		int PGesamt = (anzahl*preisProStueck);
		return PGesamt;
	}
}