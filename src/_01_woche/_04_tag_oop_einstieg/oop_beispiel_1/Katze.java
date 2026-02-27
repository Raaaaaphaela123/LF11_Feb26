package _01_woche._04_tag_oop_einstieg.oop_beispiel_1;

public class Katze extends Tier {
    private static int anzahlKatzen;
    boolean jagtMaeuse;

    public Katze(String name, int alter, boolean jagtMaeuse) {
        super(name, alter); // Elternkonstruktor

        // this bezieht sich immer auf das konkrete Objekt, was wir erstellen
        this.jagtMaeuse = jagtMaeuse;

        // die Anzahl ist an die Klasse gebunden, nicht an einzelne konkrete Objekte von Katze
        anzahlKatzen++;
    }

    public static int getAnzahlKatzen() {
        return anzahlKatzen;
    }
}
