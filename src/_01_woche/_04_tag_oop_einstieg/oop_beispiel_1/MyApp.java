package _01_woche._04_tag_oop_einstieg.oop_beispiel_1;

import _01_woche._04_tag_oop_einstieg.oop_beispiel_2.Haus;

public class MyApp {
    static void main() {
        // Instanziierung eines konkreten Objektes

        // default Konstruktor Aufruf
        Hund bello = new Hund();
        // setzen der Instanzattribute
        bello.setName("Bello");
        bello.setLeinenLaenge("3 Meter");

        IO.println(bello.getName());
        IO.println(bello.getLeinenLaenge());

        // Konstruktor mit allen Attributen
        Hund lisa = new Hund("Lisa", 4, "1.5 m");
        IO.println(" lisa.informationenAnzeigen();");

        // Methode mit Rückgabewert aufrufen -> gibt durch den print die Infos aus
        IO.println(lisa.informationenAnzeigen());

        // Mit dem Rückgabewert kann weitergearbeitet werden
        String erweiterteAusgabe = lisa.informationenAnzeigen();
        erweiterteAusgabe += ", der Hund beißt.";
        IO.println(erweiterteAusgabe);


        Hund louli = new Hund("Louli", 8, "8 m");


        // Aufruf von überladener Methode aus der Klasse Hund
        bello.spiele();
        bello.spiele("wild");

        // Aufruf der überschriebenen Methode
        bello.macheTon();

        IO.println("___");
        // Dynamische Bindung -> zur Laufzeit wird entschieden, welche Implementierung einer Methode aufgerufen wird -> folgt in LFZQ16a genauer!
        Tier meinHund = new Hund();
        meinHund.macheTon();

        // In der Klasse wurde noch keine Kapselung gemacht
//        Katze filou = new Katze();
//        filou.jagtMaeuse = true;

        // importierte Klasse aus anderem package
        Haus meinHaus = new Haus();


    }

}
