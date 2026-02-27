package _01_woche._04_05_tag_oop_einstieg.bruch_6_mehr_methoden;

public class _06_Bruch_6 {
	private int zaehler; // Objektvariable
	private int nenner; // Objektvariable
	private static int anzahlBrueche;// Klassenattribut

	public _06_Bruch_6() { // Konstruktor
		this(0, 1); // Konstruktorverkettung
		// nenner = 1;
	}

	public _06_Bruch_6(int zaehler) {
		this(zaehler, 1); // Konstruktorverkettung
		// this.zaehler = zaehler;
		// nenner = 1;
	}

	/**
	 * 
	 * @param zaehler das ist die Zahl über dem Bruchstrich
	 * @param nenner  wird auf den Wert != 0 geprüft
	 */
	public _06_Bruch_6(int zaehler, int nenner) {
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
	// Aufruf mit Bruch_6.ggt(..., ...)
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

	/**
	 * Multiplikation des aktuellen Bruch_6 Objektes mit dem Bruchobjekt aus der
	 * Parameterübergabe
	 * 
	 * @param bm Bruch_6 Objekt als Mulitplikator
	 * @return Ein Objekt der Klasse Bruch_6
	 */
	public _06_Bruch_6 multipliziere(_06_Bruch_6 bm) {
		int z = this.zaehler * bm.getZaehler();
		int n = this.nenner * bm.getNenner();
		_06_Bruch_6 e = new _06_Bruch_6(z, n); // neuer Bruch nach der Multiplikation
		e.kuerzen();
		return e;
	}

	public _06_Bruch_6 dividiere(_06_Bruch_6 bd) {
		int z = this.zaehler * bd.getNenner();
		int n = this.nenner * bd.getZaehler();
		_06_Bruch_6 e = new _06_Bruch_6(z, n); // neuer Bruch nach der Division
		e.kuerzen();
		return e;
	}

	public _06_Bruch_6 addiere(_06_Bruch_6 ba) {
		int z = (this.zaehler * ba.getNenner()) + (this.nenner * ba.getZaehler());
		int n = this.nenner * ba.getNenner();
		_06_Bruch_6 e = new _06_Bruch_6(z, n);// neuer Bruch nach der Addition
		e.kuerzen();
		return e;
	}

	public _06_Bruch_6 subtrahiere(_06_Bruch_6 bs) {
		int z = (this.zaehler * bs.getNenner()) - (this.nenner * bs.getZaehler());
		int n = this.nenner * bs.getNenner();
		_06_Bruch_6 e = new _06_Bruch_6(z, n);// neuer Bruch nach der Subtraktion
		e.kuerzen();
		return e;
	}

	public void ausgeben() { // Methode ohne Rückgabewert, siehe void
		System.out.print(getZaehler() + " / " + getNenner());
	}

	@Override
	public String toString() {
		return String.valueOf(zaehler + " / " + nenner);
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
