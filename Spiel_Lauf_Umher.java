package holyshit;


import java.util.Scanner;

public class Spiel_Lauf_Umher {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0; // x-Achse (Osten/Westen)
        int y = 0; // y-Achse (Norden/Süden)

        while (true) { // Endlose Schleife für fortlaufende Eingabe
            // Eingabe der Bewegungsrichtung
            System.out.print("In welche Richtung soll der Spieler laufen? (z.B. N, S, O, W) ");
            String bewegung = scanner.nextLine();

            // Durchlaufen jedes Char im Bewegungsstring
            for (char richtung : bewegung.toCharArray()) {
                switch (richtung) {
                    case 'N': y++; break; // Norden -> y erhöhen
                    case 'S': y--; break; // Süden -> y verringern
                    case 'O': x++; break; // Osten -> x erhöhen
                    case 'W': x--; break; // Westen -> x verringern
                    case 'n': y++; break; // Norden -> y erhöhen
                    case 's': y--; break; // Süden -> y verringern
                    case 'o': x++; break; // Osten -> x erhöhen
                    case 'w': x--; break; // Westen -> x verringern
                    
                    default: System.out.println("Ungültige Richtung: " + richtung);
                }
            }

            // Überprüfen, ob der Spieler am Startpunkt ist
            if (x == 0 && y == 0) {
                System.out.println("Der Spieler ist zurück am Startpunkt!");
                break; // Schleife beenden, wenn der Spieler zum Startpunkt zurückkehrt
            } else {
                System.out.println("Der Spieler ist nicht am Startpunkt. Versuchen Sie es erneut.");
            }
        }
        
        scanner.close();
    }
}
