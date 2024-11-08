package advance;
/*Str = "Dies ist ein Beispiel"

Geben Sie alle Worte innerhalb des Strings mit einer geraden 
Anzahl an Zeichen aus.
(Hinweis "\s" ist ein Leerzeichen)
Output: Dies, Beispiel, (nur die Wörter mit einer geraden Anzahl an Zeichen)
 * 
 */

public class String_Uebungen_08_11_2 {

	public static void main(String[] args) {
		// String erstellen
		String satz = "Dies ist ein Beispiel";
		// String in Char-Array umwandeln
		char[] satzArray = satz.toCharArray();
		
		char c = satz.charAt("\s"); 		
		System.out.print(c);
	}
			
}


