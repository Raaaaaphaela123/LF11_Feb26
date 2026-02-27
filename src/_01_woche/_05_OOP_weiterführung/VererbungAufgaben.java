package _01_woche._05_OOP_weiterführung;

/**
 * ============================================================
 * Java Aufgabe: Vererbung -- Benutzerrollen
 * ============================================================
 *
 * Aufgabe 1: Basisklasse User
 * - Attribute:
 *   - protected String username
 *   - protected String email
 * - Konstruktor:
 *   - Initialisiert username und email
 * - Methode:
 *   - public void info()
 *     Beispiel: User: max123 (max@test.de)
 *
 * Aufgabe 2: Unterklasse Admin
 * - Erbt von User
 * - Zusätzliches Attribut:
 *   - private boolean superAdmin
 * - Konstruktor:
 *   - Übergibt username und email an super
 *   - Setzt superAdmin
 * - Überschreibe info()
 *   Beispiel: Admin: max123 (max@test.de), SuperAdmin: true
 *
 * Aufgabe 3: Unterklasse Gast
 * - Erbt von User
 * - Zusätzliches Attribut:
 *   - private int gueltigBisTag
 * - Überschreibe info()
 *   Beispiel: Gast: anna_guest, gültig bis Tag 20
 *
 * Aufgabe 4: Testklasse Main
 * - Erzeuge ein Admin-Objekt und ein Gast-Objekt
 * - Rufe jeweils die info()-Methode auf
 *
 */

public class VererbungAufgaben {

    public static void main(String[] args) {

        // ===========================
        // Aufgabe 4: Testklasse Main
        // ===========================
        // TODO:
        // 1) Erstelle ein Admin-Objekt
        //    - Übergib username, email, superAdmin
        // 2) Erstelle ein Gast-Objekt
        //    - Übergib username, email, gueltigBisTag
        // 3) Rufe jeweils die info()-Methode auf, um die Informationen auszugeben
        //
        // Beispiel:
        // Admin admin1 = new Admin("max123", "max@test.de", true);
        // Gast gast1 = new Gast("anna_guest", "anna@test.de", 20);
        // admin1.info();
        // gast1.info();
    }
}

// ===========================
// Aufgabe 1: Basisklasse User
// ===========================
/*
TODO:
- Erstelle eine Klasse 'User'
- Attribute: protected String username, protected String email
- Konstruktor, der username und email initialisiert
- Methode: public void info()
  - Gibt den User in folgendem Format aus:
    User: <username> (<email>)
*/

class User {
    // TODO: Attribute definieren

    // TODO: Konstruktor schreiben

    // TODO: Methode info() schreiben
}

// ===========================
// Aufgabe 2: Unterklasse Admin
// ===========================
/*
TODO:
- Erstelle eine Klasse 'Admin', die von User erbt
- Zusätzliches Attribut: private boolean superAdmin
- Konstruktor:
    - Übergibt username und email an super()
    - Setzt superAdmin
- Überschreibe info() Methode:
    - Ausgabeformat: Admin: <username> (<email>), SuperAdmin: <true/false>
*/

class Admin extends User {
    // TODO: Attribut superAdmin definieren

    // TODO: Konstruktor schreiben

    // TODO: info() überschreiben
}

// ===========================
// Aufgabe 3: Unterklasse Gast
// ===========================
/*
TODO:
- Erstelle eine Klasse 'Gast', die von User erbt
- Zusätzliches Attribut: private int gueltigBisTag
- Überschreibe info() Methode:
    - Ausgabeformat: Gast: <username>, gültig bis Tag <gueltigBisTag>
*/

class Gast extends User {
    // TODO: Attribut gueltigBisTag definieren

    // TODO: Konstruktor schreiben

    // TODO: info() überschreiben
}

