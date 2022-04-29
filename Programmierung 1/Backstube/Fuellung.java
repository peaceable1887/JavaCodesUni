/**
 * Klasse "Fuellung" erbt von der Klasse "Berliner", sie berechnet 
 * die Gesamtkosten eines Berliner mit Füllung. 
 * 
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */
public class Fuellung extends Berliner
{
	//Variable wird als "protected" deklariert
	protected int preisFuellung;
	
	/**
	 *Konstruktor für die die Erzeugung Berliner mit Füllung.
	 *@param nameBerliner
	 *@param preisProStueck
	 *@param nameFuellung
	 *@param preisFuellung
	 *
	 */
	public Fuellung(String nameBerliner, int preisProStueck, String nameFuellung, int preisFuellung)
	{
		super(nameBerliner+" "+nameFuellung, preisProStueck);
		this.preisFuellung = preisFuellung;
	}
	
	/**
	 * Methode um Kosten zu ermitteln.
	 * Berechnet die Kosten für einen Berliner
     * mitFuellung
	 * @return BGesamt
	 */
	public int getKosten()
	{
		int BGesamt = preisProStueck+preisFuellung;
		return BGesamt;
	}
}