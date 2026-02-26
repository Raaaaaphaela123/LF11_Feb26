package _01_woche._02_tag_kontrollstrukturen;

public class _04_For_Schleife {
    public static void main(String[] args) {

        // Was ist eine for-Schleife?
        // Sie wiederholt Anweisungen, solange eine Bedingung erfüllt ist.
        // Klassische for-Schleife: Startwert, Bedingung, Schrittweite

//        for (int i = 1; i < 10; i++) {
//            IO.println(i);
//        }


        // Vergleich zur For-Schleife in Python
//        for i in range(5):
//        print(i)

        // gleiche Schleife in Java
        for (int i = 0; i < 5; i++ ) {
            IO.println(i);
        }


        // Beispiel 1: Ausgabe der Produkte im Warenkorb
        String[] warenkorb = {"Laptop", "Buch", "Kamera", "T-Shirt", "Kaffeemaschine"};

        System.out.println("Produkte im Warenkorb (klassische for-Schleife):");

        for (int i = 0; i < warenkorb.length; i++) {
            IO.println("Ware: " + warenkorb[i]);
        }

        // Verschachtelte For-Schleifen
        // Äußere for-Schleife:
        // Diese Schleife bestimmt die Zeilen (z. B. 1 bis 3)
        for (int i = 0; i < 3; i++) {
            IO.println(i + " außen");
            // Innere Schleife
            // Diese Schleife läuft für jede Zeile erneut durch
            for (int j = 0; j < 4; j++) {
                IO.println(j + " innen");
            }
        }

        // anderes Beispiel
        for (int zeile = 0; zeile < 4; zeile++) {
            for (int spalten = 0; spalten <= 5; spalten++) {
                IO.print(spalten + " ");
            }
            IO.println();
        }


        // Enhanced For-Loop (For-Each)
        System.out.println("\nProdukte im Warenkorb (Enhanced For-Loop):");
        String[] warenkorb2 = {"Laptop", "Buch", "Kamera", "T-Shirt", "Kaffeemaschine"};

        for (String ware : warenkorb2) {
            IO.println(ware);
        }

        // Vorteil: Kein Index nötig, kürzerer und übersichtlicherer Code
    }
}
