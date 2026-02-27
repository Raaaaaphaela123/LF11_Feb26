package _01_woche._04_tag_oop_einstieg.bruch_4_methoden;

public class _04_Bruchtest_4 {
	public static void main(String[] args) {

		_04_Bruch_4 b1 = new _04_Bruch_4();
		System.out.println("b1: " + b1);// gibt Speicheradresse aus

		b1.setZaehler(5);
		b1.setNenner(10);
		b1.ausgeben();

		// Methode ggt ausserhalb der Klasse Bruch nutzen
		System.out.println("ggt von 5 und 10 ist " + b1.ggt(5, 10));

		b1.kuerzen();

		System.out.println("\tAusgabe durch Methode ausgeben()");
		System.out.println("Bruch b1 = " + b1.getZaehler() + " / " + b1.getNenner());
	}
}
