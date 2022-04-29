/**
 * Abstrakte Klasse Gebaeck als Schablone fuer verschiedene Gebaeckarten
 * 
 * @author LH
 */
public abstract class Gebaeck {
    
	//Variable wird initialisiert
	protected String name;

	/**
	 * Kostruktor
	 * Stellt sicher, dass die maximallaege des Namens nicht überschritten wird
	 * Hierbei wird die Konstante MAX_NAMENS_LAENGE aus der BackstubenAufsicht benutzt
	 * @param name
	 */
	public Gebaeck(String name) {
		if (name.length() <= BackstubenAufsicht.MAX_NAMENS_LAENGE)
			this.name = name;
		else
			this.name = name.substring(0, BackstubenAufsicht.MAX_NAMENS_LAENGE);
	}

	public final String getName() {
		return name;
	}

	/**
	 * Abstrakte Methode um Kosten zu ermitteln
	 * Individuell fuer jede Gebaeckart
	 * @return Kosten in Cent
	 */
	public abstract int getKosten();

}