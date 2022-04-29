package ShowContactsView;
/**
 * Grundlagen der Programmierung 2
 * Einsendeaufgabe 6 - Kontaktliste mit JavaFX
 * 
 * Die Klasse ShowContacts stellt die grafische Oberflaeche zur verfuegung. 
 * Ihr werden drei Dummy-Kontakte aus der Klasse DummyContacts zur verfuegung gestellt.
 * Diese werden anschliessen angezeigt.
 * 
 * @author Felix Hansmann
 * @version 16
 */	
import java.util.ArrayList;

import ShowContactsModel.Contact;
import ShowContactsModel.DummyContacts;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class ShowContacts extends Application 
{
	/**
	 * Die main-Methode startet die Anwendung mit Hilfe der Methode "launch();"
	 * @param args
	 */
	public static void main(String[] args)
	{			
		launch();
	}
	@Override
	/**
	 * Die start-Methode erzeugt das Anwendungsfenster.
	 * @param Stage primaryStage
	 */
	public void start(Stage primaryStage)
	{
		try 
		{
			//VBox wird initialisiert
			VBox parent = new VBox();
			
			//Schriftgroesse fuer die Headline
			double MAX_FONT_SIZE = 22.0;
			
			//Abstaende vom Inhalt zu den jeweiligen Seiten des Fensters
			parent.setPadding(new Insets(25,25,25,100));
			
			//Headline wird erstellt
			Label headline = new Label("Kontaktliste\n");
			parent.getChildren().add(headline);
			headline.setFont(new Font(MAX_FONT_SIZE));
			
			//Kontakte werden mit Hilfe des contactManager erzeugt
			contactManager(parent);
			
			
			Scene scene = new Scene(parent);
			primaryStage.setScene(scene);
			primaryStage.show();
			
		}catch(Exception e)
		{
            e.printStackTrace();
        }		
	}
	/**
	 * Die Methode "contactManager" liest die Kontakte von DummyContacts, mit Hilfe einer for-Schleife, aus.
	 * @param VBox parent
	 */
	public void contactManager(VBox parent) 
	{
		ArrayList<Contact> contacts = DummyContacts.getContacts();
		
		//wird abhaengig der ArrayList-Groesse ausgefuerht
		for(int i = 0; i < contacts.size(); i++) 
		{
			//ArrayList wird ausgesplittet und die jeweiligen Indexe der String-Variable zugeordnet
			String vorname = contacts.get(i).getVorname();
			String nachname = contacts.get(i).getNachname();	
			String foto = contacts.get(i).getFoto();	
			String eMail = contacts.get(i).geteMail();	
			ArrayList<String> teleNr = contacts.get(i).getTeleNr();
			
			String teleNrString = teleNr.toString();
			
			//Werte aus der ArrayList-Contacts werden in die Scene geschrieben
			ImageView imageview = new ImageView(foto);
	        parent.getChildren().add(imageview);
			Label labelVorname = new Label("Vorname:" + " " + vorname);
			parent.getChildren().add(labelVorname);
			Label labelNachname = new Label("Nachname:" + " " + nachname);
			parent.getChildren().add(labelNachname);	
	        Label labelEMail = new Label("E-Mail:" + " " + eMail);
			parent.getChildren().add(labelEMail);
			Label labelTeleNr = new Label("Telefonnummern:" + " " + teleNrString);
			parent.getChildren().add(labelTeleNr);
			Label labelSpace = new Label("");
			parent.getChildren().add(labelSpace);
		}
				
	}
}
