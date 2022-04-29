/**
 * Klasse "AuftragUni" besitzt einen Konstruktor mit entsprechenden Attribute.
 * Des Weiteren alles dafür benötigen Methoden.
 * @author Felix Hansmann
 * @version 9 (Build 9 + 181)
 */

public class AuftragUni
{
	//Variablen werden deklariert
	private int auftragsnummer;
	private String auftraggeber;
	private int auftragsbeginn;
	private int auftragsende;
	private double preis;
	private double gesamtPreis;
	private String auftragsstatus;
	public int aktuelleKW;
	

	/**
	 * Kostruktor
	 * 
	 * @param auftragsnummer
	 * @param auftraggeber
	 * @param auftragsbeginn
	 * @param auftragsende
	 * @param preis
	 * @param aktuelleKW
	 */
	
	public AuftragUni(int auftragsnummer, String auftraggeber, int auftragsbeginn, int auftragsende, double preis, int aktuelleKW)
	{
		this.auftragsnummer = auftragsnummer;
		this.auftraggeber = auftraggeber;
		this.auftragsbeginn = auftragsbeginn;
		this.auftragsende = auftragsende;
		this.preis = preis;
		this.aktuelleKW = aktuelleKW;
		
	}
	
	/**
	 *Methode "setAuftragsnummer"  
	 *
	 *@param String auftragsnummer
	 */
	public void setAuftragsnummer(int auftragsnummer)
	{
		this.auftragsnummer = auftragsnummer;
	}
	
	/**
	 * Die Methode "getAuftragsnummer" gibt den Nummer des Auftrages zurück.
	 *
	 *@return int auftragsnummer
	 */
	public int getAuftragsnummer()
	{
		return auftragsnummer;
	}
	/**
	 *Methode "setAuftraggeber"  
	 *
	 *@param String auftraggeber
	 */
	public void setAuftraggeber(String auftraggeber)
	{
		this.auftraggeber = auftraggeber;
	}
	
	/**
	 * Die Methode "getAuftraggeber" gibt den Namen des Auftraggeber zurück.
	 *
	 *@return String auftraggeber
	 */
	public String getAuftraggeber()
	{
		return auftraggeber;
	}
	
	/**
	 *Methode "setAuftragsbeginn"  
	 *
	 *@param int auftragsbeginn
	 */
	public void setAuftragsbeginn(int auftragsbeginn)
	{
		this.auftragsbeginn = auftragsbeginn;
	}
	
	/**
	 * Die Methode "getAuftragsbeginn" gibt den Start des Auftrages zurück.
	 *
	 *@return int auftragsbeginn
	 */
	public int getAuftragsbeginn()
	{
		return auftragsbeginn;
	}
	
	/**
	 *Methode "setAuftragsende"  
	 *
	 *@param int auftragsende
	 */
	public void setAuftragsende(int auftragsende)
	{
		this.auftragsende = auftragsende;
	}
	
	/**
	 * Die Methode "getAuftragsende" gibt die Abschlusswoche wieder.
	 *
	 *@return int auftragsende
	 */
	public int getAuftragsende()
	{
		return auftragsende;
	}
	
	/**
	 *Methode "setPreis"  
	 *
	 *@param double preis
	 */
	public void setPreis(double preis)
	{
		this.preis = preis;
	}
	
	/**
	 * Die Methode "getPreis" gibt den Preis zurück.
	 *
	 *@return double preis
	 */
	public double getPreis()
	{
		return preis;
	}
	
	/**
	 *Methode "setGesamtpreis"  
	 *
	 *@param double gesamtPreis
	 */
	public void setGesamtpreis(double gesamtPreis)
	{
		this.gesamtPreis = gesamtPreis;
	}
	
	/**
	 * Die Methode "getGesamtpreis" Gesamtpreis aller Aufträge.
	 *
	 *@return double auftragsstatus
	 */
	public double getGesamtPreis()
	{
		gesamtPreis += preis;
		return gesamtPreis;
	}
	
	/**
	 *Methode "setAuftsstatus  
	 *
	 */
	public void setAuftragsstatus()
	{
		this.auftragsstatus = auftragsstatus;
	}
	
	/**
	 * Die Methode "getAuftragsstatus" bestimmt, ob ein Auftrag, bereits begonnen ,
	 * nocht nicht angefangen oder schon beendet ist.
	 *
	 *@return auftragsstatus
	 */
	public String getAuftragsstatus(int aktuelleKW)
	{
		String auftragsstatus = "";
		
		if(auftragsbeginn > aktuelleKW)
		{
			auftragsstatus = "nicht angefangen";
		}
		if(auftragsbeginn <= aktuelleKW)
		{
			auftragsstatus = "angefangen";
		}
		if(auftragsende == aktuelleKW)
		{
			auftragsstatus = "beendet";
		}
		
		return auftragsstatus;
	}
	
	
	/**
	 * Die Methode "toString" fast die Wiedergabewerte aller Methoden zusammen und gibt sie zurück.
	 * 
	 * @return auftragsnummer;
	 * @return auftraggeber;
	 * @return auftragsbeginn;
	 * @return auftragsende;
	 * @return preis;
	 * @return getAuftragsstatus(aktuelleKW);
	 */
	public String toString()
	{
		return("Auftragsnummer: " + auftragsnummer  + "\n" + "Auftraggeber: " + auftraggeber + "\n" + "Auftragsbeginn: " + auftragsbeginn + "\n" +  
		"Auftragsende: " + auftragsende + "\n" + "Preis: " + preis + "\n" + "Auftragsstatus: " + getAuftragsstatus(aktuelleKW));
	}
	
	/**
	 * Die Methode "print" gibt die "toString" auf den Konsole aus.
	 */
	public void print()
	{
		System.out.println(toString());
	}
	
	
	
	
}