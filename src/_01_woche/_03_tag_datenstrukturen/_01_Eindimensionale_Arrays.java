package _01_woche._03_tag_datenstrukturen;

// GFN Folien: Tag 11_ Packages Imports Arrays
public class _01_Eindimensionale_Arrays {

    // Arrays sind Containerklassen zur Speicherung von Elementen
    // Können primitive Daten oder Referenztypen aufnehmen
    // Elemente müssen im selben Datentyp vorliegen
    // Werte im Array sind veränderbar, die Größe ist jedoch fest

    // Anwendundungszwecke:
    // Anzahl der Elemente steht fest, z.B. Wochentage
    // sind schneller als Listen: Zugriffsgeschwindigkeit, Speicherverbrauch und brauchen kein Autoboxing bei primitiven Typen
    // -> z.B. Spiele Engines nutzen häufig Arrays
    // können mit primitiven Datentypen arbeiten
    // für multidimensionale Datenstrukturen, Einsatz für Raster, Pixel, Matrizen, Spielekarten

    // im Alltag benutzen wir eher Listen

    static void main(String[] args) {

        // Deklaration eines Arrays
        String[] namen;

        // Initialisierung mit fester Größe
        namen = new String[3];

        // Deklaration und Initialisierung in einer Zeile
        String[] bestellungen = new String[5];

        // Hinzufügen von Elementen -> Zugriff über Index
        namen[0] = "Max";
        namen[1] = "Anna";
        namen[2] = "Karl-Heinz";

        IO.println("Arraywert an erster Stelle: " + namen[0]);


        // Länge kann via array.length ermittelt werden
        // Ausgabe der einzelnen Werte via for-Schleife über den Index
        for (int i = 0; i < namen.length; i++) {
            IO.println("Name an Index " + i + ": " + namen[i]);
        }

        // Enhanced For-Schleife (for-each)
        for (String name : namen) {
            IO.println("Enhanced for: Name: " + name);
        }


        // Direkte Deklaration und Initialisierung (Array-Literal)
        double[] schulden = {99.99, 299.99, 49.99};
        IO.println("Länge des Arrays mit direkten Werten: " + schulden.length);

        // Ausgabe von 2 Arrays
        for (int i = 0; i < namen.length; i++) {
            IO.println("Person " + namen[i] + " hat folgende Schulden: " + schulden[i] + " €.");
        }

        // Anonyme Arrays (direkte Übergabe an Methode)
        printDoubleArray(new double[]{100.99, 99.99});

        // Fehlerbeispiel: ArrayIndexOutOfBoundsException
        // IO.println(namen[3]); -> schmeißt Exception


        String[] gaeste = new String[3];
        // Befüllung von Werten in einem Array durch Nutzereingabe - Beispiel
//        for (int i = 0; i < gaeste.length; i++) {
//            gaeste[i] = JOptionPane.showInputDialog("Bitte den " + (i + 1) + ". Vornamen eingeben: ");
//
//            IO.println("Eingegebener Name: " + gaeste[i]);
//        }

        // Ersetzen eines Werts im Array
        namen[0] = "Maximilian";
        IO.println(namen[0]);


    }

    // Methode zum Ausgeben eines Arrays mit doubles
    public static void printDoubleArray(double[] zahlen) {
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
    // Methode zum Ausgeben eines Arrays mit Strings

    public static void printStringArray(String[] zahlen) {
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }
    }
}
