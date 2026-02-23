package _01_Woche._01_Tag;

public class _04_Vergleichs_Operatoren {

    public static void main(String[] args) {
        // Preise von Produkten im Warenkorb
        double preisProdukt1 = 50.0;
        double preisProdukt2 = 30.0;
        double maxBestellwert = 50.0;

        System.out.println("preisProdukt1 = " + preisProdukt1 + " €, preisProdukt2 = " + preisProdukt2 + " €, maxBestellwert = " + maxBestellwert);
        System.out.println();

        // Gleichheit (==): Prüfen, ob Preis dem maximalen Bestellwert entspricht
        System.out.println("preisProdukt1 == maxBestellwert: " + (preisProdukt1 == maxBestellwert)); // true

        // Ungleichheit (!=): Prüfen, ob Preise unterschiedlich sind
        System.out.println("preisProdukt1 != preisProdukt2: " + (preisProdukt1 != preisProdukt2)); // true

        // Kleiner als (<): Prüfen, ob Produkt2 günstiger ist als Produkt1
        System.out.println("preisProdukt2 < preisProdukt1: " + (preisProdukt2 < preisProdukt1)); // true

        // Größer als (>): Prüfen, ob Produkt1 teurer ist als Produkt2
        System.out.println("preisProdukt1 > preisProdukt2: " + (preisProdukt1 > preisProdukt2)); // true

        // Kleiner gleich (<=): Prüfen, ob Produkt1 maximal den Bestellwert erreicht
        System.out.println("preisProdukt1 <= maxBestellwert: " + (preisProdukt1 <= maxBestellwert)); // true

        // Größer gleich (>=): Prüfen, ob Produkt2 mindestens den maximalen Bestellwert erreicht
        System.out.println("preisProdukt2 >= maxBestellwert: " + (preisProdukt2 >= maxBestellwert)); // false
    }
}
