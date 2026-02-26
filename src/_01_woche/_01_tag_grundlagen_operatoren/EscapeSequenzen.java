package _01_woche._01_tag_grundlagen_operatoren;

public class EscapeSequenzen {

    public static void main(String[] args) {

        System.out.println("Zeilenumbruch:\nDies ist die nächste Zeile.");
        System.out.println("Tabulator:\tText nach Tabulator.");
        System.out.println("Backslash: \\ wird mit doppeltem \\ dargestellt.");
        System.out.println("Anführungszeichen: \"Java\" ist toll!");
        System.out.println("Einzelnes Anführungszeichen: \'A\' ist ein Zeichen.");

        /*
         * \r: Viele moderne IDE-Konsolen ignorieren die ursprüngliche Bedeutung von \r
         * (Wagenrücklauf). Statt den Cursor an den Zeilenanfang zu setzen, wird einfach
         * ein normaler Zeilenumbruch dargestellt – als wäre es \n - Intellij macht es aber und überschreibt Hallo mit Welt
         */
        System.out.println("Hallo\rWelt");

        /*
         * \b: Die Escape-Sequenz \b (Backspace) funktioniert in der Java-Konsole nicht
         * so, wie man es erwarten würde, besonders in modernen IDEs wie NetBeans,
         * Eclipse oder IntelliJ. Viele Konsolen interpretieren \b nicht visuell
         * rückwirkend – d. h. der Effekt (ein Zeichen löschen) wird nicht oder nur
         * teilweise sichtbar umgesetzt.
         *
         */
        System.out.println("Rückschritt (Backspace): ABC\bD");

        /*
         * \f: In modernen Konsolen/IDEs (NetBeans, Eclipse etc.) hat \f keine sichtbare
         * Wirkung
         *
         * Es wird meist ignoriert oder als Leerzeichen/Sonderzeichen interpretiert
         *
         * Nur in klassischen Druckumgebungen oder speziellen Terminalemulatoren kann es
         * noch sichtbare Effekte haben (z. B. eine neue Seite oder ein Umbruch im
         * Drucklayout)
         */
        System.out.println("Text vor Formfeed\fText nach Formfeed");

    }
}
