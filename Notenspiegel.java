package advance;

import java.util.Random;

public class Notenspiegel {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] noten = new int[25];
 
		for (int i = 0; i < 25; i++) {
		    noten[i] = rand.nextInt(6)+1;
		}	
 
		for (int element : noten) {
			System.out.print(noten[element] + " ");
		}
		System.out.print("\n\n");
		
 		// QUELLE FÜR MEINE LÖSUNGEN IST CHATGPT!!!
		
		// Geben Sie die Anzahl jeder Note aus
		int[] notenAnzahl = new int[6];
		for (int note:noten) {
			notenAnzahl[note-1]++;
		}
		for (int i = 0; i < notenAnzahl.length; i++) {
			System.out.println("Note " + (i+1)+ ":" + notenAnzahl[i] + "mal");			
		}
		
	
		// Geben Sie den Notenschnitt aus
		int summe = 0;
		for (int note:noten) {
			summe+=note;
		}
		double durchschnitt = (double) summe / noten.length;
				System.out.printf("\nNotenschnitt: %.2f\n", durchschnitt);
		}	
}
