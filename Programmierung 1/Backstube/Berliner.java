/**
 * Klasse "Berliner" erbt von "Gebaeck", sie 
 * berechnet den Preis pro Stück, ohne Füllung.
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */

public class Berliner extends Gebaeck
{
	//Variable wird als "protected" deklariert
	protected int preisProStueck;
	
	/**
	 *Konstruktor für die die Erzeugung Berliner ohne Füllung.
	 *@param name
	 *@param preisProStueck
	 *
	 */
	public Berliner(String name, int preisProStueck)
	{
		super(name);
		this.preisProStueck = preisProStueck;
	}
	
	/**
	 * Diese Methode gibt den Preis für einen 
	 * Berliner ohne Füllung zurück.
	 * @return preisProStueck
	 */
	public int getKosten()
	{
		return preisProStueck;
	}
}