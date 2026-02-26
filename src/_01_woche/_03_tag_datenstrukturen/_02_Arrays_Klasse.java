package _01_woche._03_tag_datenstrukturen;

import java.util.Arrays;

public class _02_Arrays_Klasse {

    public static void main(String[] args) {

        // 1. Array für Lagerbestände
        int[] bestand = {5, 20, 10, 15, 8};

        System.out.println("Ursprüngliche Bestände:");

        // Ausgabe eines Arrays
        IO.println(Arrays.toString(bestand));

        // 2. Arrays.fill() – alle Werte auf einen festen Wert setzen
        System.out.println("\nAlle Bestände auf 0 setzen mit Arrays.fill():");
        Arrays.fill(bestand, 0);
        IO.println(Arrays.toString(bestand));


        // 3. Arrays.sort() – sortieren
        int[] preise = {999, 19, 49, 299, 59}; // Preise für Artikel
        System.out.println("\nPreise unsortiert:");
        printArray(preise);
        Arrays.sort(preise);
        IO.println("Sortierte Preise: " + Arrays.toString(preise));

        // 4. Arrays.binarySearch() – Suche nach einem Wert
        // Funktioniert nur bei sortierten Arrays korrekt
        int index = Arrays.binarySearch(preise, 500);
        IO.println("Index von 49: " + index);
        // Negative Zahl bedeutet, dass der Wert nicht vorhanden ist


        // 5. Arrays.equals() – Vergleich zweier Arrays
        int[] warenkorb1 = {1, 2, 3};
        int[] warenkorb2 = {1, 2, 3};
        int[] warenkorb3 = {1, 2, 4};

        IO.println("warenkorb1 gleich wie warenkorb2?: " + Arrays.equals(warenkorb1, warenkorb2));
        IO.println("warenkorb1 gleich wie warenkorb3?: " + Arrays.equals(warenkorb1, warenkorb3));


        // 6. Arrays.mismatch() – erstes unterschiedliches Element finden
        int unterschied = Arrays.mismatch(warenkorb1, warenkorb3);
        IO.println("Erster Unterschied zwischen w1 und w3: " + unterschied);

        // Gibt -1 zurück, wenn Arrays gleich sind
        int unterschied2 = Arrays.mismatch(warenkorb1, warenkorb2);
        IO.println("Erster Unterschied zwischen w1 und w2: " + unterschied2);

        // verweist aufs gleiche Objekt, das Original wird auch verändert
        int[] meinNeuerWarenkorb = warenkorb1;
        meinNeuerWarenkorb[0] = 10;
        IO.println(Arrays.toString(meinNeuerWarenkorb));
        IO.println(Arrays.toString(warenkorb1));

        // Kopie erstellen
        int [] meinGanzNeuerWarenkorb = Arrays.copyOf(warenkorb1, warenkorb1.length);
        IO.println(Arrays.toString(meinGanzNeuerWarenkorb));

        // wenn neues Array kürzer als das alte, dann gehen Werte verloren
        int [] meinGanzNeuerWarenkorb2 = Arrays.copyOf(warenkorb1, 2);
        IO.println(Arrays.toString(meinGanzNeuerWarenkorb2));

    }

    // Hilfsmethode zum Ausgeben von Arrays
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
