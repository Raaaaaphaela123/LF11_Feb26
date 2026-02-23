package _01_Woche._01_Tag;

public class _01_Strings_Basics {

    public static void main(String[] args) {
        // Strings im Shop-Kontext
        String leererText = ""; // Initialisierung mit leerem Text

        // Kundenname
        String kundenName;      // Deklaration
        kundenName = "Anna";    // Initialisierung

        // Produktname
        String produktName = "Laptop"; // Deklaration und Initialisierung

        // Alternative Initialisierung
        String kategorie = new String();
        kategorie = "Elektronik";


        // charAt(i): Liefert ein Zeichen aus dem String, z.B. erster Buchstabe des Produktnamens
        char ersterBuchstabe = produktName.charAt(0); // liefert 'L'
        System.out.println("Erster Buchstabe des Produkts: " + ersterBuchstabe);

        // substring(i,j): Teilstring aus dem Produktnamen, z.B. kurze Abkürzung
        String abkuerzung = produktName.substring(0, 3); // liefert 'Lap'
        System.out.println("Produktabkürzung: " + abkuerzung);

        // length(): Anzahl der Zeichen im Produktnamen
        int produktLaenge = produktName.length(); // liefert 6
        System.out.println("Länge des Produktnamens: " + produktLaenge);

        // equals(Object o): Prüft, ob der Name des Produkts einem anderen String entspricht
        boolean istLaptop = produktName.equals("Laptop"); // true
        System.out.println("Ist das Produkt ein Laptop? " + istLaptop);

        // compareTo(Object o): Lexikalischer Vergleich, z.B. Sortierung von Produkten
        int vergleich = produktName.compareTo("Smartphone");
        System.out.println("Vergleich Laptop vs Smartphone: " + vergleich);

        // toUpperCase(): Produktname in Großbuchstaben
        String gross = produktName.toUpperCase();
        System.out.println("Produktname groß: " + gross);

        // toLowerCase(): Produktname in Kleinbuchstaben
        String klein = produktName.toLowerCase();
        System.out.println("Produktname klein: " + klein);

        // Integer.parseInt(String): Beispiel für Menge oder Preisangabe als String
        String mengeText = "12";
        int menge = Integer.parseInt(mengeText); // liefert int 12
        System.out.println("Menge aus String: " + menge);
    }
}
