/**
 * Klasse "Apfelkuchen" erbt von "Gebaeck", 
 * Sie berechnet die Gesamtkosten eines Apfelkuchen und gibt sie zurück.
 *
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */

public class Apfelkuchen extends Gebaeck
{
	//Variablen werden als "protected" deklariert
	protected int gewichtInGramm;
	protected double kostenProGramm;
	
	
	/**
	 *Konstruktor für die die Erzeugung eines Apfelkuchen.
	 *@param name
	 *@param gewichtInGramm
	 *@param kostenProGramm
	 *
	 */
	public Apfelkuchen
	(String name, int gewichtInGramm, int kostenProKiloGramm)
	{
		super(name);
		this.gewichtInGramm = gewichtInGramm;
		this.kostenProGramm = ((double)kostenProKiloGramm)/1000.0;
	}
	
	/**
	 * Diese Methode gibt der Gesamkosten 
	 * für einen Apfelkuchen wieder
	 * @return AGesamt
	 */
	public int getKosten()
	{
		int AGesamt = (int)Math.round((gewichtInGramm*kostenProGramm));
		return AGesamt;
	}
}