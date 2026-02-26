package _01_woche._02_tag_kontrollstrukturen.aufgaben.schleifen;
import java.util.Scanner;

public class _02_Computerausstattung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programm: Computerausstattung bestimmen");

        // Eingabe des Berufs
        System.out.print("Sind Sie Programmierer? (ja/nein): ");
        String antwort = scanner.nextLine();

        boolean istProgrammierer = false;

        if (antwort.equalsIgnoreCase("ja")) {
            istProgrammierer = true;
        }

        // Eingabe der Betriebszugehörigkeit
        System.out.print("Wie viele Jahre sind Sie im Betrieb? ");
        int jahre = scanner.nextInt();

        // Entscheidung treffen
        String rechner;

        if (jahre < 3 && istProgrammierer) {
            rechner = "486er PC";
        } else if (jahre < 3 && !istProgrammierer) {
            rechner = "386er PC";
        } else if (jahre >= 3 && istProgrammierer) {
            rechner = "Pentium-Rechner";
        } else {
            rechner = "MAC";
        }

        // Ausgabe
        System.out.println();
        System.out.println("Ergebnis:");
        System.out.println("Sie erhalten einen " + rechner + ".");

        scanner.close();
    }
}
