package _01_woche._04_tag_oop_einstieg.oop_beispiel;

public class MyApp {
    static void main() {
        Hund bello = new Hund();
        bello.setName("Bello");
        bello.setLeinenLaenge("3 Meter");
        IO.println(bello.getName());
        IO.println(bello.getLeinenLaenge());

        bello.macheSound();
        bello.macheSound("laut");

        bello.macheTon();

        IO.println("___");
        Tier meinHund = new Hund();
        meinHund.macheTon();

//        Katze filou = new Katze();
//        filou.name = "Filou";
//        filou.alter = 5;
//        filou.jagtMaeuse = true;

    }

}
