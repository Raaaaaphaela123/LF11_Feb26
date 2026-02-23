package _01_Woche._01_Tag;

public class _02_Arithmetische_Operatoren {
    public static void main(String[] args) {
        // Beispiel: Preise von Produkten im Warenkorb
        double preis1 = 100.0;
        double preis2 = 70.0;

        // Grundlegende Berechnungen
        System.out.println("Addition: " + (preis1 + preis2));
        System.out.println("Subtraktion: " + (preis1 - preis2));
        System.out.println("Multiplikation: " + (preis1 * preis2));
        System.out.println("Division: " + (preis1 / preis2));
        System.out.println("Modulo: " + (preis1 % preis2)); // Restwertdivision

        // Kombinierte Operatoren: Gesamtpreis für mehrere Produkte
        double wert = (preis1 + preis2) * 0.19;
        System.out.println(wert);

        // verkürzte Schreibweise
        wert = wert + 333;

        wert += 333;

        int wert2 = 3;
        wert2 += wert2;

        System.out.println("Wert 2: " + wert2);

        wert *= 5;
        wert = wert * 5;



    }
}
