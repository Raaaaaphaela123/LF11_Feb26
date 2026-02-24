package _01_Woche._02_Tag.aufgaben.schleifen;

import java.util.Scanner;

public class _01_Fahrscheinautomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean weiter = true;

        while (weiter) {
            // Tarifzonen
            System.out.println("\nBitte wählen Sie Ihre Tarifzone:");
            System.out.println("1) Zone A - 2,50 €");
            System.out.println("2) Zone B - 3,00 €");
            System.out.println("3) Zone C - 4,20 €");
            System.out.println("0) Ausschalten");
            System.out.print("Ihre Auswahl: ");

            int zone = scanner.nextInt();
            int preis = 0;

            if (zone == 0) {
                System.out.println("Programm wird beendet.");
                weiter = false;
                continue;
            } else if (zone == 1) {
                preis = 250;
            } else if (zone == 2) {
                preis = 300;
            } else if (zone == 3) {
                preis = 420;
            } else {
                System.out.println("Ungültige Auswahl!");
                continue;
            }

            System.out.println("\nBitte werfen Sie Geld ein (in Cent).");
            System.out.println("Gültige Beträge: 5, 10, 20, 50, 100, 200, 500, 1000, 2000, 5000");

            int eingezahlt = 0;

            // Geld einwerfen, bis Betrag erreicht ist
            while (eingezahlt < preis) {
                System.out.print("Eingabe (in Cent): ");
                int betrag = scanner.nextInt();

                // Nur gültige Werte akzeptieren
                if (betrag == 5 || betrag == 10 || betrag == 20 || betrag == 50 ||
                        betrag == 100 || betrag == 200 || betrag == 500 || betrag == 1000 ||
                        betrag == 2000 || betrag == 5000) {

                    eingezahlt = eingezahlt + betrag;
                    System.out.println("Aktuell eingezahlt: " + (eingezahlt / 100.0) + " €");

                } else {
                    System.out.println("Ungültiger Geldbetrag! Bitte erneut versuchen.");
                }

                if (eingezahlt < preis) {
                    double rest = (preis - eingezahlt) / 100.0;
                    System.out.println("Noch zu zahlen: " + rest + " €");
                }
            }

            // Wechselgeld berechnen
            int rueckgeld = eingezahlt - preis;

            if (rueckgeld > 0) {
                System.out.println("\nWechselgeld: " + (rueckgeld / 100.0) + " €");
                System.out.println("Zurückgegebene Münzen:");

                // Schrittweise in Münzen zurückgeben
                while (rueckgeld >= 200) {
                    System.out.println("2 €");
                    rueckgeld = rueckgeld - 200;
                }
                while (rueckgeld >= 100) {
                    System.out.println("1 €");
                    rueckgeld = rueckgeld - 100;
                }
                while (rueckgeld >= 50) {
                    System.out.println("0,50 €");
                    rueckgeld = rueckgeld - 50;
                }
                while (rueckgeld >= 20) {
                    System.out.println("0,20 €");
                    rueckgeld = rueckgeld - 20;
                }
                while (rueckgeld >= 10) {
                    System.out.println("0,10 €");
                    rueckgeld = rueckgeld - 10;
                }
                while (rueckgeld >= 5) {
                    System.out.println("0,05 €");
                    rueckgeld = rueckgeld - 5;
                }
            }

            System.out.println("\nFahrschein wird gedruckt. Gute Fahrt!");
        }

        scanner.close();
    }

}
