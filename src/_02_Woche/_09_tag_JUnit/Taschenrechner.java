package _02_Woche._09_tag_JUnit;

public class Taschenrechner {

    public int addition (int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    // TODO: Subtraktion + Test

    // TODO: Multiplikation + Test

    public int teilen (int zahl1, int zahl2) {
        if (zahl2 == 0) {
         throw new IllegalArgumentException("Teilung durch 0 ist nicht erlaubt.");
        }
        return zahl1 / zahl2;
    }

}
