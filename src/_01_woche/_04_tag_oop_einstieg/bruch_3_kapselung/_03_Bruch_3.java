package _01_woche._04_tag_oop_einstieg.bruch_3_kapselung;

public class _03_Bruch_3 {

	private int zaehler; // Objektvariable
	private int nenner; // Objektvariable

	public _03_Bruch_3() { // Konstruktor
		this(0, 1); // Konstruktorverkettung
		// nenner = 1;
	}

	public _03_Bruch_3(int zaehler) {
		this(zaehler, 1); // Konstruktorverkettung
		// this.zaehler = zaehler;
	}

	public _03_Bruch_3(int zaehler, int nenner) {
		this.zaehler = zaehler;
		if (nenner != 0) // Nenner darf nicht 0 sein !!
			this.nenner = nenner;
		else
			this.nenner = 1;
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
