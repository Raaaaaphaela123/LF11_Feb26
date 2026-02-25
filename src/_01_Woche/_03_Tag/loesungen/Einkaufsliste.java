package _01_Woche._03_Tag.loesungen;

import java.util.ArrayList;
import java.util.Scanner;

public class Einkaufsliste {
     static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> liste = new ArrayList<>();

        System.out.println("Einkaufsliste erstellen. Gib die Produkte ein (Tippe 'fertig' zum Beenden):");

        // Produkte hinzufügen
        while (true) {
            System.out.print("Produkt: ");
            String produkt = scanner.nextLine();
            if (produkt.equalsIgnoreCase("fertig")) {
                break;
            }
            liste.add(produkt);
        }

        // Einkaufsliste ausgeben
        System.out.println("\nDeine Einkaufsliste:");
        for (String produkt : liste) {
            System.out.println("- " + produkt);
        }

        // Produkte entfernen
        System.out.println("\nFalls du Produkte entfernen möchtest, gib diese ein (Tippe 'fertig' zum Beenden):");
        while (true) {
            System.out.print("Produkt entfernen: ");
            String produkt = scanner.nextLine();
            if (produkt.equalsIgnoreCase("fertig")) {
                break;
            }
            if (liste.contains(produkt)) {
                liste.remove(produkt);
                System.out.println(produkt + " wurde entfernt.");
            } else {
                System.out.println(produkt + " ist nicht in der Liste.");
            }
        }

        // Aktualisierte Liste ausgeben
        System.out.println("\nAktualisierte Einkaufsliste:");
        for (String produkt : liste) {
            System.out.println("- " + produkt);
        }

        scanner.close();
    }

}
