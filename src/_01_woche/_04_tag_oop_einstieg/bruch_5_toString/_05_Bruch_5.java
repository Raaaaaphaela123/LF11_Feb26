package _01_woche._04_tag_oop_einstieg.bruch_5_toString;

public class _05_Bruch_5 {
	private int zaehler; // Objektvariable
	private int nenner; // Objektvariable
	private static int anzahlBrueche;// Klassenattribut

	public _05_Bruch_5() { // Konstruktor
		this(0, 1); // Konstruktorverkettung
		// nenner = 1;
	}

	public _05_Bruch_5(int zaehler) {
		this(zaehler, 1); // Konstruktorverkettung
		// this.zaehler = zaehler;
		// nenner = 1;
	}

	/**
	 * 
	 * @param zaehler das ist die Zahl über dem Bruchstrich
	 * @param nenner  wird auf den Wert != 0 geprüft
	 */
	public _05_Bruch_5(int zaehler, int nenner) {
		anzahlBrueche++;
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
	// Aufruf mit Bruch_5.ggt(..., ...)
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

	@Override
	public String toString() {
		return zaehler + " / " + nenner;
	}

	// Klassenmethode zum Lesen der Klassenvariable anzahlBrueche
	// eine set-Methode ist nicht vorgesehen
	public static int getAnzahlBrueche() {
		return anzahlBrueche;
	}

	/**
	 * @return the zaehler
	 */
	public int getZaehler() {
		return zaehler;
	}

	/**
	 * @param zaehler the zaehler to set
	 */
	public void setZaehler(int zaehler) {
		this.zaehler = zaehler;
	}

	/**
	 * @return the nenner
	 */
	public int getNenner() {
		return nenner;
	}

	/**
	 * @param nenner the nenner to set
	 */
	public void setNenner(int nenner) {
		this.nenner = nenner;
	}
}
