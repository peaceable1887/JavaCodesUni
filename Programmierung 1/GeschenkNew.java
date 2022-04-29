/**
 *Dieses Programm "Geschenk", kann mit Hilfe von Kommandozeilenarguemten 
 *eine personalisierte Geschenkkarte erstellt werden.
 * 
 *@author Felix Hansmann
 *
 *@version 9 (Build 9 + 181)
 */

import java.lang.String;

public class GeschenkNew
{ 
  public static void main(String[] args)
  {
  
    int hoehe = 0;
    int breite = 0;
  
    try{                                                                   //gewährleistet, dass alle Parameter eingegeben werden
    hoehe = Integer.parseInt(args[0]);
    breite = Integer.parseInt(args[1]);
    
    
    String geschenkSchleife = args[2]; //charAt(0);
    String geschenkSchmuck = args[3]; //charAt(1);
    String grussBotschaft = args[4];
    String symbol = args[5];
    String leerzeichen = " ";
    String karte = "";
    
    boolean durchgang =true;
    int j=0;  
    int stringLaenge = grussBotschaft.length();
    int k=0;
    int i=0;
        
    if(hoehe<=0 || breite <= 0)
    {                                                               //Test, dass Zahl größer als 0 ist
      System.out.println("Bitte für Breite und Höhe Zahlen größer Null eingeben");
      System.exit(0);
    }  
    
  
    while (durchgang) 
    {                                                       //Schleife wird einmal abgearbeitet  
    while (j<7*breite) 
    {                                                   //genereiert den oberen Rand der Karte
      karte+=symbol;
      j++;
    }                           // end of while
  
    j=0;
    karte+="\n";
  
    while (j<7*breite)
    {                                                       //generiert den Zwischenraum zur oberen Kante
      if(j==0 || j==7*breite-1) 
      {
        karte+=symbol;
        j++;
  
    }else
    {
      karte+=leerzeichen;
      j++;
    }   
    }                                                       // end of while
      karte+="\n";
      karte = Geschenk(hoehe, breite, geschenkSchleife, geschenkSchmuck, grussBotschaft, symbol, karte);    //fügt das Geschenk ein
      j=0;
      
    while (j<7*breite) 
    {                                                       //generiert den Abstand zum unteren Rand
      if(j==0 || j==7*breite-1) 
      {
        karte+=symbol;
        j++;
      }else
      {
        karte+=leerzeichen;
        j++;
      } 
    }  
        
    j=0;
    karte+="\n"; 
  
    while (j<7*breite) 
    {                                                     //Erzeugt den unteren Rand
      karte+=symbol;
      j++;
        
    }                                                    // end of while

    System.out.println(karte);
    durchgang=false;
      
    
    }
  }catch(Exception e)
  {
    System.out.println("Geben Sie min. 6 Argumente ein.\nBeispiel: 5 5 <> X Hallo Welt #/n" + 
	"Wichtig: Die Geschenkschleife und Grussbotschaft bitte in Anfuehrungszeichen schreiben.");
  }
  
    

} 

/**
*Die Methode "Geschenk", baut die Karte mithilfe von Schleifen und If/else-Verzweigungen zusammen
*und gibt sie zurück.
*
*@param int hoehe - Höhe der Geschenkkarte
*@param int breite -  Breite der Geschenkkarte
*@param String Schleife 
*@param String schmuck
*@param String botschaft
*@param String botschaft
*@param String symbol
*@param String karte
*
*@return karte
*/

  public static String Geschenk(int hoehe, int breite, String schleife, String schmuck, String botschaft, String symbol, String karte)
  {
    
    String leerzeichen1 = " ";
    int i=0;
    int j=0;
    int m=0;
    int k=0;
    int z=0;
    int w=1;
    int n=0;
    int wortzaehler=0;
    int[] wortgrenze = new int [100];
    int stringLaenge = botschaft.length();
    char zeichen;
    while (k<stringLaenge-1) { 
      zeichen = botschaft.charAt(k);
       if(zeichen=='_'){
        botschaft= botschaft.replace('_',' ');
        k+=stringLaenge;
        } else{
        k++;  
        }
    } // end of while
     
    
    k=0;
    while (k<stringLaenge-1) {                                                                                           //Zählt die Leerzeichen in der Botschaft
      zeichen = botschaft.charAt(k);
            
        if(zeichen == ' ')
        {
          wortgrenze[m]=k;                     //Merkt sich die Stellen im String, wo ein Wort beginnt und ein anderes aufhört
          wortzaehler++;
          m++;
          k++; 
        }else
        {
          k++;  
        }
    }                                                                                                           
                
    wortzaehler+=1;
    
    
    String[] woerter= new String[wortzaehler];
    
    while (w < wortzaehler+1) 
    {                                                   //Teilwörter werden gesucht und in Array gespeichert
      if(w==1)
      {
        woerter[w-1] = botschaft.substring(0,wortgrenze[w-1]);
        w++;
                            
      }else{
      if(w<wortzaehler){
          
        woerter[w-1]=botschaft.substring(wortgrenze[w-2],wortgrenze[w-1]);        //Durchgang für die Wörter, bis zum Schluss
        w++;
        }else
        {
          woerter[w-1]=botschaft.substring(wortgrenze[w-2],botschaft.length());   //Durchgang für das letzte Teilwort
          w++;
        }
        }
    }  
    
   
                

    while(i <hoehe)
    {
      karte += symbol;
      if(i==0)
      {
        while (j<= 7* breite-4)
        {                                                                             //Erzeugt den Deckel des Geschenks
          if(i == 0 && j< breite/2)
          {
            karte += "_";
            j++;
          }else
          {
            if(i==0 && j==breite/2)
            {
              karte += schleife;
              j++;
            }else
            { 
              if(i==0 && j>breite/2 && j<breite)
              {
                karte += "_";
                j++;
              }else
              {
                karte+=leerzeichen1;
                j++;
              }
            }
          }
        }
    }else
    {
      if(i==hoehe-1)
      {
        while (j<7*breite-2) //Erzeugt den Geschenkrumpf und den Boden 
          {                                                                    
            
            if(j==0 || j==breite)
            {
              karte+="|";
              j++;
            }else
            {
              if(j<breite  )
              {
                karte+="_"; 
                j++;
              }else
              {
                karte+=leerzeichen1;
                j++;
                
              }
            }
          } 
      }else
      {
        while(j<7*breite-2) //Erzeugt die Geschenkwände
        {           
          int y=0;
          
          if(j==0 || j== breite)
          {
            karte+="|";
            j++;
          }else
          {
            if(j<breite)
            {
              if(j%3==0) //Schmuck immer an einer Stelle die durch drei teilbar ist
              {                             
                karte+=schmuck;
                j++;                                      
              }else
              {
                karte += leerzeichen1;
                j++;
              }
              }else
              {
                
                if(i>=(hoehe/2)-1  &i<(hoehe/2)+((wortzaehler)/2)-1   & j==(5*breite)/2 )//Text wird eingefügt
                { 
                  
                karte+= woerter[n]+woerter[n+1];
                  j+= woerter[n].length()+woerter[n+1].length();
                  
                  n+=2;
                }else
                {
                  karte+=leerzeichen1; 
                  j++;
                  
                }
              }      
          }
        } 
           }
    }
       
    karte += symbol;                                                //Das Endsymbol jeder Zeile
    i++;                                                            //Rutscht in der Zeile nach unten
    karte += "\n";                                                  //Zeilenumbruch jeder Zeile
    j=0;                                                            //Setzt den Zeiger wieder auf ganz links
  }  
  return karte;
  }
  
}
    