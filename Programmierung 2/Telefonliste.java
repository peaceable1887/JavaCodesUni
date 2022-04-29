package test;

import java.util.*;
/*
 * @author Felix, Sven und Ethan
 * @version Java 16
 * 
 * Die Klasse "Telefonliste" verwaltet Objekte der Klasse "TelefonEintrag". Diese koennen mit Hilfe der der "Telefonliste" hinzugefuegt werden,
 * geaendert werden und geloescht werden. Zusaetzlich koennen Eintraege nach Name und Nummer gesucht werden.
 */
public class Telefonliste {

	//Deklaration der ArrayList mit dem TelefonEintrag
	private ArrayList<TelefonEintrag> liste;
	
	//Konstruktor 
	public Telefonliste() 
	{
		this.liste = new ArrayList<TelefonEintrag>();
	}
	
	/**
	 * Mit Hilfe von "addEntry" koennen Objekte eines Telefoneintrages hinzugefuegt werden.
	 * @param name
	 * @param number
	 */
	public void addEntry(String name, String number) 
	{
		liste.add(new TelefonEintrag(name, number));
	}
	
	/**
	 * Mit Hilfe von "modifyEntry" kann Name und Nummer eines Telefoneintrages geaendert werden.
	 * @param name
	 * @param number
	 * @param modName
	 * @param modNumber
	 * @return true/false
	 */
	public boolean modifyEntry(String name, String number, String modName, String modNumber) 
	{
		TelefonEintrag entry = new TelefonEintrag(name, number);
		
		if(liste.contains(entry)) 
		{
			liste.set(liste.indexOf(entry), new TelefonEintrag(modName, modNumber));
			return true;
		}
		else 
		{
			return false;
		}
	}
	/**
	 * Entfernt einen Telefoneintrag von der Liste wenn der Name und die Nummer mit dem Eintrag uebereinstimmen.
	 * @param name
	 * @param number
	 */
	public void removeEntry(String name, String number) 
	{
		TelefonEintrag entry = new TelefonEintrag(name, number);
		
		if(liste.contains(entry)) 
		{
			liste.remove(entry);
		}
	}
	/**
	 * Sucht mit Hilfe des Namens einen Telefoneintrag in der Liste.
	 * @param name
	 * @return resultName
	 */
	public String searchByName(String name) 
	{
		String resultName = "";
		
		for(TelefonEintrag teleEintrag : liste) 
		{
			if(teleEintrag.getName().equals(name)) 
			{
				resultName = teleEintrag.toString();
			}
		}
		
		return resultName;
	}
	/**
	 * Sucht einen Telefoneintrag in der Liste mit Hilfe der Nummer.
	 * @param number
	 * @return resultNumber
	 */
	public String searchNameByNumber(String number) 
	{
		String resultNumber = "";
		
		for(TelefonEintrag teleEintrag : liste) 
		{
			if(teleEintrag.getNumber().equals(number)) 
			{
				resultNumber = teleEintrag.toString();
			}
		}
		
		return resultNumber;
	}
	/**
	 * Gibt die groesse der Liste zurueck
	 * @return liste.size();
	 */
	public int size() 
	{
		return liste.size();
	}
	/**
	 * Loescht alle Eintraege von der Liste
	 */
	public void clear() 
	{
		liste.clear();
	}
}
