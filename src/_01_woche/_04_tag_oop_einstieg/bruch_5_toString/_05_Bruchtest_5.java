package _01_woche._04_tag_oop_einstieg.bruch_5_toString;

public class _05_Bruchtest_5 {
	public static void main(String[] args) {
		_05_Bruch_5 meinBruch = new _05_Bruch_5();
		_05_Bruch_5 bruch2 = new _05_Bruch_5();
		_05_Bruch_5 bruch3 = new _05_Bruch_5(2);

		System.out.println("b1: " + meinBruch);// gibt Speicheradresse aus

		meinBruch.setZaehler(5);
		meinBruch.setNenner(10);
		meinBruch.ausgeben();
		meinBruch.kuerzen();

		System.out.println("\tAusgabe durch Methode ausgeben()");
		System.out.println("Bruch b1 = " + meinBruch.getZaehler() + " / " + meinBruch.getNenner());

		IO.println(_05_Bruch_5.getAnzahlBrueche());
	}
}
