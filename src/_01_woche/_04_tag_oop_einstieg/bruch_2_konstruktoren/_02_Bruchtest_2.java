package _01_woche._04_tag_oop_einstieg.bruch_2_konstruktoren;

public class _02_Bruchtest_2 {
    public static void main(String[] args) {

        _02_Bruch_2 meinBruch = new _02_Bruch_2();
        System.out.println("b1: " + meinBruch);// gibt Speicheradresse aus

        meinBruch.zaehler = 5;
        meinBruch.nenner = 8;
        meinBruch.ausgeben();

        System.out.println("\tAusgabe durch Methode ausgeben()");
        System.out.println("Bruch b1 = " + meinBruch.zaehler + " / " + meinBruch.nenner);
    }
}
