import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EinsendeaufgabeEins
{
  
  FileWriter writer;
  File file;
  
  public static void main(String[] args) 
  {
        
		EinsendeaufgabeEins fileWriterExample = new EinsendeaufgabeEins();
        fileWriterExample.schreiben();
	
	    String name = "Vor- und Nachname: Felix Hansmann";
		String adresse = "Adresse: Ritterstrasse 27, 22089 Hamburg";
		String tele = "Telefonnummer: 0151/70536908";
		String email = "E-Mail: felix-hh1887@hottmail.de";
		String userID = "User-ID: hansmfelix";
		String time = "Zeitfenster: 10-20 Uhr";
	
	
		String ausgabe = name + "\n" + adresse + "\n" + tele + "\n" + email + "\n" +
	    userID + "\n" + time;
			
		System.out.println(ausgabe);
  }
  
    public void schreiben()
	{
    
    file = new File("AusgabeEinsA.html");
    
	    try 
	    {
            writer = new FileWriter(file ,true);
       
            writer.write("<span style=\"color:#00FFFF; background-color:#FF0000;\">Name: Felix Hansmann</span><br>" + 
		    "<span style=\"color:#FF00FF; background-color:#00FF00;\">Adresse: Ritterstrasse 27</span><br>" +
		    "<span style=\"color:#FFFF00; background-color:#0000FF;\">Ort und PLZ: Hamburg, 22089</span><br>" +
		    "<span style=\"color:#FF0000; background-color:#00FFFF;\">Telefonnummer: 0151/70536908</span><br>" +
		    "<span style=\"color:#00FF00; background-color:#FF00FF;\">E-Mail: felix-hh1887@hotmail.de</span><br>" +
		    "<span style=\"color:#0000FF; background-color:#FFFF00;\">Zeitfenster: 10-20 Uhr</span>");

            writer.write(System.getProperty("line.separator"));
            writer.flush();
      
            writer.close();
	   
        }catch (IOException e) 
	    {
            e.printStackTrace();
     }
  }
 
}