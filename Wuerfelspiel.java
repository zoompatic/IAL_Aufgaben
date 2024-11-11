package advance;
import java.util.Random;

public class Wuerfelspiel {
	Random random =new Random();

	public static void main(String[] args) {


		Wuerfelspiel spiel = new Wuerfelspiel();
		spiel.spielen();


	}

	public void spielen () {
		int spieler1 = 0;
		int spieler2 = 0;

		for (int i = 0; i < 3; i++) {

			spieler1 += random.nextInt(6)+1;
			spieler2 += random.nextInt(6)+1;
		}
		System.out.println("Spieler 1 hat " + spieler1 + " Punkte.");
		System.out.println("Spieler 2 hat " + spieler2 + " Punkte.");

		if (spieler1 < spieler2) {
			System.out.println("Spieler 2 gewinnt!");
		}else if(spieler1 > spieler2) {
			System.out.println("Spieler 1 gewinnt!");
		}else {
			System.out.println("Unentschieden!");
		}



	}


}
