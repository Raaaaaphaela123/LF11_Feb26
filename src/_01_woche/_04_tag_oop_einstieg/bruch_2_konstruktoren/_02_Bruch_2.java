package _01_woche._04_tag_oop_einstieg.bruch_2_konstruktoren;

public class _02_Bruch_2 {
	int zaehler; // Objektvariable
	int nenner; // Objektvariable

	public _02_Bruch_2() { // Konstruktor
		this(0, 1); // Konstruktorverkettung
		// nenner = 1;
	}

	public _02_Bruch_2(int zaehler) {
		this(zaehler, 1); // Konstruktorverkettung
		// this.zaehler = zaehler;
		// nenner = 1;
	}

	/**
	 * 
	 * @param zaehler das ist die Zahl über dem Bruchstrich
	 * @param nenner  wird auf den Wert != 0 geprüft
	 */
	public _02_Bruch_2(int zaehler, int nenner) {
		this.zaehler = zaehler;
		if (nenner != 0) // Nenner darf nicht 0 sein !!
			this.nenner = nenner;
		else
			this.nenner = 1;
	}

	public void ausgeben() { // Methode ohne Rückgabewert, siehe void
		System.out.print(zaehler + " / " + nenner);
	}
}
