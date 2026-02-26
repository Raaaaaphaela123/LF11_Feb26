package _01_woche._04_tag_oop_einstieg.bruch_1_klasse_attribute;

public class _01_Bruchtest_1 {
    public static void main(String[] args) {
        _01_Bruch_1 meinBruch = new _01_Bruch_1();
        meinBruch.zaehler = 2;
        meinBruch.nenner = 4;

        meinBruch.ausgeben();
    }
}
