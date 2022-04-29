/**
 * TestBacken testet die Funktionstuechtigkeit der Weihnachtsbackstube und der Gebaeckarten.
 * @author LH
 *
 */
public class TestBacken {

  public static void main(String[] argss) {
  
    Backstube testBacken = new Backstube();
	
    
    testBacken.backeGebaeck(new Berliner("Omi's Berliner", 399));
    testBacken.backeGebaeck(new Plaetzchen("Kokosmakronen", 10, 50)); //Name, Anzahl, Preis
    testBacken.backeGebaeck(new Fuellung("Marzipanberliner", 399, "Marzipan", 100));
    testBacken.backeGebaeck(new Apfelkuchen("Opi´s Apfelkuchen", 1000, 999));
    
    System.out.println("Anzahl hergestellte Gebaeckarten: " + testBacken.gesamtGebaeckArtAnzahl());
    System.out.println("Gesamtkosten in Cent vor Rabatt: " + testBacken.gesamtKosten());
    System.out.println("Gesamtrabatt in Cent: " + testBacken.gesamtRabatt());
    System.out.println("Endpreis in Cent (Gesamtkosten mit Rabatt): " + (testBacken.gesamtKosten() - testBacken.gesamtRabatt()) + "\n");
    System.out.println(testBacken);
    
    testBacken.leereOfen();
    
    testBacken.backeGebaeck(new Plaetzchen("Vanillekipferl", 14, 60));
    testBacken.backeGebaeck(new Fuellung("Bratapfelstollen", 399, "Bratapfelgelee", 120));
    testBacken.backeGebaeck(new Berliner("Klassischer Stollen", 399));
    testBacken.backeGebaeck(new Apfelkuchen("Das Haus vom Nikolaus", 1000, 899));
    testBacken.backeGebaeck(new Berliner("Dresdner Christstollen", 499));
    testBacken.backeGebaeck(new Berliner("Einfacher Stollen", 299));
    
    System.out.println("Anzahl hergestellte Gebaeckarten: " + testBacken.gesamtGebaeckArtAnzahl());
    System.out.println("Gesamtkosten in Cent vor Rabatt: " + testBacken.gesamtKosten());
    System.out.println("Gesamtrabatt in Cent: " + testBacken.gesamtRabatt());
    System.out.println("Endpreis in Cent (Gesamtkosten mit Rabatt): " + (testBacken.gesamtKosten()-testBacken.gesamtRabatt()) + "\n");
    System.out.println(testBacken);
  }
}