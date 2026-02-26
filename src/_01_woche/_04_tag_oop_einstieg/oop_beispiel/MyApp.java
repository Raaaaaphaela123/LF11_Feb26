package _01_woche._04_tag_oop_einstieg.oop_beispiel;

public class MyApp {
    static void main() {
        // Instanziierung eines konkreten Objektes
        Hund bello = new Hund();

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

//        Katze filou = new Katze();
//        filou.name = "Filou";
//        filou.alter = 5;
//        filou.jagtMaeuse = true;

    }

}
