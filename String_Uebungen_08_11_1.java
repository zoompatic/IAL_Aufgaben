package advance;
/*Wandeln Sie den String "Dieses Java Programm funktioniert" 
 * in ein char Array um. Geben Sie über eine for-Schleife die 
 * Anzahl des Chars 'a' aus.
 */

public class String_Uebungen_08_11_1 {

	public static void main(String[] args) {
		String satz = "Dieses Java Programm funktioniert";
		
		//String in Array umwandeln
		char[] satzArray = satz.toCharArray(); 
		
		// Ausgabe der Länge vom Array (Kontrolle)
			System.out.println("Anzahl der Zeichen im Array " + satzArray.length);
		
		// hier sollen die 'a' aus der for-Schleife gezählt werden (summiert)
		char zaehler = '0'; //man könnte auch int zaehler = 0 benutzen
		
		//Schleife um jedes Zeichen mit 'a' zu vergleichen und in den zaehler zu schicken
		for(int i=0; i<satzArray.length; i++) { 
			if (satzArray[i] == 'a') {
				zaehler++;
			}
		}
		// Ausgabe des zaehlers als Zahl. 	
		System.out.println("Anzah des Chars 'a' ist " + zaehler);
	}

}
