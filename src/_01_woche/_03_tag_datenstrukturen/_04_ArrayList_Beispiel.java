package _01_woche._03_tag_datenstrukturen;

import java.util.ArrayList;
import java.util.List;

public class _04_ArrayList_Beispiel {
    public static void main(String[] args) {

      // ArrayList mit Initialwerten
      ArrayList<String> meineDirekteListe = new ArrayList<>(List.of("a", "b", "c"));

      // Erzeugung einer ArrayList für Artikel ohne Initialwerte
      ArrayList<String> artikelListe = new ArrayList<>();

      // Elemente hinzufügen (add)
      artikelListe.add("Laptop");
      artikelListe.add("Maus");
      artikelListe.add("Tastatur");

      System.out.println(artikelListe);

        // Einzelne Elemente abrufen (get)
        System.out.println(artikelListe.get(1));

        // erstes
        System.out.println(artikelListe.getFirst());

        // letztes
        System.out.println(artikelListe.getLast());

        // Index eines Elements (indexOf)
        int meinIndex = artikelListe.indexOf("Tastatur");
        System.out.println("Index Tastatur: " + meinIndex);

        // Prüfen, ob ArrayList leer ist (isEmpty)
        System.out.println("Ist meine Liste leer? " + artikelListe.isEmpty());

        // Elemente entfernen (remove) -> nach Element und Index
        artikelListe.remove("Laptop");
        System.out.println("Liste ohne Laptop: " + artikelListe);

        // Elemente ersetzen set()
        artikelListe.set(0, "Magic Pad");
        System.out.println("Nach Update: " + artikelListe);

        // Größe der Liste
        System.out.println("Größe der Liste: " + artikelListe.size());

        // Liste leeren
        artikelListe.clear();
        System.out.println("Nach clear: " + artikelListe);
        System.out.println("Ist meine Liste leer? " + artikelListe.isEmpty());

    }
}
