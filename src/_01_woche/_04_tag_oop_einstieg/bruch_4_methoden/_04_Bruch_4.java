package _01_woche._04_tag_oop_einstieg.bruch_4_methoden;

public class _04_Bruch_4 {

	private int zaehler; // Objektvariable
	private int nenner; // Objektvariable

	public _04_Bruch_4() { // Konstruktor
		this(0, 1); // Konstruktorverkettung
		// nenner = 1;
	}

	public _04_Bruch_4(int zaehler) {
		this(zaehler, 1); // Konstruktorverkettung
		// this.zaehler = zaehler;
		// nenner = 1;
	}

	public _04_Bruch_4(int zaehler, int nenner) {
		this.zaehler = zaehler;
		if (nenner != 0) // Nenner darf nicht 0 sein !!
			this.nenner = nenner;
		else
			this.nenner = 1;
	}

	public void erweitern(int faktor) {
		zaehler = zaehler * faktor;
		nenner = nenner * faktor;
	}

	public void kuerzen() {
		int t = ggt(zaehler, nenner);
		zaehler = zaehler / t;
		nenner = nenner / t;
	}

	// Klassenmethode siehe static
	// steht auch ohne Objekt zur Verfügung
	// Aufruf mit Bruch_4.ggt(..., ...)
	public static int ggt(int m, int n) {
		m = Math.abs(m);
		n = Math.abs(n);
		int r = m % n;
		while (r > 0) {
			m = n;
			n = r;
			r = m % n;
		}
		return n;
	}

	public void ausgeben() { // Methode ohne Rückgabewert, siehe void
		System.out.print(getZaehler() + " / " + getNenner());
	}

	public int getZaehler() {
		return zaehler;
	}

	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	public int getNenner() {
		return nenner;
	}

	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
}
