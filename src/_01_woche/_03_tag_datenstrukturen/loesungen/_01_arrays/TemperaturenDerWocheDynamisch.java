package _01_woche._03_tag_datenstrukturen.loesungen._01_arrays;

import java.util.Scanner;

public class TemperaturenDerWocheDynamisch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Schritt 1: Arraygröße dynamisch eingeben
        System.out.print("Wie viele Tage sollen erfasst werden? ");
        int tage = scanner.nextInt();

        int[] temperaturen = new int[tage];

        // Schritt 2: Temperaturen per Eingabe erfassen
        for (int i = 0; i < tage; i++) {
            System.out.print("Temperatur für Tag " + (i + 1) + ": ");
            temperaturen[i] = scanner.nextInt();
        }

        // Schritt 3: Alle Temperaturen ausgeben
        System.out.println("\nTemperaturen:");
        for (int i = 0; i < temperaturen.length; i++) {
            System.out.println("Tag " + (i + 1) + ": " + temperaturen[i] + "°C");
        }

        // Schritt 4: Durchschnitt berechnen
        int summe = 0;
        for (int temperatur : temperaturen) {
            summe += temperatur;
        }
        double durchschnitt = (double) summe / temperaturen.length;

        // Schritt 5: Höchste und niedrigste Temperatur ermitteln
        int max = temperaturen[0];
        int min = temperaturen[0];
        for (int temperatur : temperaturen) {
            if (temperatur > max) {
                max = temperatur;
            } else if (temperatur < min) {
                min = temperatur;
            }
        }

        // Schritt 6: Ergebnisse ausgeben
        System.out.println("\n--- Ergebnisse ---");
        System.out.printf("Durchschnitt: %.2f°C%n", durchschnitt);
        System.out.println("Höchste Temperatur: " + max + "°C");
        System.out.println("Niedrigste Temperatur: " + min + "°C");

        scanner.close();
    }
}
