package _01_woche._05_OOP_weiterführung;

import java.util.ArrayList;

public class UserVerwaltungAufgaben {

    public static void main(String[] args) {

        // ===========================
        // Schritt 1: ArrayList für Benutzer erstellen
        // ===========================
        // TODO:
        // 1) Erstelle eine ArrayList<User> mit dem Namen userListe
        // 2) Füge mindestens hinzu:
        //    - 2 normale User
        //    - 1 Admin
        //    - 1 Gast
        // 3) Gib die Liste komplett aus, indem du für jedes Objekt die info() Methode aufrufst

        ArrayList<User> userListe = new ArrayList<>();
        // TODO: User-Objekte erstellen und hinzufügen

        // TODO: Liste ausgeben (info() aufrufen)

        // ===========================
        // Schritt 2: Admin-Funktionen
        // ===========================
        // TODO:
        // 1) Erstelle eine Admin-Methode loescheUser(ArrayList<User> liste, String email)
        //    - Diese Methode entfernt einen User aus der Liste anhand seiner Email
        // 2) Lasse den Admin einen User löschen
        // 3) Gib die Liste erneut aus, um zu überprüfen, dass der User gelöscht wurde

        // Beispiel:
        // Admin admin1 = new Admin("max123", "max@test.de", true);
        // admin1.loescheUser(userListe, "gast@test.de");

        // ===========================
        // Schritt 3: Neue Methoden für Useraktionen
        // ===========================
        // TODO:
        // 1) Ergänze die Gast-Klasse um eine Methode aendereName(String neuerName)
        // 2) Teste die Methode:
        //    - Ändere den Namen eines Gast-Objekts
        //    - Zeige das Ergebnis über info()

        // ===========================
        // Schritt 4: Erweiterte Listen-Funktionen
        // ===========================
        // TODO:
        // 1) Filtere die Liste nach User-Typ (z.B. alle Admins oder alle Gäste)
        // 2) Optional: Admin kann mehrere User auf einmal löschen
        //    - Übergib eine Liste von E-Mails an die Methode

        // ===========================
        // Schritt 5: Optionaler Bonus
        // ===========================
        // TODO:
        // 1) Füge eine neue Klasse Moderator hinzu, die von User erbt und spezielle Rechte besitzt
        // 2) Implementiere eine Methode, die nur Moderatoren benutzen können, z.B. zeigeAdmins()
        // 3) Teste die Methode mit einer gemischten Liste

    }
}

// ===========================
// Hinweis zu Klassen
// ===========================
/*
Die Klassen User, Admin und Gast sollten bereits aus der vorherigen Aufgabe vorhanden sein.
Wenn du sie noch einmal definieren möchtest, kannst du sie hier ergänzen:

class User {
    // protected Attribute: username, email
    // Konstruktor: initialisiert username und email
    // Methode info(): Ausgabe z.B. User: <username> (<email>)
}

class Admin extends User {
    // zusätzliches Attribut: boolean superAdmin
    // Konstruktor: Übergibt username und email an super(), setzt superAdmin
    // Methode info() überschreiben: Admin: <username> (<email>), SuperAdmin: <true/false>
    // Methode loescheUser(ArrayList<User> liste, String email)
}

class Gast extends User {
    // zusätzliches Attribut: int gueltigBisTag
    // Methode info() überschreiben: Gast: <username>, gültig bis Tag <gueltigBisTag>
    // Methode aendereName(String neuerName)
}
*/


