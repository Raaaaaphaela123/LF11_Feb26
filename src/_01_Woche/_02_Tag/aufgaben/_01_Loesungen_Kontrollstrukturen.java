package _01_Woche._02_Tag.aufgaben;

public class _01_Loesungen_Kontrollstrukturen {
    public static void main(String[] args) {

        // Aufgabe 1: if-Anweisung
        int alter = 17;
        if (alter >= 18) {
            System.out.println("Volljährig");
        } else {
            System.out.println("Minderjährig");
        }

        // Aufgabe 2: if-else-Anweisung
        int punktzahl = 45;
        if (punktzahl >= 50) {
            System.out.println("Bestanden");
        } else {
            System.out.println("Nicht bestanden");
        }

        // Aufgabe 3: else-if-Kette
        int note = 3;
        if (note == 1) {
            System.out.println("Sehr gut");
        } else if (note == 2) {
            System.out.println("Gut");
        } else if (note == 3) {
            System.out.println("Befriedigend");
        } else if (note == 4) {
            System.out.println("Ausreichend");
        } else if (note == 5) {
            System.out.println("Mangelhaft");
        } else if (note == 6) {
            System.out.println("Ungenügend");
        } else {
            System.out.println("Ungültige Note");
        }

        // Aufgabe 4: switch-Anweisung
        int tag = 4;
        String wochentag;
        switch (tag) {
            case 1:
                wochentag = "Montag";
                break;
            case 2:
                wochentag = "Dienstag";
                break;
            case 3:
                wochentag = "Mittwoch";
                break;
            case 4:
                wochentag = "Donnerstag";
                break;
            case 5:
                wochentag = "Freitag";
                break;
            case 6:
                wochentag = "Samstag";
                break;
            case 7:
                wochentag = "Sonntag";
                break;
            default:
                wochentag = "Ungültiger Tag";
        }
        System.out.println(wochentag);

        // Extra Aufgabe 1: Einfacher ternärer Operator
        int zahl = 7;
        String paritaet = (zahl % 2 == 0) ? "gerade" : "ungerade";
        System.out.println(paritaet);

        // Extra Aufgabe 2: Verschachtelter ternärer Operator
        int temperatur = 15;
        String beschreibung = (temperatur < 0) ? "Eiskalt" : (temperatur <= 20) ? "Kühl" : "Warm";
        System.out.println(beschreibung);
    }

}
