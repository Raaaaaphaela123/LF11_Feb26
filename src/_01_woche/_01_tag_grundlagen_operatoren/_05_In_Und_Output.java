package _01_woche._01_tag_grundlagen_operatoren;

import javax.swing.*;
import java.util.Scanner;

public class _05_In_Und_Output {
    public static void main(String[] args) {

        /* SCANNER */
        Scanner scanner = new Scanner(System.in);

        // Eingabe des Kunden-Namens
        System.out.print("Bitte gib deinen Namen ein: ");
        String kundenName = scanner.nextLine();

        // Eingabe des Warenkorbwerts
        System.out.print("Bitte gib den Warenkorbwert ein: ");
        double warenkorbWert = scanner.nextDouble();

        // Ausgabe
        System.out.println("Hallo " + kundenName + "! Dein Warenkorbwert beträgt " + warenkorbWert + " €.");

        // Scanner schließen
        scanner.close();

        /* JOPTIONPANE */

        // Eingabe mit Dialogfenster
        String nameDialog = JOptionPane.showInputDialog("Wie heißt du?");
        String wertString = JOptionPane.showInputDialog("Wie hoch ist dein Warenkorbwert?");

        // Umwandeln der Eingabe in Zahl
        double warenkorbDialog = Double.parseDouble(wertString);

        // Ausgabe mit Dialogfenster
        JOptionPane.showMessageDialog(null, "Hallo " + nameDialog + "! Dein Warenkorbwert beträgt " + warenkorbDialog + " €.");

    }
}
