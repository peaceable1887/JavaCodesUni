package ShowContactsModel;
/**
 * Grundlagen der Programmierung 2
 * Einsendeaufgabe 6 - Kontaktliste mit JavaFX
 * 
 * Die Klasse Contact gibt die Parameter vor, aus welchen Attributen eine Koanktperon besteht.
 * 
 * @author Felix Hansmann
 * @version 16
 */	
import java.util.ArrayList;
import java.util.Arrays;

public class Contact 
{
	private String vorname;
	private String nachname;
	private String foto;
	private String eMail;
	private ArrayList<String> teleNr;
	
	/**
	 * Konstruktor wird erstellt
	 * @param vorname
	 * @param nachname
	 * @param foto
	 * @param eMail
	 * @param teleNr
	 */
	public Contact(String vorname, String nachname, String foto, String eMail, String... teleNr) 
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.foto = foto;
		this.eMail = eMail;
		this.teleNr = new ArrayList<String>(Arrays.asList(teleNr));
	}
	/**
	 * @return vorname
	 */
	public String getVorname() 
	{
		return vorname;
	}
	/**
	 * @param vorname
	 */
	public void setVorname(String vorname) 
	{
		this.vorname = vorname;
	}
	/**
	 * @return nachname
	 */
	public String getNachname() 
	{
		return nachname;
	}
	/**
	 * @param nachname
	 */
	public void setNachname(String nachname) 
	{
		this.nachname = nachname;
	}
	/**
	 * @return foto
	 */
	public String getFoto() 
	{
		return foto;
	}
	/**
	 * @param foto
	 */
	public void setFoto(String foto)
	{
		this.foto = foto;
	}
	/**
	 * @return eMail
	 */
	public String geteMail() 
	{
		return eMail;
	}
	/**
	 * @param eMail
	 */
	public void seteMail(String eMail)
	{
		this.eMail = eMail;
	}
	/**
	 * @return teleNr
	 */
	public ArrayList<String> getTeleNr() 
	{
		return teleNr;
	}
	/**
	 * @param teleNr
	 */
	public void setTeleNr(ArrayList<String> teleNr) 
	{
		this.teleNr = teleNr;
	}
	@Override
	public String toString() 
	{
		return "Contact [vorname=" + vorname + ", nachname=" + nachname + ", foto=" + foto + ", eMail=" + eMail
				+ ", teleNr=" + teleNr + "]";
	}

	
}
