package _01_woche._04_tag_oop_einstieg.oop_beispiel_1;

public class MyAppKatze {
    static void main() {
        // Aufruf meiner statischen Variable anzahlKatzen
        IO.println(Katze.getAnzahlKatzen());

        Katze fina = new Katze("Fina", 3, true);
        IO.println(Katze.getAnzahlKatzen());

    }
}
