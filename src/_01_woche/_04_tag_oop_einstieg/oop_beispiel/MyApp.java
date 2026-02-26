package _01_woche._04_tag_oop_einstieg.oop_beispiel;

public class MyApp {
    static void main() {
        // Instanziierung eines konkreten Objektes


        byte byte1 = 127;
        byte byte2 = 3;

        int byte3 = (byte1 + byte2);
        IO.println("Byte2: " + byte3);

        // default Konstruktor Aufruf
        Hund bello = new Hund();
        Tier meinTier = new Hund();

        // Konstruktor mit allen Attributen
        Hund lisa = new Hund("Lisa", 4, "1.5 m");
        IO.println("Lisa mit Konstruktor mit allen Instanzvariablen und super(): " + lisa.getName() + " " + lisa.getLeinenLaenge());

        Hund louli = new Hund("Louli", 8, "8 m");
        IO.println("Louli: " + louli.getName() + ", " + louli.getLeinenLaenge());

        IO.println(lisa.getName());

        // setzen der Instanzattribute
        bello.setName("Bello");
        bello.setLeinenLaenge("3 Meter");

        IO.println(bello.getName());
        IO.println(bello.getLeinenLaenge());

        // Aufruf von überladener Methode aus der Klasse Hund
        bello.spiele();
        bello.spiele("wild");

        // Aufruf der überschriebenen Methode
        bello.macheTon();

        IO.println("___");
        // Dynamische Bindung -> folgt in LFZQ16a genauer!
        Tier meinHund = new Hund();
        meinHund.macheTon();

        // In der Klasse wurde noch keine Kapselung gemacht
//        Katze filou = new Katze();
//        filou.jagtMaeuse = true;

    }

}
