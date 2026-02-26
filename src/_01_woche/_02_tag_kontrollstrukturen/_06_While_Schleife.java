package _01_woche._02_tag_kontrollstrukturen;

public class _06_While_Schleife {
    static void main(String[] args) {

        // Was ist eine while-Schleife?
        // → Wiederholt den Codeblock, solange die Bedingung true ist.
        // → Kopfgesteuerte Schleife: Bedingung wird vor jedem Durchlauf geprüft

        // Beispiel 1: Leben prüfen
        int leben = 10;

        while (leben > 0) {
            // mach was
            IO.println("Spieler hat noch " + leben + " Leben.");
            leben--; // Zähler verringern
        }
        IO.println("Keine Leben mehr...");


        // Beispiel 2: Rabattaktionen prüfen
        double[] einkaufsWerte = {20.0, 50.0, 120.0, 80.0};
        int i = 0;

        while (i < einkaufsWerte.length) {
            IO.println("Einkaufswert: " + einkaufsWerte[i]);
            i++; // Zähler erhöhen
        }


        // Hinweis:
        // - Bedingung wird **vor jedem Durchlauf geprüft**
        // - Ohne Erhöhung des Zählers würde die Schleife **unendlich laufen**
        // - Ideal, wenn die Anzahl der Durchläufe **nicht vorher bekannt** ist
    }

    public static void meineMethode() {
        System.out.println("Hallo");
    }
}
