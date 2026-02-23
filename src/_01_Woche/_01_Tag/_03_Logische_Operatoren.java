package _01_Woche._01_Tag;

public class _03_Logische_Operatoren {
    public static void main(String[] args) {
        // Grundlegende logische Operatoren im Shop
        boolean istPremiumKunde = true;
        boolean hatGutschein = false;

        System.out.println("istPremiumKunde = " + istPremiumKunde + ", hatGutschein = " + hatGutschein);
        System.out.println();

        // UND: Versandkostenfrei nur wenn Premiumkunde UND Mindestbestellwert erreicht
        System.out.println("istPremiumKunde && hatGutschein (UND): " + (istPremiumKunde && hatGutschein)); // false

        // ODER: Versandkostenfrei wenn Premiumkunde ODER Gutschein
        System.out.println("istPremiumKunde || hatGutschein (ODER): " + (istPremiumKunde || hatGutschein)); // true

        // NICHT: Kunde ist kein Premiumkunde
        System.out.println("!istPremiumKunde (NICHT): " + (!istPremiumKunde)); // false

        // Exklusives ODER: Genau einer hat Gutschein oder ist Premiumkunde
        System.out.println("istPremiumKunde ^ hatGutschein (Exklusives ODER): " + (istPremiumKunde ^ hatGutschein)); // true

        // Erklärung:
        // - && ist true, wenn beide true sind
        // - || ist true, wenn mindestens eine true ist
        // - ! kehrt den Wert um
        // - ^ ist true, wenn genau einer true ist

        /* Zusammengesetzte boolesche Ausdrücke im Shop */
        boolean warenkorbHatWertueber50 = true;
        boolean istNeuKunde = false;
        boolean hatTreueBonus = true;

        System.out.println("\nwarenkorbHatWertÜber50 = true, istNeuKunde = false, hatTreueBonus = true\n");

        // Beispiel 1: UND mit drei Operanden → Versandkostenfrei nur bei allen Bedingungen
        boolean versandkostenfrei = istPremiumKunde && warenkorbHatWertueber50 && hatTreueBonus;
        System.out.println("Versandkostenfrei (istPremiumKunde && Warenkorb >50 && TreueBonus): " + versandkostenfrei);

        // Beispiel 2: ODER mit zwei Operanden → Rabatt möglich, wenn mindestens eine Bedingung erfüllt
        boolean hatRabatt = warenkorbHatWertueber50 || istNeuKunde;
        System.out.println("Rabatt möglich (Warenkorb >50 || NeuKunde): " + hatRabatt);

        // Beispiel 3: NICHT und ODER kombiniert → Anmeldung für Aktion möglich
        boolean darfAnmelden = !istNeuKunde || istPremiumKunde;
        System.out.println("Darf an Aktion teilnehmen (!NeuKunde || Premiumkunde): " + darfAnmelden);

        // Beispiel 4: Exklusives ODER → nur wenn genau eine Bedingung zutrifft
        boolean exklusiveAktion = istPremiumKunde ^ hatTreueBonus;
        System.out.println("Exklusive Aktion (Premiumkunde ^ TreueBonus): " + exklusiveAktion);

        // Beispiel 5: Kombination von UND und ODER → besondere Berechtigung
        boolean besondereBerechtigung = (istPremiumKunde && warenkorbHatWertueber50) || (istNeuKunde || hatTreueBonus);
        System.out.println("Besondere Berechtigung ((Premium && Warenkorb>50) || (NeuKunde || TreueBonus)): " + besondereBerechtigung);
    }
}
