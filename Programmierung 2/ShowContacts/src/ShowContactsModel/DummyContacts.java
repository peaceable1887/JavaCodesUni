package ShowContactsModel;
/**
 * Grundlagen der Programmierung 2
 * Einsendeaufgabe 6 - Kontaktliste mit JavaFX
 * 
 * Die Klasse DummyContact erzeugt drei BeispielKontakte f�r die Klasse ShowContacts.
 * 
 * @author Felix Hansmann
 * @version 16
 */	
import java.util.ArrayList;

public class DummyContacts {
	
	/**
	 * Beispielkontakte werden in die ArrayList conacts eingetragen und dann zurueckgeliefert.
	 * @return contacts
	 */
	public static ArrayList<Contact> getContacts()
	{
		ArrayList<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Peter","Griffin", "/ShowContactsResources/Peter_Griffin.jpg", "pgriffin@familyguy.de", "040/867908","0151/34675809","0170/76543210"));
		contacts.add(new Contact("Stan","Smith", "/ShowContactsResources/stan_smith.jpg", "ssmith@americandad.de", "040/825567","0157/89065423"));
		contacts.add(new Contact("Roger","Smith", "/ShowContactsResources/roger.png", "rsmith@americandad.de", "0160/78609812"));
		
		return contacts;
		
	}

}
