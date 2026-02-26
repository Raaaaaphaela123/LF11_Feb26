package _01_woche._02_tag_kontrollstrukturen;

public class _03_Ternaerer_Operator {
     static void main(String[] args) {
        // Was ist der Konditionaloperator?
        // Kurzform für einfache if-else-Entscheidungen:
        // Syntax: Bedingung ? WertWennTrue : WertWennFalse

        // Beispiel 1: Altersprüfung für Kauf bestimmter Produkte
         int alter = 20;
         String zugang = (alter >= 18) ? "Kauf erlaubt" : "Kauf verweigert";
         IO.println("Person hat Zugang? " + zugang);

        // Beispiel 2: Anzeige je nach Login-Status
         boolean istEingeloggt = false;
         String status = istEingeloggt ? "Logout anzeigen" : "Login anzeigen";
         IO.println("Benutzerstatus: " + status);


         boolean hatGeld = false;
         // unschön, besser if-else
         String status2 = istEingeloggt ? "Logout anzeigen" : (alter >= 18) ? "Ist 18" : hatGeld ? "Hat Geld" : "Kein Geld, kein Login, kein 18";


         // Hinweis:
        // Der Konditionaloperator ist ideal für einfache, übersichtliche Bedingungen,
        // ersetzt jedoch keine komplexen if-Strukturen.


    }
}
