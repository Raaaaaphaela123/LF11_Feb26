package _01_woche._04_tag_oop_einstieg.oop_beispiel_1;

public class Tier {
    // Instanzvariablen
    private String name;
    private int alter;

    // Konstruktor
    public Tier(){
        this.name = "Hat noch keinen Namen";
    }

    // Konstruktor, der gleich einen Namen verlangt
    public Tier(String name, int alter){
        IO.println("Ich bin im Tier Konstruktor");
        this.name = name;
        this.alter = alter;
    }

    // Methode, die später überschrieben werden soll
    public void macheTon() {
        IO.println("Das Tier macht einen Ton");
    }

    // Getter & Setter generieren lassen -> alt + einfg
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
}
