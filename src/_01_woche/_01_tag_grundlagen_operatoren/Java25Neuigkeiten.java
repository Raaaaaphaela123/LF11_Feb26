package _01_woche._01_tag_grundlagen_operatoren;

public class Java25Neuigkeiten {

    void main() {
        // Einfache Eingabe
        String name = IO.readln(("Wie heißt du? "));
        // Ausgabe
        IO.println("Hallo " + name + "!");

        int age = Integer.parseInt(IO.readln("Alter: "));
        System.out.println(age);
    }
}
