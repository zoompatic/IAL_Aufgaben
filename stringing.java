package advance;

public class stringing {

	public static void main(String[] args) {

		//Aufgabe : Ausgeben der Anzahl der Zeichen 'e'


		//erstellen eines "String" mit gewünschter Zeichenfolge
		String kontraBass = 	"Drei Chinesen mit dem Kontrabass "  

					+ "saßen auf der Straße und erzählten sich was."

					+ "Da kam die Polizei, fragt: Was ist denn das? "

					+ "Drei Chinesen mit dem Kontrabass ";

		char suche = 'e'; //das gesuchte zeichen initialisieren und deklarieren
		char suche1 = 'c';
		int zaehler = 0; // der Zähler für die Anzahl des gesuchten Zeichens 

		//itterrieren des Stings
		for (int x = 0; x < kontraBass.length(); x++) {

			//während itterration suche nach Zeichen und inkrement von Zähler
			if(kontraBass.charAt(x) == suche || kontraBass.charAt(x) == suche1){
				zaehler++;

			}

		}
		System.out.println("Die gesuchten Zeichen kommen " + zaehler + " mal vor." );


		String fluss = "MISSISSIPPI";
		//String low = fluß.toLowerCase();

		System.out.println(fluss.toLowerCase());

		String world = "Hello World!";

		if (world == "Hello World!") {
			System.out.println("!dlroW olleH");
		}
	
		




	}

}
