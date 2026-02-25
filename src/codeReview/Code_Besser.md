```java

import java.util.Scanner;

/**
 * Ein sauber strukturierter Rechner mit Fehlerbehandlung.
 */
public class Rechner { // PascalCase für Klassen
    
    private int basisWert = 10; // Private (Kapselung) & sprechender Name

    public void berechneQuotient() { // camelCase & aussagekräftiges Verb
        // try-with-resources schließt den Scanner automatisch
        try (Scanner scanner = new Scanner(System.in)) { 
            System.out.print("Bitte Teiler eingeben: ");
            
            if (scanner.hasNextInt()) {
                int teiler = scanner.nextInt();

                // Validierung gegen Division durch Null
                if (teiler != 0) {
                    int ergebnis = basisWert / teiler;
                    System.out.println("Ergebnis: " + ergebnis);
                } else {
                    System.err.println("Fehler: Division durch Null ist nicht erlaubt.");
                }
            } else {
                System.err.println("Fehler: Bitte geben Sie eine Ganzzahl ein.");
            }
        } 
    }
}

```