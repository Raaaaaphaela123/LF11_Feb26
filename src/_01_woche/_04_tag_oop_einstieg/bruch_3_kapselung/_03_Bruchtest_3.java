package _01_woche._04_tag_oop_einstieg.bruch_3_kapselung;

public class _03_Bruchtest_3 {
	public static void main(String[] args) {

		_03_Bruch_3 b1 = new _03_Bruch_3();

		System.out.println("b1: " + b1);// gibt Speicheradresse aus
		b1.setZaehler(5);
		b1.setNenner(8);
		b1.ausgeben();

		System.out.println("\tAusgabe durch Methode ausgeben()");
		System.out.println("Bruch b1 = " + b1.getZaehler() + " / " + b1.getNenner());
	}
}
