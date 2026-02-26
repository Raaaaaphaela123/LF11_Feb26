package _01_woche._02_tag_kontrollstrukturen;

public class _02_Switch_case {
    void main(String[] args) {
        // 1. Beispiel: Produktkategorie ausgeben auf Basis einer Zahl
        int produktKategorie = 5;

        switch (produktKategorie) {
            case 1:
                IO.println("Kategorie Bücher");
                break;
            case 2:
                IO.println("Kategorie DVDs");
                break;
            case 3:
                IO.println("Kategorie Zeitschriften");
                break;
            default:
                IO.println("Ungültige Kategorienummer");

        }

        // 2. Beispiel: Reaktion auf Kundenbefehl
        String kundenBefehl = "hilfe";

        switch (kundenBefehl) {
            case "info":
                IO.println("Kunde will Info.");
                break;
            case "hilfe":
                IO.println("Kunde will Hilfe.");
                break;
            default:
                IO.println("Ungültige Eingabe.");
        }


        IO.println("----- Break vergessen-----");
        // 3. Beispiel: Fall-Through (break vergessen)
        int produktKategorie2 = 2;

        switch (produktKategorie2) {
            case 1:
                IO.println("Kategorie Bücher");
                break;
            case 2:
                IO.println("Kategorie DVDs");
            case 3:
                IO.println("Kategorie Zeitschriften");
                break;
            default:
                IO.println("Ungültige Kategorienummer");

        }
        // Ausgabe zeigt Fall-Through: Nach case 2 wird auch case 3 ausgeführt.

        // 4. Beispiel: Gruppierung von Cases
        int monat = 10;

        switch (monat) {
            case 12, 1, 2:
                IO.println("Hier ist Winterversand");
                break;
            case 3, 4, 5:
                IO.println("Frühlingsversand");
                break;
            case 6, 7, 8:
                IO.println("Sommerversand");
                break;
            case 9, 10, 11:
                IO.println("Herbstversand");
                break;
            default:
                IO.println("Falsche Eingabe, nutze einen gültigen Monat.");
        }




        /* Enhanced Switch (ab Java 17)                                   */


        // Klassischer Switch
        String tag = "Monday";
        int tagNummer;

        switch (tag) {
            case "Monday":
                tagNummer = 1;
                break;
            case "Tuesday":
                tagNummer = 2;
                break;
            case "Wednesday":
                tagNummer = 3;
                break;
            default:
                tagNummer = 0;
        }
        IO.println("TagNummer: " + tagNummer);


//        // Enhanced Switch
        int neueTagNummer = switch (tag) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            default -> 0;
        };

        IO.println("neuerTag: " + neueTagNummer);

        /*
         * Erklärung:
         * - Klassischer Switch: Man braucht 'break', sonst Fall-Through.
         * - Enhanced Switch: Kein break nötig, jeder Fall ist ein eigener Ausdruck.
         * - Vorteil: kürzer, übersichtlicher, verhindert unbeabsichtigtes Durchlaufen weiterer Fälle.
         */
    }
}
