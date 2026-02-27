package _01_woche._04_05_tag_oop_einstieg.bruch_6_mehr_methoden;

public class _06_Bruchtest_6 {
	public static void main(String[] args) {
		// Multiplikation testen mit 2 Brüchen

		_06_Bruch_6 b1 = new _06_Bruch_6(2, 5);
		_06_Bruch_6 b2 = new _06_Bruch_6(3, 4);
		_06_Bruch_6 ergebnis = b1.multipliziere(b2);
		System.out.println("Ergebnis = " + ergebnis.getZaehler() + " / " + ergebnis.getNenner());

		// Divisision testen mit 2 Brüchen

		/*
		 * Bruch_6 b1 = new Bruch_6(2,5); Bruch_6 b2 = new Bruch_6(3,4); Bruch_6
		 * ergebnis = b1.dividiere(b2); System.out.println("Ergebnis = " +
		 * ergebnis.getZaehler() + " / " + ergebnis.getNenner());
		 */

		// Addition testen mit 2 Brüchen

		/*
		 * Bruch_6 b1 = new Bruch_6(2,5); Bruch_6 b2 = new Bruch_6(3,4); Bruch_6
		 * ergebnis = b1.addiere(b2); System.out.println("Ergebnis = " +
		 * ergebnis.getZaehler() + " / " + ergebnis.getNenner());
		 */

		// Divisision testen mit 2 Brüchen

		/*
		 * Bruch_6 b1 = new Bruch_6(2,5); Bruch_6 b2 = new Bruch_6(3,4); Bruch_6
		 * ergebnis = b1.subtrahiere(b2); System.out.println("Ergebnis = " +
		 * ergebnis.getZaehler() + " / " + ergebnis.getNenner());
		 */
	}
}
