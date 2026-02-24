package _01_Woche._02_Tag;

public class _01_If_Anweisungen {

    static void main(String[] args) {

        // Beispiel 1: Einfache Bedingung
        double temperatur = 11;

        if (temperatur > 18) {
            IO.println("Du könntest dir überlegen, ein T-Shirt zu tragen.");
        }

        // If Bedingungen mit nur einer Anweisung können auch ohne Klammern geschrieben werden
        if (temperatur > 18) IO.println("Du könntest dir überlegen, ein T-Shirt zu tragen.");


        // Beispiel 2: if-else
        if (temperatur > 18) {
            IO.println("Du könntest dir überlegen, ein T-Shirt zu tragen.");
        } else {
            IO.println("Du könntest besser einen Pulli tragen.");
        }

        // Beispiel 3: if-else (mehrere Bedingungen)
        if (temperatur > 25) {
            IO.println("Es ist schon warm...");
        } else if (temperatur > 18) {
            IO.println("Du könntest dir überlegen, ein T-Shirt zu tragen.");
        } else if (temperatur > 10) {
            IO.println("Keine Mütze nötig");
        } else {
            IO.println("Es ist kalt.");
        }

        // Beispiel 4: mit logischen Operatoren
        boolean istAngemeldet = true;
        boolean istOnline = true;

        if (istAngemeldet && istOnline) {
            IO.println("Hallo!");
        }

        String username = "Anna";
        if (username.equals("Anna")) {
            IO.println("Username validiert");

            if (!istAngemeldet) {
                IO.println("Ist nicht angemeldet.");
            } else {
                IO.println("Ist angemeldet");
            }
        }


        /* SCHLECHTES BEISPIEL – Wie man If-Bedingungen NICHT schreiben sollte */

        int produktAnzahl = 10;
        int artikelWert = 20;

        // Schlechter Stil: unnötig verschachtelt
        if (produktAnzahl > 5) {
            if (produktAnzahl < 15) {
                if (artikelWert > 10) {
                    if (artikelWert < 30) {
                        System.out.println("Produktanzahl und Artikelwert sind im gültigen Bereich.");
                    }
                }
            }
        }

        if (produktAnzahl > 5 && produktAnzahl < 15) {
            if (artikelWert > 10 && artikelWert < 30) {
                System.out.println("Produktanzahl und Artikelwert sind im gültigen Bereich.");
            }
        }


        // Besser: klar strukturierte Bedingungen
        boolean mengeImBereich = (produktAnzahl > 5 && produktAnzahl < 15);
        boolean wertImBereich = (artikelWert > 10 && artikelWert < 30);

        if (mengeImBereich && wertImBereich) {
            System.out.println("Besser lesbar: Produktanzahl und Artikelwert im gültigen Bereich.");
        }
    }
}
