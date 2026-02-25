package _01_Woche._03_Tag.loesungen._01_Arrays;

public class TemperaturenDerWoche {
    public static void main(String[] args) {
        // Schritt 1: Array mit Temperaturen der Woche
        int[] temperaturen = { 12, 15, 14, 18, 20, 17, 13 };

        // Schritt 2: Alle Temperaturen ausgeben
        System.out.println("Temperaturen der Woche:");
        for (int i = 0; i < temperaturen.length; i++) {
            System.out.println("Tag " + (i + 1) + ": " + temperaturen[i] + "°C");
        }

        // Schritt 3: Durchschnitt berechnen
        int summe = 0;
        for (int temperatur : temperaturen) {
            summe += temperatur;
        }
        double durchschnitt = (double) summe / temperaturen.length;

        // Schritt 4: Höchste und niedrigste Temperatur ermitteln
        int max = temperaturen[0];
        int min = temperaturen[0];

        for (int temperatur : temperaturen) {
            if (temperatur > max) {
                max = temperatur;
            } else if (temperatur < min) {
                min = temperatur;
            }
        }

        // Schritt 5: Ergebnisse ausgeben (Durchschnitt auf 2 Nachkommastellen)
        System.out.println("\n--- Ergebnisse ---");
        System.out.printf("Durchschnitt: %.2f°C%n", durchschnitt);
        System.out.println("Höchste Temperatur: " + max + "°C");
        System.out.println("Niedrigste Temperatur: " + min + "°C");
    }

}
