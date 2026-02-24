package _01_Woche._02_Tag;

public class _05_Inkrement_Dekrement {
     static void main(String[] args) {
        // Anzahl eines Produkts im Warenkorb
        int mengeProdukt = 5;
        System.out.println("Anfangsmenge im Warenkorb: " + mengeProdukt);

        // Post-Inkrement: zuerst ausgeben, dann erhöhen
        System.out.println("Menge nach mengeProdukt++ (Post-Inkrement): " + mengeProdukt++);
        System.out.println("Jetzt ist die Menge: " + mengeProdukt);

        // Prä-Inkrement: zuerst erhöhen, dann ausgeben
        System.out.println("Menge nach ++mengeProdukt (Prä-Inkrement): " + ++mengeProdukt);
        System.out.println("Jetzt ist die Menge: " + mengeProdukt);

        // Post-Dekrement: zuerst ausgeben, dann verringern
        System.out.println("Menge nach mengeProdukt-- (Post-Dekrement): " + mengeProdukt--);
        System.out.println("Jetzt ist die Menge: " + mengeProdukt);

        // Prä-Dekrement: zuerst verringern, dann ausgeben
        System.out.println("Menge nach --mengeProdukt (Prä-Dekrement): " + --mengeProdukt);
        System.out.println("Jetzt ist die Menge: " + mengeProdukt);
    }
}
