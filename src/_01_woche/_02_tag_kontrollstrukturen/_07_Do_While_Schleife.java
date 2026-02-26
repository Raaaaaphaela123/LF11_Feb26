package _01_woche._02_tag_kontrollstrukturen;

public class _07_Do_While_Schleife {
    public static void main(String[] args) {

        // Erklärung:
        // Eine do-while-Schleife führt den Codeblock **mindestens einmal** aus,
        // bevor die Bedingung überprüft wird → fußgesteuerte Schleife.
        // Syntax:
        // do {
        //     // Anweisungen
        // } while (Bedingung);

        int counter = 0;
        do {
            System.out.println("Counter: " + counter++);
        } while (counter < 5);

        // Beispiel: Bestellbestätigung versenden
        int bestellungen = 1;
        int maxBestellungen = 5;

        System.out.println("Versenden von Bestellbestätigungen (do-while):");

        do {
            System.out.println("Bestellbestätigung Nr. " + bestellungen + " wurde versendet.");
            bestellungen++; // Zähler erhöhen
        } while (bestellungen <= maxBestellungen);


        // Hinweis:
        // - Im Gegensatz zur while-Schleife wird der Codeblock mindestens einmal ausgeführt
        // - Besonders nützlich, wenn mindestens ein Durchlauf garantiert sein soll
        // - Gut für Aktionen wie: "Prüfe alle Bestellungen, auch wenn Liste leer sein könnte"
    }
}
