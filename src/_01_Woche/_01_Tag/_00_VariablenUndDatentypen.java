package _01_Woche._01_Tag;

public class _00_VariablenUndDatentypen {
	public static void main(String[] args) {

		// Kommentar
		/* Auch ein Kommentar, mehrzeilig */

		// Konstante: Mehrwertsteuer
		final double MWST = 0.19;

		// Primitive Typen
		byte anzahlProdukte = 5;            // Anzahl der Produkte im Warenkorb
		short maxBestellwert = 32000;       // Maximaler Bestellwert in Cent
		int kundenAlter = 25;               // Alter des Kunden
		long kundenID = 12345678900L;       // Eindeutige Kunden-ID
		float produktBewertung = 4.5f;      // Durchschnittliche Bewertung eines Produkts
		double warenkorbWert = 59.99;       // Warenkorbwert in Euro
		boolean istVersandKostenfrei = false; // Versandkostenfrei oder nicht
		char kundenGeschlecht = 'F';        // Geschlecht des Kunden

		// Nicht-primitive Typen
		String kundenName = "Anna";         // Name des Kunden
		double[] produktPreise = {19.99, 9.99, 14.99, 4.99}; // Preise der Produkte im Warenkorb

		// Ausgabe der Variablen
		System.out.println("Mehrwertsteuer: " + MWST);
		System.out.println("Anzahl Produkte im Warenkorb: " + anzahlProdukte);
		System.out.println("Maximaler Bestellwert: " + maxBestellwert);
		System.out.println("Kundenalter: " + kundenAlter);
		System.out.println("Kunden-ID: " + kundenID);
		System.out.println("Produktbewertung: " + produktBewertung);
		System.out.println("Warenkorbwert: " + warenkorbWert + " €");
		System.out.println("Versandkostenfrei? " + istVersandKostenfrei);
		System.out.println("Kundengeschlecht: " + kundenGeschlecht);

		System.out.println("Kundenname: " + kundenName);
		System.out.println("Preis des ersten Produkts: " + produktPreise[0] + " €");
	}
}
